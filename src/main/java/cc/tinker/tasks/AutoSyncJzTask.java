package cc.tinker.tasks;

import cc.tinker.entity.*;
import cc.tinker.service.JZSyncService;
import cc.tinker.utils.DateTimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by Tinker on 2017/3/18.
 */

@Component
public class AutoSyncJzTask {

    private static final Logger logger = LoggerFactory.getLogger(JZSyncService.class);

    @Autowired
    JZSyncService jzSyncService;

//
//    /**
//     * 第一次启动
//     */
//    @PostConstruct
//    public void initData(){
//        logger.info("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
//        logger.info("启动同步服务，同步全年警综数据...........");
//
//        String dateString = "2017-01-01";
//        syncInfoWorker(dateString);
//        syncDetailWorker(dateString);
//        syncJzCaseCriminal(dateString);
//        syncJzCasePerson(dateString);
//        syncJzPersonCase(dateString);
//    }
//
    /**
     * 第一次启动
     */
    @PostConstruct
    public void initData(){

        logger.info("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));

        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -1);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncDetailWorker(dateString);
        syncInfoWorker(dateString);
        syncJzCaseCriminal(dateString);
        syncJzCasePerson(dateString);
        syncJzPersonCase(dateString);

    }
    /**
     * 30分钟同步一次2天；
     */
    @Scheduled(initialDelay =300000, fixedDelay = 1000*60*30)
    public void syncJzCaseInfoDay() {
        logger.info("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        logger.info("30分钟同步最近两天警综数据任务，开始同步警综数据");
        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -2);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncInfoWorker(dateString);
        syncDetailWorker(dateString);
        syncJzCaseCriminal(dateString);
        syncJzCasePerson(dateString);
        syncJzPersonCase(dateString);
    }

    /**
     * 每天一点同步15天
     */
    @Scheduled(cron = "1 1 1 * * ? ")
    public void syncJzCaseInfoWeek() {

        logger.info("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        logger.info("每天1:1:1 同步最近 7 天警综数据任务，开始同步警综数据");

        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -15);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncInfoWorker(dateString);
        syncDetailWorker(dateString);
    }


    /**
     * 每2天同步一个月
     */
    @Scheduled(cron = "2 2 2 1/3 * ?")
    public void syncJzCaseInfoTenDay() {

        logger.warn("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        logger.warn("每三天的 2:2:2 同步 30 天警综数据任务，开始同步警综数据");

        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -60);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncInfoWorker(dateString);
        syncDetailWorker(dateString);
    }


    private void syncInfoWorker(String dateString) {
        JzCaseInfoEntity jzCaseInfoEntity = new JzCaseInfoEntity();
        logger.warn("开始同步警综数据 警情 从：" + dateString +"开始");
        jzSyncService.syncSuspects(jzCaseInfoEntity, "1011100012", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

    private void syncDetailWorker(String dateString) {
        logger.warn("开始同步警综数据 案情 从：" + dateString +"开始");
        JzCaseDetailEntity jzCaseDetailEntity = new JzCaseDetailEntity();
        jzSyncService.syncSuspects(jzCaseDetailEntity, "01010200019", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");

    }

    private void syncJzCasePerson(String dateString){
        logger.warn("开始同步警综数据 省警综-案事件-报案/受害/当事/其人  从：" + dateString +"开始");
        JzCasePersonEntity jzCasePersonEntity = new JzCasePersonEntity();
        jzSyncService.syncSuspects(jzCasePersonEntity, "1011100002", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

    private void syncJzPersonCase(String dateString){
        logger.warn("开始同步警综数据 省警综-案事件-人员涉案情况 从：" + dateString +"开始");
        JzPersonCaseEntity jzPersonCaseEntity = new JzPersonCaseEntity();
        jzSyncService.syncSuspects(jzPersonCaseEntity, "1011100020", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

    private void syncJzCaseCriminal(String dateString){
        logger.warn("开始同步警综数据 省警综-案事件-犯罪嫌人 从：" + dateString +"开始");
        JzCaseCriminalEntity jzCaseCriminalEntity = new JzCaseCriminalEntity();
        jzSyncService.syncSuspects(jzCaseCriminalEntity, "1011100042", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

}
