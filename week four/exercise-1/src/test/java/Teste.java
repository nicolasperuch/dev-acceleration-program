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
    public void calculateAlphabeticalValueForEachLetterWhenLetterIsA() {
        Assert.assertEquals(1, service.calculateAlphabeticalValueForEachLetter(65),0);
    }

    @Test
    public void multiplyAlphabeticalNameValuePerPositionWhenPosition(){
        Assert.assertEquals(49714, service.multiplyAlphabeticalNameValuePerPosition(53,938),0);
    }

    @Test
    public void multiplyAlphabeticalNameValuePerPositionWhePositionIsNull(){
        Assert.assertEquals(0, service.multiplyAlphabeticalNameValuePerPosition(53,0),0);
    }

}
