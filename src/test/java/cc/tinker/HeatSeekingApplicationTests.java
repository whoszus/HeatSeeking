package cc.tinker;

import cc.tinker.utils.EmailUtils;
import cc.tinker.utils.Encoder;
import cc.tinker.utils.SendFromYahoo;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeatSeekingApplicationTests {

//	@Autowired EmailUtils emailUtils ;


    @Test
    public void contextLoads() {

        //初始化密钥
        //生成密钥对
        Map<String, Object> keyMap = null;
        try {
            keyMap = Encoder.initKey();

            //公钥
            byte[] publicKey = Encoder.getPublicKey(keyMap);

            //私钥
            byte[] privateKey = Encoder.getPrivateKey(keyMap);
            System.out.println("公钥：/n" + Base64.encodeBase64String(publicKey));
            System.out.println("私钥：/n" + Base64.encodeBase64String(privateKey));

            System.out.println("================密钥对构造完毕,甲方将公钥公布给乙方，开始进行加密数据的传输=============");
            String str = "RSA密码交换算法";
            System.out.println("/n===========甲方向乙方发送加密数据==============");
            System.out.println("原文:" + str);
            //甲方进行数据的加密
            byte[] code1 = Encoder.encryptByPrivateKey(str.getBytes(), privateKey);
            System.out.println("加密后的数据：" + Base64.encodeBase64String(code1));
            System.out.println("===========乙方使用甲方提供的公钥对数据进行解密==============");
            //乙方进行数据的解密
            byte[] decode1 = Encoder.decryptByPublicKey(code1, publicKey);
            System.out.println("乙方解密后的数据：" + new String(decode1) + "/n/n");

            System.out.println("===========反向进行操作，乙方向甲方发送数据==============/n/n");

            str = "乙方向甲方发送数据RSA算法";

            System.out.println("原文:" + str);

            //乙方使用公钥对数据进行加密
            byte[] code2 = Encoder.encryptByPublicKey(str.getBytes(), publicKey);
            System.out.println("===========乙方使用公钥对数据进行加密==============");
            System.out.println("加密后的数据：" + Base64.encodeBase64String(code2));

            System.out.println("=============乙方将数据传送给甲方======================");
            System.out.println("===========甲方使用私钥对数据进行解密==============");

            //甲方使用私钥对数据进行解密
            byte[] decode2 = Encoder.decryptByPrivateKey(code2, privateKey);

            System.out.println("甲方解密后的数据：" + new String(decode2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void emailTest() {
/*
try {
emailUtils.sendHtmlEmail("whoszus@126.com","whoszus@yahoo.com","测试","hello");
} catch (Exception e) {
e.printStackTrace();
}
emailUtils.sendMessage();
SendFromYahoo.sendEmailByYahoo("yeqinglyy@126.com",new Date().toString(),new Date().toString());
*/


    }


}
