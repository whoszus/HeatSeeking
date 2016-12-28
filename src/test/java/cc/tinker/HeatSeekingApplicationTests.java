package cc.tinker;

import cc.tinker.utils.EmailUtils;
import cc.tinker.utils.SendFromYahoo;
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

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeatSeekingApplicationTests {

//	@Autowired EmailUtils emailUtils ;


	@Test
	public void contextLoads() {
	}


	@Test
	public void emailTest(){
//		try {
//			emailUtils.sendHtmlEmail("whoszus@126.com","whoszus@yahoo.com","测试","hello");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	emailUtils.sendMessage();
		SendFromYahoo.sendEmailByYahoo("yeqinglyy@126.com",new Date().toString(),new Date().toString());




	}


}
