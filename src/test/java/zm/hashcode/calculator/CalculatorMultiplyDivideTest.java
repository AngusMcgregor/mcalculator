package zm.hashcode.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zm.hashcode.calculator.config.AppConfig;

/**
 * Created by hashcode on 2015/02/19.
 */
public class CalculatorMultiplyDivideTest {private Calculator calculator;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calculator = (Calculator)ctx.getBean("calc");

    }

    @After
    public void tearDown() throws Exception {



    }

    @Test
    public void testMultiply() throws Exception {

        Assert.assertEquals(21, calculator.multiply(7, 3));


    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(10,calculator.divide(100,10));


    }

}
