package cc.tinker.web;

import cc.tinker.entry.encrypt.AES;
import cc.tinker.entry.encrypt.AESMsgCrypt;
import cc.tinker.entry.encrypt.RSA;
import cc.tinker.entry.encrypt.SHA1;
import cc.tinker.entry.exception.AESException;
import cc.tinker.entry.utils.DateTimeUtils;
import cc.tinker.entry.utils.EncryptMsg;
import cc.tinker.entry.utils.JSONParser;
import cc.tinker.entry.utils.XMLParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
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


    @Test
    public void AESTest(){
        // 需要加密的明文
        String encodingAesKey = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFG";
        String token = "pamtest";
        String timestamp = "1409304348";
        String nonce = "xxxxxx";
        String appId = "wxb11529c136998cb6";
        String replyXMLMsg = " 中文<xml><ToUserName><![CDATA[oia2TjjewbmiOUlr6X-1crbLOvLw]]></ToUserName><FromUserName><![CDATA[gh_7f083739789a]]></FromUserName><CreateTime>1407743423</CreateTime><MsgType><![CDATA[video]]></MsgType><Video><MediaId><![CDATA[eYJ1MbwPRJtOvIEabaxHs7TX2D-HV71s79GUxqdUkjm6Gs2Ed1KF3ulAOA9H1xG0]]></MediaId><Title><![CDATA[testCallBackReplyVideo]]></Title><Description><![CDATA[testCallBackReplyVideo]]></Description></Video></xml>";
        String replyJSONMsg = " 中文{\"Description\":\"testCallBackReplyVideo\",\"MediaId\":\"eYJ1MbwPRJtOvIEabaxHs7TX2D-HV71s79GUxqdUkjm6Gs2Ed1KF3ulAOA9H1xG0\",\"CreateTime\":\"1407743423\",\"Title\":\"testCallBackReplyVideo\",\"ToUserName\":\"oia2TjjewbmiOUlr6X-1crbLOvLw\",\"FromUserName\":\"gh_7f083739789a\",\"MsgType\":\"video\"}";

        AESMsgCrypt pc = null;
        try {
            pc = new AESMsgCrypt(token, encodingAesKey, appId);

            // 解密JSON消息
            String jsonEncrypt = pc.encryptJSONMsg(replyJSONMsg, timestamp, nonce);
            System.out.println("\n JSON 加密后: " + jsonEncrypt);
            EncryptMsg jsonEncryptMsg = JSONParser.extract(jsonEncrypt);
            String resultJson = pc.decryptMsg(jsonEncryptMsg.getMsgSignature(), timestamp, nonce,
                    jsonEncryptMsg.getEncrypt());
            System.out.println("\n JSON 解密后明文: " + resultJson);

            // 解密XML消息
            String xmlEncrypt = pc.encryptXMLMsg(replyXMLMsg, timestamp, nonce);
            System.out.println("\n XML 加密后: " + xmlEncrypt);
            EncryptMsg xmlEncryptMsg = XMLParser.extract(xmlEncrypt);
            String resultXml = pc.decryptMsg(xmlEncryptMsg.getMsgSignature(), timestamp, nonce, xmlEncryptMsg.getEncrypt());
            System.out.println("\n XML 解密后明文: " + resultXml);

            // URL地址验证
            String echoStr = pc.encrypt("测试URL地址签名test-url");
            String signature = SHA1.getSHA1(token, timestamp, nonce, echoStr);
            System.out.println("\n URL 参数加密后：" + echoStr);
            String resultEchoStr = pc.verifyUrl(signature, timestamp, nonce, echoStr);
            System.out.println("\n URL 参数解密后明文: " + resultEchoStr);
        } catch (AESException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void AESToolsTest(){
        String string = null;
        try {
            string = AES.aesEncryptString("IAmThePlainText", "16BytesLengthKey");
            System.out.println(string);
            System.out.println(AES.aesDecryptString(string, "16BytesLengthKey"));
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }



    }


}
