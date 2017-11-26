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
    public void calculateValueWhithPercenTest(){

        Assert.assertEquals(service.calculateValueWhithPercen(5000),8650,2);
    }
    @Test
    public void calculateValueWhithPercenTest2(){
        Assert.assertEquals(service.calculateValueWhithPercen(1000),1730,2);
    }

}
