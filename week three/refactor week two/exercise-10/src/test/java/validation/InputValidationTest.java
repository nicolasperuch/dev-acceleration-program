package validation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InputValidationTest {

    private InputValidation inputValidation;

    @Before
    public void setUp(){
        inputValidation = new InputValidation();
    }

    @Test
    public void isInputValidWhenInputIsNegativeShouldReturnFalse(){
        Assert.assertFalse(inputValidation.isInputValid(-5));
    }

    @Test
    public void isInputValidWhenInputIsZeroShouldReturnTrue(){
        Assert.assertTrue(inputValidation.isInputValid(0));
    }

    @Test
    public void isInputValidWhenInputIsFourShouldReturnTrue(){
        Assert.assertTrue(inputValidation.isInputValid(4));
    }

    @Test
    public void isInputValidWhenInputIsTenShouldReturnFalse(){
        Assert.assertFalse(inputValidation.isInputValid(10));
    }
}
