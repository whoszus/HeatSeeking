package cc.tinker;

import cc.tinker.EncoderUtils.RSAUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.interfaces.RSAPublicKey;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeatSeekingApplicationTests {

    @Test
    public void contextLoads() {
        try {
            Map keyMap = RSAUtils.initKey();
            //公钥
            String publicKey=RSAUtils.getPublicKey(keyMap);
            System.out.println(publicKey);

            String privateKey = RSAUtils.getPrivateKey(keyMap);
            System.out.println(privateKey);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void emailTest() {


    }


}
