package business;

import model.FactoryNumberModel;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactoryNumberBusinessTest {

    private FactoryNumberModel factoryNumberModel;
    private FactoryNumberBusiness factoryNumberBusiness;

    @Before
    public void setUp(){
        factoryNumberModel = new FactoryNumberModel();
        factoryNumberBusiness = new FactoryNumberBusiness();
    }

    @Test
    public void isTargetNumberBiggerThanCountSquaredWhenTargetNumberIsBiggerThanCountShouldReturnTrue(){
        factoryNumberModel.setTargetNumber(100);
        int count = 8;

        Assert.assertTrue(factoryNumberBusiness.isTargetNumberBiggerThanCountSquared(factoryNumberModel, count));
    }

    @Test
    public void isTargetNumberBiggerThanCountSquaredWhenTargetNumberIsEqualsToCountShouldReturnTrue(){
        factoryNumberModel.setTargetNumber(100);
        int count = 10;

        Assert.assertTrue(factoryNumberBusiness.isTargetNumberBiggerThanCountSquared(factoryNumberModel, count));
    }

    @Test
    public void isTargetNumberBiggerThanCountSquaredWhenTargetNumberIsSmallerCountShouldReturnFalse(){
        factoryNumberModel.setTargetNumber(68);
        int count = 10;

        Assert.assertFalse(factoryNumberBusiness.isTargetNumberBiggerThanCountSquared(factoryNumberModel, count));
    }
}
