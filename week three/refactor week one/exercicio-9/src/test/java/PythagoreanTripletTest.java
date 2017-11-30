import business.PythagoreanTripletBusiness;
import service.Service;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ilegra0267 on 17/11/17.
 */
public class PythagoreanTripletTest {
    private PythagoreanTripletBusiness pythagoreanTripletBusiness;

    @Before
    public void serUp(){
        pythagoreanTripletBusiness = new PythagoreanTripletBusiness();
    }

    @Test
    public void potentiationTest(){
        int value = 10;

        Assert.assertEquals(100, pythagoreanTripletBusiness.potentiation(value),0);
    }

    @Test
    public void sumOfAllValuesTest(){
        int firstValue = 5;
        int secondValue = 10;
        int thirdValue = 11;

        Assert.assertEquals(26, pythagoreanTripletBusiness.sumOfAllValues(firstValue, secondValue, thirdValue),0 );
    }

    @Test
    public void calculatePythagoreanTripletValueTest(){
        int firstValue = 5;
        int secondValue = 10;
        int thirdValue = 11;

        Assert.assertEquals(550, pythagoreanTripletBusiness.calculatePythagoreanTripletValue(firstValue, secondValue, thirdValue),0 );
    }

}
