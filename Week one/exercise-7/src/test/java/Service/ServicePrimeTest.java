package Service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServicePrimeTest {

    private ServicePrime service;

    @Before
    public void setUp(){
         service = new ServicePrime();
    }

    @Test
    public void isPrimeTestWhenValueisPrimeShouldReturnTrue(){
        Assert.assertTrue(service.isPrime(7));
    }

    @Test
    public void isPrimeTestWhenValueisPrimeWithPointShouldReturnTrue(){
        Assert.assertTrue(service.isPrime(7.0));
    }

    @Test
    public void isPrimeTestWhenValueisNegativePrimeShouldReturnTrue(){
        Assert.assertTrue(service.isPrime(-7));
    }

    @Test
    public void isPrimeTestWhenValueisNotPrimeShouldReturnFalse(){
        Assert.assertFalse(service.isPrime(4));
    }


}
