package cc.tinker;

import cc.tinker.entity.*;
import cc.tinker.services.JZCaseService;
import cc.tinker.services.JZSyncService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeatSeekingApplicationTests {

    @Autowired
    JZCaseService jzService;

    @Autowired
    JZSyncService jzSyncService;

    @Test
    public void contextLoads() {
//        try {
//            Map keyMap = RSAUtils.initKey();
//            //公钥
//            String publicKey=RSAUtils.getPublicKey(keyMap);
//            System.out.println(publicKey);
//
//            String privateKey = RSAUtils.getPrivateKey(keyMap);
//            System.out.println(privateKey);
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        JZSyncService syncService = new JZSyncService();
//        syncService.syncSuspects();
//        TestJZDown testJZDown = new TestJZDown();
//        Thread thread = new Thread(testJZDown);
//        thread.start();


        //案件
        JzCaseDetailEntity jzCaseDetailEntity = new JzCaseDetailEntity();
        //警情
//        JzCaseInfoEntity jzCaseInfoEntity = new JzCaseInfoEntity();
//        jzSyncService.syncSuspects(jzCaseInfoEntity, "1011100012", new String[]{"*"}, "CREATEDTIME > to_date('2016-01-01','yyyy-MM-dd')");


        //字典
//        JzDictionaryEntity jzDictionaryEntity = new JzDictionaryEntity();
//        jzSyncService.syncSuspects(jzDictionaryEntity, "1011100124", new String[]{"*"}, "1=1");

        //省警综-案事件-犯罪嫌人 1011100042
//        JzCaseCriminalEntity jzCaseCriminalEntity = new JzCaseCriminalEntity();
//        jzSyncService.syncSuspects(jzCaseCriminalEntity, "1011100042", new String[]{"*"}, "1=1");

        //省警综-案事件-人员涉案情况
//        JzPersonCaseEntity jzPersonCaseEntity = new JzPersonCaseEntity();
//        jzSyncService.syncSuspects(jzPersonCaseEntity, "1011100020", new String[]{"*"}, "1=1");

        //报案、受害、当事、其人(jz_case_person)
        JzCasePersonEntity jzCasePersonEntity = new JzCasePersonEntity();
        jzSyncService.syncSuspects(jzCasePersonEntity, "1011100002", new String[]{"*"}, "1=1");





    }


    @Test
    public void emailTest() {


    }


}
