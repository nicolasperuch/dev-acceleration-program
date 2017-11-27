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
        Assert.assertTrue(String.valueOf(service.isMultipleOf3(6)),true);
    }

    @Test
    public void isMultipleOf5TrueTest(){
        Assert.assertTrue(String.valueOf(service.isMultipleOf5(10)),true);
    }

    @Test
    public void isMultipleOf3FalseTest(){
        Assert.assertFalse(String.valueOf(service.isMultipleOf3(10)),false);
    }

    @Test
    public void isMultipleOf5FalseTest(){
        Assert.assertFalse(String.valueOf(service.isMultipleOf5(13)),false);
    }
}
