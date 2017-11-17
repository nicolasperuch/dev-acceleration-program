import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import service.SumSquareDifference;

public class SumSquareDifferenceTeste {
    SumSquareDifference sumSquareDifference;

    @Before
    public void setup(){
         sumSquareDifference = new SumSquareDifference();
    }

    @Test
    public void TestCalculateService(){
        Assert.assertEquals(sumSquareDifference.CalculateService(5),25);
    }

    @Test
    public void TestSumtotal(){
        Assert.assertEquals(sumSquareDifference.TotalSum(385,55),2640);
    }

}
