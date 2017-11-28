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
    public void isPrimeTestWhenValueIsPrimeShouldReturnTrue(){
        Assert.assertTrue(service.isPrime(7));
    }

    @Test
    public void isPrimeTestWhenValueIsPrimeWithPointShouldReturnTrue(){
        Assert.assertTrue(service.isPrime(7.0));
    }

    @Test
    public void isPrimeTestWhenValueIsNegativePrimeShouldReturnTrue(){
        Assert.assertTrue(service.isPrime(-7));
    }

    @Test
    public void isPrimeTestWhenValueIsNotPrimeShouldReturnFalse(){
        Assert.assertFalse(service.isPrime(4));
    }


}
