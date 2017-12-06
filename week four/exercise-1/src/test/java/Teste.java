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
    public void teste1(){
        Assert.assertEquals(53, service.calculateNameValue("COLIN"),0);
    }
}
