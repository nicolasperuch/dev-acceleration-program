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
    public void testaFibonaccivalorCorreto(){
        Assert.assertEquals(service.fibo(1), 2,0);
    }
    @Test
    public void testaFibonacci(){
        Assert.assertEquals(service.fibo(2),3);
    }
    @Test
    public void testaFibonacciNegativo(){
        Assert.assertEquals(service.fibo(-2),-1);
    }
}
