package cc.tinker.tasks;

import cc.tinker.entity.*;
import cc.tinker.service.JZSyncService;
import cc.tinker.utils.DateTimeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
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
    private JZSyncService jzSyncService;

    /**
     * 第一次启动
     */
    @PostConstruct
    @Async("tinkerJzSyncThread")
    public void initData(){
        logger.info("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -7);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncDetailWorker(dateString);
    }
    /**
     * 60分钟同步一次3天；
     */
    @Scheduled(initialDelay =300000, fixedDelay = 1000*60*60)
    @Async("tinkerJzSyncThread")
    public void syncJzCaseInfoDay() {
        logger.info("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        logger.info("30分钟同步最近两天警综数据任务，开始同步警综数据");
        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -2);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncDetailWorker(dateString);
    }

    /**
     * 10分钟同步一次当天；
     */
    @Scheduled(initialDelay =300000, fixedDelay = 1000*60*10)
    @Async("tinkerJzSyncThread")
    public void syncJzCaseInfoMin() {
        logger.info(Thread.currentThread().getName()+"当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        logger.info(Thread.currentThread().getName()+"5分钟同步最近两天警综数据任务，开始同步警综数据");
        Date date = new Date();
        logger.info("当前线程数"+Thread.activeCount());
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncDetailWorker(dateString);
    }




    /**
     * 每天3点同步3天人员
     */
    @Async("tinkerJzSyncThread")
    @Scheduled(cron = "* * 3 * * * ")
    public void syncJzCasePerson() {
        logger.info(Thread.currentThread().getName()+"当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -2);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncJzCaseCriminal(dateString);
        syncJzCasePerson(dateString);
        syncJzPersonCase(dateString);
    }

//    /**
//     * 每天一点同步15天
//     */
//    @Async("tinkerJzSyncThread")
//    @Scheduled(cron = "1 1 1 * * ? ")
//    public void syncJzCaseInfoWeek() {
//        logger.info(Thread.currentThread().getName()+"当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
//        logger.info(Thread.currentThread().getName()+"每天1:1:1 同步最近 7 天警综数据任务，开始同步警综数据");
//        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -10);
//        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
//        syncDetailWorker(dateString);
//    }


    /**
     * 每天6点同步10天 警情
     */
    @Async("tinkerJzSyncThread")
    @Scheduled(cron = "* * 6 * * ? ")
    public void syncJzCaseInfo() {
        logger.info(Thread.currentThread().getName()+"当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        logger.info(Thread.currentThread().getName()+"每天1:1:1 同步最近 2 天警综数据任务，开始同步警综数据");
        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -1);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncInfoWorker(dateString);
    }


    /**
     * 每周六 凌晨同步20天
     */
    @Async("tinkerJzSyncThread")
    @Scheduled(cron = "1 1 0 * * 6 ")
    public void syncJzCaseInfoTenDay() {
        logger.warn(Thread.currentThread().getName()+"当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
        logger.warn(Thread.currentThread().getName()+"同步 20 天警综数据任务，开始同步警综数据");
        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -20);
        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
        syncDetailWorker(dateString);
    }


    @Async("tinkerJzSyncThread")
    private void syncInfoWorker(String dateString) {
        JzCaseInfoEntity jzCaseInfoEntity = new JzCaseInfoEntity();
        logger.warn(Thread.currentThread().getName()+"开始同步警综数据 警情 从：" + dateString +"开始");
        jzSyncService.syncSuspects(jzCaseInfoEntity, "1011100012", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

    @Async("tinkerJzSyncThread")
    private void syncDetailWorker(String dateString) {
        logger.warn(Thread.currentThread().getName()+"开始同步警综数据 案情 从：" + dateString +"开始");
        JzCaseDetailEntity jzCaseDetailEntity = new JzCaseDetailEntity();
        jzSyncService.syncSuspects(jzCaseDetailEntity, "01010200019", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");

    }

    @Async("tinkerJzSyncThread")
    private void syncJzCasePerson(String dateString){
        logger.warn(Thread.currentThread().getName()+"开始同步警综数据 省警综-案事件-报案/受害/当事/其人  从：" + dateString +"开始");
        JzCasePersonEntity jzCasePersonEntity = new JzCasePersonEntity();
        jzSyncService.syncSuspects(jzCasePersonEntity, "1011100002", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

    @Async("tinkerJzSyncThread")
    private void syncJzPersonCase(String dateString){
        logger.warn(Thread.currentThread().getName()+"开始同步警综数据 省警综-案事件-人员涉案情况 从：" + dateString +"开始");
        JzPersonCaseEntity jzPersonCaseEntity = new JzPersonCaseEntity();
        jzSyncService.syncSuspects(jzPersonCaseEntity, "1011100020", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

    @Async("tinkerJzSyncThread")
    private void syncJzCaseCriminal(String dateString){
        logger.warn(Thread.currentThread().getName()+"开始同步警综数据 省警综-案事件-犯罪嫌人 从：" + dateString +"开始");
        JzCaseCriminalEntity jzCaseCriminalEntity = new JzCaseCriminalEntity();
        jzSyncService.syncSuspects(jzCaseCriminalEntity, "1011100042", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

}
