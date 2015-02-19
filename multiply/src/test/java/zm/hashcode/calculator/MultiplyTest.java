package zm.hashcode.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.calculator.Impl.MultiplyImpl;

/**
 * Created by hashcode on 2015/02/19.
 */
public class MultiplyTest {
    private Multiply multiply;
    @Before
    public void setUp() throws Exception {
        multiply = new MultiplyImpl();


    }

    @After
    public void tearDown() throws Exception {



    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(10,multiply.multiply(2,5));

    }
}
