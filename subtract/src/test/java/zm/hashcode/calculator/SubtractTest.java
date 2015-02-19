package zm.hashcode.calculator;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.calculator.Impl.SubtractImpl;

/**
 * Created by hashcode on 2015/02/19.
 */
public class SubtractTest {
    private Subtract subtract;

    @Before
    public void setUp() throws Exception {
        subtract = new SubtractImpl();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(5,subtract.subtract(10,5));

    }
}
