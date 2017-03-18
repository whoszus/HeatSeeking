package cc.tinker.tasks;

import cc.tinker.entity.JzCaseDetailEntity;
import cc.tinker.entity.JzCaseInfoEntity;
import cc.tinker.services.JZSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Tinker on 2017/3/18.
 */

@Component
public class AutoSyncJzTask {

    @Autowired
    JZSyncService jzSyncService;

    @Scheduled(cron = "0 0/30 * * * ?")
    public void  syncJzCaseDetail(){
        System.out.println("开始同步警综数据 案件 ");
        //案件
        JzCaseDetailEntity jzCaseDetailEntity = new JzCaseDetailEntity();
        jzSyncService.syncSuspects(jzCaseDetailEntity, "01010200019", new String[]{"*"}, "CREATEDTIME > to_date('2017-03-01','yyyy-MM-dd')");
    }


    @Scheduled(cron = "0 0/30 * * * ?")
    public void  syncJzCaseInfo(){
        System.out.println("开始同步警综数据 警情");
        JzCaseInfoEntity jzCaseInfoEntity = new JzCaseInfoEntity();
        jzSyncService.syncSuspects(jzCaseInfoEntity, "1011100012", new String[]{"*"}, "CREATEDTIME > to_date('2017-03-01','yyyy-MM-dd')");
    }



}
