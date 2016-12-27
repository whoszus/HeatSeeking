package cc.tinker;

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
/**
 * Created by Tinker on 2016/12/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTest {
    @Test
    public void Test(){
        System.out.println("ceshi ");
    }

    @Test
    public void SpELTest(){
        String greetingExp = "Hello, #{ #user }";
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext();
        context.setVariable("user", "tinker");

        Expression expression = parser.parseExpression(greetingExp,
                new TemplateParserContext());
        System.out.println(expression.getValue(context, String.class));
    }

}