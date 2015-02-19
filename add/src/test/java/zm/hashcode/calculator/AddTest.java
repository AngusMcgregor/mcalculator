package zm.hashcode.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.calculator.Impl.AddImpl;

/**
 * Created by hashcode on 2015/02/19.
 */
public class AddTest {
    private Add add;
    @Before
    public void setUp() throws Exception {
        add = new AddImpl();


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAdd() throws Exception {

        Assert.assertEquals(7,add.add(2,5));

    }
}
