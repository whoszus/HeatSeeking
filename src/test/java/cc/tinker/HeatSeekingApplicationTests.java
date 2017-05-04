package cc.tinker;

import cc.tinker.entity.*;
import cc.tinker.service.JZSyncService;
import cc.tinker.utils.DateTimeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeatSeekingApplicationTests {
    private static final Logger logger = LoggerFactory.getLogger(JZSyncService.class);

    @Autowired
    JZSyncService jzSyncService;

    @Test
    public void contextLoads() {
//        logger.warn("当前时间：" + DateTimeUtils.convertDateToStringByFormat(new Date()));
//        logger.warn("30分钟同步最近 30 天警综数据任务，开始同步警综数据");
//
//        Date date = DateTimeUtils.getDateByByDaysInt(new Date(), -30);
//        String dateString = DateTimeUtils.convertDateToStringByFormat(date, "yyyy-MM-dd");
//        syncInfoWorker(dateString);
//        syncDetailWorker(dateString);


        logger.info("测试通过");
    }


    @Test
    public void emailTest() {

        String dateString = DateTimeUtils.convertDateToStringByFormat(new Date(), "yyyy-MM-dd_HH-mm-ss");
        System.out.println(dateString);
    }



    private void syncInfoWorker(String dateString) {
        JzCaseInfoEntity jzCaseInfoEntity = new JzCaseInfoEntity();
        logger.warn("开始同步警综数据 警情 从：" + dateString +"开始");
        jzSyncService.syncSuspects(jzCaseInfoEntity, "1011100012", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");
    }

    private void syncDetailWorker(String dateString) {
        logger.warn("开始同步警综数据 案件 ");
        JzCaseDetailEntity jzCaseDetailEntity = new JzCaseDetailEntity();
        jzSyncService.syncSuspects(jzCaseDetailEntity, "01010200019", new String[]{"*"}, "CREATEDTIME > to_date('" + dateString + "','yyyy-MM-dd')");

    }


}
