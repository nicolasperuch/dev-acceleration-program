import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.Fibonacci;

import javax.xml.ws.Service;

/**
 * Created by ilegra0267 on 16/11/17.
 */
public class ServiceFibonacciTest {

    private Fibonacci service;

    @Before
    public void setup(){
        service = new Fibonacci();
    }

    @Test
    public void FibonacciTest(){
        Assert.assertEquals(service.calculateFibonnaci(1), 2,0);
    }

    @Test
    public void isEvenValueTrue(){

        Assert.assertTrue(String.valueOf(service.isEvenValue(8)),true);
    }

    @Test
    public void isEvenValueFalse(){

        Assert.assertFalse(String.valueOf(service.isEvenValue(5)),false);
    }
}
