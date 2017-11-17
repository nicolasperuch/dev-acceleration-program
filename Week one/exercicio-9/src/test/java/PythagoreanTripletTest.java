import Service.PythagoreanTriplet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ilegra0267 on 17/11/17.
 */
public class PythagoreanTripletTest {
    private PythagoreanTriplet service;

    @Before
    public void serUp(){
        service = new PythagoreanTriplet();
    }

    @Test
    public void TestServicePythagorean(){
        Assert.assertEquals(service.Validete(1000), 31875000);
    }
}
