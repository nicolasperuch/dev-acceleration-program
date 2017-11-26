package validation;

import model.Terrain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InputValidationTest {

    InputValidation inputValidation;
    Terrain terrain;

    @Before
    public void setUp(){
        inputValidation = new InputValidation();
        terrain = new Terrain();
    }

    @Test
    public void isTotalAreaValidValueShouldReturnTrue(){
        Assert.assertTrue(inputValidation.isTotalArea("total"));
    }

    @Test
    public void isTotalAreaInvalidValueShouldReturnFalse(){
        Assert.assertFalse(inputValidation.isTotalArea("builted"));
    }

    @Test
    public void validateTotalAreaValidValueShouldReturnTrue(){
        Assert.assertTrue(inputValidation.validateTotalArea(15));
    }

    @Test
    public void validateTotalAreaInvalidValueShouldReturnFalse(){
        Assert.assertFalse(inputValidation.validateTotalArea(-5));
    }

    @Test
    public void validateBuiltedAreaWhenThereIsNoBuiltedAreaShouldReturnTrue(){
        terrain.setTotalArea(100);
        Assert.assertTrue(inputValidation.validateBuiltedArea(0, terrain));
    }

    @Test
    public void validateBuiltedAreaWhenThereIsNegativeBuiltedAreaShouldReturnFalse(){
        terrain.setTotalArea(100);
        Assert.assertFalse(inputValidation.validateBuiltedArea(-5, terrain));
    }

    @Test
    public void validateBuiltedAreaWhenBuiltedAreaIsBiggerThanTotalAreaShouldReturnFalse(){
        terrain.setTotalArea(100);
        Assert.assertFalse(inputValidation.validateBuiltedArea(101, terrain));
    }

    @Test
    public void validateBuiltedAreaWhenBuiltedIsAFloatingValueShouldReturnTrue(){
        terrain.setTotalArea(100);
        Assert.assertTrue(inputValidation.validateBuiltedArea(55.87515, terrain));
    }


}
