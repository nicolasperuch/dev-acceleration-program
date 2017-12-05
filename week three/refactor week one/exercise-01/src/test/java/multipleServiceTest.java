import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.MultipleService;

public class multipleServiceTest {

    private MultipleService service;

    @Before
    public void setUp(){
        service = new MultipleService();
    }

    @Test
    public void isMultipleOf3TrueTest(){
        Assert.assertTrue(service.isMultipleOf3(6));
    }

    @Test
    public void isMultipleOf5TrueTest(){
        Assert.assertTrue(service.isMultipleOf5(10));
    }

    @Test
    public void isMultipleOf3FalseTest(){
        Assert.assertFalse(service.isMultipleOf3(10));
    }

    @Test
    public void isMultipleOf5FalseTest(){
        Assert.assertFalse(service.isMultipleOf5(13));
    }
}
