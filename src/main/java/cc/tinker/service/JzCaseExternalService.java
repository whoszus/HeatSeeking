package cc.tinker.service;

/**
 * Created by Eagle on 2017/6/20.
 */
import cc.tinker.entity.JzCaseDetailEntity;
import cc.tinker.entity.JzDictionaryEntity;
import cc.tinker.entity.JzPersonCaseEntity;
import cc.tinker.repostory.*;
import cc.tinker.utils.DateTimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JzCaseExternalService {

    @Autowired JzCaseCriminalRepository jzCaseCriminalRepository;
    @Autowired JzCaseDetailEntityRepository jzCaseDetailEntityRepository;
    @Autowired JzCaseInfoEntityRepository jzCaseInfoEntityRepository;
    @Autowired JzCasePersonRepository jzCasePersonRepository;
    @Autowired JzPersonCaseRepository jzPersonCaseRepository;
    @Autowired JzDictionaryRepository jzDictionaryRepository;

    @Autowired JZSyncService jzSyncService;

    private static final Logger logger = LoggerFactory.getLogger(JzCaseExternalService.class);

    public List<JzCaseDetailEntity> syncCaseDetailByCode (String caseCode){

        logger.info("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        return syncDetailWorker(caseCode);
    }


    private List<JzCaseDetailEntity> syncDetailWorker(String caseCode) {
        logger.warn("开始同步警综数据, 根据案件编号同步 案件编号："+caseCode);
        JzCaseDetailEntity jzCaseDetailEntity = new JzCaseDetailEntity();
        return jzSyncService.syncSuspects(jzCaseDetailEntity, "01010200019", new String[]{"*"}, "AJBH = '"+ caseCode+"'");
    }


    public  List<JzCaseDetailEntity>  syncDetail(String dateString) {
        logger.warn("开始同步警综数据 案情 从：" + dateString +"开始");
        JzCaseDetailEntity jzCaseDetailEntity = new JzCaseDetailEntity();
        return jzSyncService.syncSuspects(jzCaseDetailEntity, "01010200019", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

    public List<JzCaseDetailEntity> syncDetailByCondition(String condition){
        logger.warn("开始同步警综数据 案情 ,条件：" +condition);
        JzCaseDetailEntity jzCaseDetailEntity = new JzCaseDetailEntity();
        return  jzSyncService.syncSuspects(jzCaseDetailEntity, "01010200019", new String[]{"*"}, condition);
    }

}
