package cc.test;

/**
 * Created by Tinker on 2017/3/8.
 */


import java.util.List;
import java.util.Map;

import com.founderinternation.datacenter.datadownload.client.DataDownLoadFactory;

public class TestJZDown implements Runnable {
    private int countz = 0;

    public int getCountz() {
        return countz;
    }

    public void setCountz(int countz) {
        this.countz = countz;
    }

    @Override
    public void run() {

        System.out.println("线程" + countz + "执行开始......");
        DataDownLoadFactory dataDownLoadFactory = DataDownLoadFactory.getInstance();
        String methodName = "Query_DownloadData";
        String tableCode = "";
        String senderId = "";
        //sql查询条件
        String condition = "1=1";
        //字段
        String[] fileds = {"*"};
        //下载总数据量
        int totalCount = 500;

        int waittime = 0;//大于等于0为等待wait ms ，等于 0 为不等待
        String result = dataDownLoadFactory.getFromRemote
                ("68.32.96.52", "8212", "Query_DownloadData", "1011100012", "A749B5BC-9148-48D3-8FE0-F2CD4AF62CCE", condition, fileds, totalCount, 0);
        System.out.println(result);
        System.out.println("isclose:" + dataDownLoadFactory.isClose());
        int count = 0;
        long times = System.currentTimeMillis();
        if ("success".equals(result)) {
            if (dataDownLoadFactory.getResultQueue() != null || !dataDownLoadFactory.isClose()) {
                while (!dataDownLoadFactory.getResultQueue().isEmpty() || !dataDownLoadFactory.isClose()) {
                    Object[] resultstr = dataDownLoadFactory.getResultQueue().poll();
                    if (resultstr == null) {
                        //休息1秒
                        try {
                            System.out.println("线程" + countz + "等待1s......");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        count++;
                    }
                    System.out.println("线程" + countz + ":执行第" + count * 10000 + "条" + ",   总耗时" + (System.currentTimeMillis() - times) + "ms");
                }
            }
        }
        long times01 = System.currentTimeMillis();

        dataDownLoadFactory.closeSession();
        System.out.println("线程" + countz + "执行结束......关闭耗时间：" + (System.currentTimeMillis() - times01) + "	关闭时间点：" + (System.currentTimeMillis() - times) + "ms");


    }

}
