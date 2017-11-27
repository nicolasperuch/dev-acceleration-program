import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.DivisibleService;

public class DivisibleServiceTest {
    private DivisibleService service;

    @Before
    public void setUp(){
        service = new DivisibleService();
    }

    @Test
    public void isDivisibleByAllTrue(){
        Assert.assertTrue(String.valueOf(service.isDivisibleByAll(465585120)), true);
    }

    @Test
    public void isDivisibleByAllFalse(){
        Assert.assertFalse(String.valueOf(service.isDivisibleByAll(465585855)), false);
    }
}
