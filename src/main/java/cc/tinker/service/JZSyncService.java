package cc.tinker.service;

import cc.tinker.utils.DateTimeUtils;
import com.founderinternation.datacenter.datadownload.client.DataDownLoadFactory;
import cc.tinker.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class JZSyncService {

    private static final Logger logger = LoggerFactory.getLogger(JZSyncService.class);

    @Value("${jzSyncParam.senderId}")
    private  String senderId ;
    //    private static String senderId = "E058ADAE-7E07-4398-93BE-FC8931DD31A4";
    @Value("${jzSyncParam.methodName}")
    private  String methodName;
    @Value("${jzSyncParam.ip}")
    private  String ip;
    @Value("${jzSyncParam.port}")
    private  String port ;
    private int totalCount =-1 ;
    @Autowired
    JZCaseService jzService;
    /**
     * 同步警综嫌疑人
     */
    @SuppressWarnings("unchecked")
    @Async
    public <X> List<X> syncSuspects(X x, String tableCode, String[] fileds, String condition) {
        int waitTime = 0;

        logger.info(Thread.currentThread().getName()+ "开始同步"+ip);
        List<X> caseLists = null;
        long startTime = System.currentTimeMillis();
        DataDownLoadFactory dataDownLoadFactory = DataDownLoadFactory.getInstance();

        try {
            String result = dataDownLoadFactory.getFromRemote(ip, port, methodName, tableCode, senderId, condition, fileds, totalCount, 0);
            if ("success".equals(result)) {
            if (dataDownLoadFactory.getResultQueue() != null || !dataDownLoadFactory.isClose()) {
                //当返回队列不为空或者链接未关闭继续等待接收数据
                while (!dataDownLoadFactory.getResultQueue().isEmpty() || !dataDownLoadFactory.isClose()) {
                    Object[] resultstr = dataDownLoadFactory.getResultQueue().poll();
                    if (resultstr == null) {
                        try {
                            Thread.currentThread().sleep(2000);
                            waitTime+=2;
                            logger.info(Thread.currentThread().getName()+ "等待返回中...."+waitTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {//案件数据解析
                        logger.info(Thread.currentThread().getName()+"本次同步等待警综数据返回时间：" + waitTime);
                        waitTime = 0;
                        Object kp = resultstr[0];
//                        logger.info(kp.toString());
                        LinkedHashMap linkedHashMap = (LinkedHashMap) resultstr[0];
                        Iterator iterator = linkedHashMap.entrySet().iterator();
                        String[] strings = new String[286];
                        List<Map> list = new ArrayList();
                        int i = 0;
                        while (iterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) iterator.next();
                            strings[i] = (String) entry.getKey();
                            i++;
                        }
                        Object valueObj = resultstr[1];
                        List<Object[]> realValue = (List<Object[]>) valueObj;
                        for (Object[] v : realValue) {
                            int j = 0;
                            Map map = new HashMap();
                            for (Object o : v) {
                                map.put(strings[j], o);
                                j++;
                            }
                            list.add(map);
                        }
                        int k = 0;
                        List<X> caseList = new ArrayList<>();
                        for (Map map : list) {
                            try {
                                Object newInstance = x.getClass().newInstance();
                                Iterator iterator1 = map.entrySet().iterator();
                                while (iterator1.hasNext()) {
                                    Map.Entry entry = (Map.Entry) iterator1.next();
                                    StringBuffer stringbf = new StringBuffer();
                                    Matcher m = Pattern.compile("([a-z]|\\_[a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher((CharSequence) entry.getKey());
                                    while (m.find()) {
                                        m.appendReplacement(stringbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
                                    }
                                    String s = m.appendTail(stringbf).toString();
                                    String name = s.replaceAll("_", "");
                                    String nameCopy = new String(name);

                                    String fieldName = nameCopy.replaceFirst(nameCopy.substring(0, 1), nameCopy.substring(0, 1).toLowerCase());

                                    if (entry.getValue() != null) {
                                        String type = null;
                                        try {
                                            type = newInstance.getClass().getDeclaredField(fieldName).getGenericType().toString();
                                            Method method = null;
                                            switch (type) {
                                                case "class java.lang.String":
                                                    method = newInstance.getClass().getMethod("set" + name, String.class);
                                                    method.invoke(newInstance, entry.getValue());
                                                    break;
                                                case "class java.lang.Integer":
                                                    method = newInstance.getClass().getMethod("set" + name, Integer.class);
                                                    if (entry.getValue() instanceof Integer) {
                                                        method.invoke(newInstance, entry.getValue());
                                                    } else if (entry.getValue() instanceof BigDecimal) {
                                                        method.invoke(newInstance, Integer.valueOf(((BigDecimal) entry.getValue()).intValue()));
                                                    } else if (entry.getValue() instanceof Long) {
                                                        method.invoke(newInstance, Integer.valueOf(((Long) entry.getValue()).intValue()));
                                                    } else {
                                                        logger.error(Thread.currentThread().getName()+"找不到对应类型映射 " + strings[i]);
                                                    }
                                                    break;
                                                case "class java.util.Date":
                                                    method = newInstance.getClass().getMethod("set" + name, Date.class);
                                                    method.invoke(newInstance, entry.getValue());
                                                    break;
                                                case "class java.lang.Double":
                                                    method = newInstance.getClass().getMethod("set" + name, Double.class);
                                                    if (entry.getValue() instanceof BigDecimal) {
                                                        method.invoke(newInstance, Double.valueOf(((BigDecimal) entry.getValue()).doubleValue()));
                                                    } else {
                                                        method.invoke(newInstance, entry.getValue());
                                                    }
                                                    break;
                                                case "class java.sql.Timestamp":
                                                    method = newInstance.getClass().getMethod("set" + name, Timestamp.class);
                                                    method.invoke(newInstance, entry.getValue());
                                                    break;
                                            }
                                            caseList.add((X) newInstance);
                                        } catch (NoSuchFieldException e) {
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e) {
                                            e.printStackTrace();
                                        } catch (IllegalAccessException e) {
                                            e.printStackTrace();
                                        } catch (InvocationTargetException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                            } catch (InstantiationException e) {
                                e.printStackTrace();
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }
                        if (x instanceof JzCaseDetailEntity) {
                            jzService.saveCaseDetailList((List<JzCaseDetailEntity>) caseList);
//                            Iterator var3 = caseList.iterator();
//                            while(var3.hasNext()) {
//                                JzCaseDetailEntity entity = (JzCaseDetailEntity) var3.next();
//                                logger.info("从警综同步过来的警综系统编号: " +entity.getAjbh() + " 案件编号: " + entity.getSystemid());
//                            }
                        } else if (x instanceof JzCaseInfoEntity) {
                            jzService.saveCaseInfoList((List<JzCaseInfoEntity>) caseList);
                        } else if (x instanceof JzDictionaryEntity) {
                            jzService.saveDictionaryList((List<JzDictionaryEntity>) caseList);
                        } else if (x instanceof JzCaseCriminalEntity) {
                            jzService.saveCaseCriminalList((List<JzCaseCriminalEntity>) caseList);
                        } else if (x instanceof JzCasePersonEntity) {
                            jzService.saveCasePersonList((List<JzCasePersonEntity>) caseList);
                        } else if (x instanceof JzPersonCaseEntity) {
                            jzService.savePersonCaseList((List<JzPersonCaseEntity>) caseList);
                        }
                        logger.info(Thread.currentThread().getName()+"从警综获取得" + list.size()+"条数据！");
                        caseLists = caseList;
                        caseList = null;
                    }
                }
            }
        }
            dataDownLoadFactory.closeSession();
            logger.info(Thread.currentThread().getName()+"总查询时间" + (System.currentTimeMillis() - startTime));
            logger.warn(Thread.currentThread().getName()+"同步结束，当前时间"+ DateTimeUtils.convertDateToStringByFormat(new Date()));
        }catch (Exception e){
            logger.error(Thread.currentThread().getName()+"连不上当前ip" + this.ip);
            logger.error(Thread.currentThread().getName()+"Exception : " + e);
            logger.error(Thread.currentThread().getName()+"getStackTrace" + e.getMessage(),e);
        }

        return caseLists;
    }

}
