package zm.hashcode.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.calculator.Impl.DivideImpl;

/**
 * Created by hashcode on 2015/02/19.
 */
public class DivideTest {
    private Divide divide;
    @Before
    public void setUp() throws Exception {
        divide = new DivideImpl();


    }

    @After
    public void tearDown() throws Exception {
        Assert.assertEquals(10, divide.divide(100,10));

    }

    @Test
    public void testDivide() throws Exception {


    }
}
