package service;

import model.FactoryNumberModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTest {

    private Service service;
    private FactoryNumberModel factoryNumberModel;

    @Before
    public void setUp(){
        service = new Service();
        factoryNumberModel = new FactoryNumberModel();
    }

    @Test
    public void processValuesTest(){
        factoryNumberModel.setTargetNumber(100);
        int count = 25;

        factoryNumberModel = service.processValues(factoryNumberModel, count);

        Assert.assertEquals(4, factoryNumberModel.getTargetNumber(),0);
        Assert.assertEquals(25, factoryNumberModel.getLargestFactoryNumber(),0);
    }
}
