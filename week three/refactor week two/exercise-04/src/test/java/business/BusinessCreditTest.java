package business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BusinessCreditTest {

    private BusinessCredit businessCredit;

    @Before
    public void setUp(){
        this.businessCredit = new BusinessCredit();
    }

    @Test
    public void isValueBetween0And200ValueSmallerThan0ShouldReturnFalse(){
        double value = -1;

        Assert.assertFalse(businessCredit.isValueBetween0And200(value));
    }

    @Test
    public void isValueBetween0And200ValueBiggerThan200ShouldReturnFalse(){
        double value = 201;

        Assert.assertFalse(businessCredit.isValueBetween0And200(value));
    }

    @Test
    public void isValueBetween0And200ValueBetween0And200ShouldReturnTrue(){
        double value = 100;

        Assert.assertTrue(businessCredit.isValueBetween0And200(value));
    }

    @Test
    public void isValueBetween201And400ValueSmallerThan201ShouldReturnFalse(){
        double value = 200;

        Assert.assertFalse(businessCredit.isValueBetween201And400(value));
    }

    @Test
    public void isValueBetween201And400ValueBiggerThan400ShouldReturnFalse(){
        double value = 401;

        Assert.assertFalse(businessCredit.isValueBetween201And400(value));
    }

    @Test
    public void isValueBetween201And400ValueBetween201And400ShouldReturnTrue(){
        double value = 300;

        Assert.assertTrue(businessCredit.isValueBetween201And400(value));
    }

    @Test
    public void isValueBetween401And600ValueSmallerThan401ShouldReturnFalse(){
        double value = 400;

        Assert.assertFalse(businessCredit.isValueBetween401And600(value));
    }

    @Test
    public void isValueBetween401And600ValueBiggerThan600ShouldReturnFalse(){
        double value = 601;

        Assert.assertFalse(businessCredit.isValueBetween401And600(value));
    }

    @Test
    public void isValueBetween401And600ValueBetween401And600ShouldReturnTrue(){
        double value = 500;

        Assert.assertTrue(businessCredit.isValueBetween401And600(value));
    }

    @Test
    public void isValueBiggerThan600ValueSmallerThan600ShouldReturnFalse(){
        double value = 500;

        Assert.assertFalse(businessCredit.isValueBiggerThan600(value));
    }

    @Test
    public void isValueBiggerThan600ValueEqualsTo600ShouldReturnFalse(){
        double value = 600;

        Assert.assertFalse(businessCredit.isValueBiggerThan600(value));
    }

    @Test
    public void isValueBiggerThan600ValueBiggerThan600ShouldReturnTrue(){
        double value = 601;

        Assert.assertTrue(businessCredit.isValueBiggerThan600(value));
    }

    @Test
    public void calculateCreditWhenValueIs1000AndPercetageIs20(){
        double value = 1000;

        Assert.assertEquals(200,businessCredit.calculateCredit(value, 20),0);
    }

    @Test
    public void calculateCreditWhenValueIs1000AndPercetageIs30(){
        double value = 1000;

        Assert.assertEquals(300,businessCredit.calculateCredit(value, 30),0);
    }

    @Test
    public void calculateCreditWhenValueIs1000AndPercetageIs40(){
        double value = 1000;

        Assert.assertEquals(400,businessCredit.calculateCredit(value, 40),0);
    }

}
