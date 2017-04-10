package cc.tinker.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Tinker on 2017/3/18.
 */

@Component
public class AutoSyncJzTask {

    @Autowired

    @Scheduled(cron = "0 0/30 * * * ?")
    public void  syncJzCaseDetail(){

    }


    @Scheduled(cron = "0 0/30 * * * ?")
    public void  syncJzCaseInfo(){

    }



}
