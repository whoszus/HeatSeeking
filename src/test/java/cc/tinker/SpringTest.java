package cc.tinker;

import cc.tinker.EncoderUtils.RSAUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.*;
import java.util.Map;

/**
 * Created by Tinker on 2016/12/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTest {
    @Test
    public void Test() {
        System.out.println("ceshi ");
    }

    @Test
    public void SpELTest() {
        String greetingExp = "Hello, #{ #user }";
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext();
        context.setVariable("user", "tinker");

        Expression expression = parser.parseExpression(greetingExp,
                new TemplateParserContext());
        System.out.println(expression.getValue(context, String.class));
    }


    @Test
    public void RSATest() {
        KeyPairGenerator generator = null;
        try {
            Map<String, Object> keyMap = RSAUtils.generateKeyPair();
            String publicKey = RSAUtils.getPublicKey(keyMap);
            String privateKey = RSAUtils.getPrivateKey(keyMap);


            System.out.println("公钥："+publicKey);
            System.out.println("私钥："+privateKey );

            System.err.println("私钥加密——公钥解密");
            String source = "这是一行测试RSA数字签名的无意义文字";
            System.out.println("原文字：\r\n" + source);
            byte[] data = source.getBytes();
            byte[] encodedData = RSAUtils.encryptByPrivateKey(data, privateKey);
            System.out.println("加密后：\r\n" + new String(encodedData));
            byte[] decodedData = RSAUtils.decryptByPublicKey(encodedData, publicKey);
            String target = new String(decodedData);
            System.out.println("解密后: \r\n" + target);
            System.err.println("私钥签名——公钥验证签名");
            String sign = RSAUtils.sign(encodedData, privateKey);
            System.err.println("签名:\r" + sign);
            boolean status = RSAUtils.verify(encodedData, publicKey, sign);
            System.err.println("验证结果:\r" + status);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}