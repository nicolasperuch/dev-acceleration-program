import Service.Service;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SericeTest {

   private Service service;

    @Before
    public void setUp(){
        service = new Service();
    }

    @Test
    public void isPrimeTestWhenValueisPrimeShouldReturnTrue(){
        Assert.assertEquals(service.Valor(5000),8650,2);
    }
}
