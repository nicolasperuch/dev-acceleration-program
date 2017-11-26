package validation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InputValidationTest {

    private InputValidation inputValidation;

    @Before
    public void setUp() {
        inputValidation = new InputValidation();
    }

    @Test
    public void isInputValidWithValueBiggerThanZeroShouldReturnTrue() {
        Assert.assertTrue(inputValidation.isInputValid(10));
    }

    @Test
    public void isInputValidWithValueLowerThanZeroShouldReturnFalse() {
        Assert.assertFalse(inputValidation.isInputValid(-1));
    }


    @Test
    public void isInputValidWithValueEqualsToZeroShouldReturnFalse() {
        Assert.assertFalse(inputValidation.isInputValid(0));
    }

}
