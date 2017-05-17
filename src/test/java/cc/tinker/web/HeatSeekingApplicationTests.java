package cc.tinker.web;

import cc.tinker.entry.encrypt.RSA;
import cc.tinker.entry.utils.DateTimeUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeatSeekingApplicationTests {

    static String publicKey;

    static String privateKey;

    static {
        try {
            Map<String, Object> keyMap = RSA.genKeyPair();
            publicKey = RSA.getPublicKey(keyMap);
            privateKey = RSA.getPrivateKey(keyMap);
            System.err.println("公钥: \n\r" + publicKey);
            System.err.println("私钥： \n\r" + privateKey);

            //Base64Util.decodeToFile(Base64Util.filePath("/home", "d://rsa", "publicKey.rsa"), publicKey);
            //Base64Util.decodeToFile(Base64Util.filePath("/home", "d://rsa", "privateKey.rsa"), privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void contextLoads() {
//
        System.out.println("测试成功");

    }


    @Test
    public void emailTest() {

        String dateString = DateTimeUtils.convertDateToStringByFormat(new Date(), "yyyy-MM-dd_HH-mm-ss");
        System.out.println(dateString);
    }

    @Test
    public void rsaTest() {
//        System.err.println("公钥加密——私钥解密");
//        String source = "静夜思-床前看月光，疑是地上霜。抬头望山月，低头思故乡。";
//        System.out.println("\r加密前文字：\r\n" + source);
//        byte[] data = source.getBytes();
//        byte[] encodedData = new byte[0];
//        try {
//            encodedData = RSA.encryptByPublicKey(data, publicKey);
//
//            System.out.println("加密后文字：\r\n" + new String(encodedData));
//            System.out.println("bs::" + Base64Util.encode(encodedData));
//            byte[] decodedData = RSA.decryptByPrivateKey(encodedData, privateKey);
//            String target = new String(decodedData);
//            System.out.println("解密后文字: \r\n" + target);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        try {

            System.err.println("私钥加密——公钥解密");
            String source1 = "这是一行测试RSA数字签名的无意义文字";
            System.out.println("原文字：\r\n" + source1);
            byte[] data1 = source1.getBytes();
            byte[] encodedData1 = RSA.encryptByPrivateKey(data1, privateKey);
            String encodedData1String = new String(encodedData1);
            System.out.println("加密后：\r\n" + new String(encodedData1));
            byte[] decodedData1 = RSA.decryptByPublicKey(encodedData1String.getBytes(), publicKey);
            String target = new String(decodedData1);
            System.out.println("解密后: \r\n" + target);
            System.err.println("私钥签名——公钥验证签名");
            String sign = RSA.sign(encodedData1, privateKey);
            System.err.println("签名:\r" + sign);
            boolean status = RSA.verify(encodedData1, publicKey, sign);
            System.err.println("验证结果:\r" + status);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
