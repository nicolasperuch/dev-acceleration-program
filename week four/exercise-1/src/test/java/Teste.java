import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.Service;

public class Teste {

    private Service service;

    @Before
    public void setUp(){
        service = new Service();
    }

    @Test
    public void calculateNameValueWhenNameExists(){
        Assert.assertEquals(53, service.calculateNameValue("COLIN"),0);
    }

    @Test
    public void calculateNameValueWhenNameIsEmpty(){
        Assert.assertEquals(0, service.calculateNameValue(""),0);
    }

    @Test
    public void multiplyAlphabeticalNameValuePerPositionTest(){
        Assert.assertEquals(53, service.multiplyAlphabeticalNameValuePerPosition(53,1),0);
    }
}
