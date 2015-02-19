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
public class CalculatorAddSubtractTest {
    private Calculator calculator;
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
    public void testAdd() throws Exception {

        Assert.assertEquals(10,calculator.add(7,3));


    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(4,calculator.substract(7,3));


    }
}
