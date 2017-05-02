package cc.tinker;

import cc.tinker.entity.*;
import cc.tinker.utils.DateTimeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeatSeekingApplicationTests {


    @Test
    public void contextLoads() {
//
        System.out.println("测试成功");

    }


    @Test
    public void emailTest() {

        String dateString  = DateTimeUtils.convertDateToStringByFormat(new Date(),"yyyy-MM-dd_HH-mm-ss");
        System.out.println(dateString);
    }


}
