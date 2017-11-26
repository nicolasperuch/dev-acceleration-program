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
    public void isValidBirthdayWithValidDayAndMonthShouldReturnTrue(){
        Assert.assertTrue(inputValidation.isValidBirthday("10/10"));
    }

    @Test
    public void isValidBirthdayWithValidDayAndInvalidMonthShouldReturnFalse(){
        Assert.assertFalse(inputValidation.isValidBirthday("10/13"));
    }

    @Test
    public void isValidBirthdayWithInvalidDayAndValidMonthShouldReturnFalse(){
        Assert.assertFalse(inputValidation.isValidBirthday("31/02"));
    }

    @Test
    public void isValidBirthdayWithInvalidDayAndMonthShouldReturnFalse(){
        Assert.assertFalse(inputValidation.isValidBirthday("31/13"));
    }
}
