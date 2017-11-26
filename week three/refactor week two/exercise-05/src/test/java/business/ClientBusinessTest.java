package business;

import model.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientBusinessTest {

    private final double RANGE_MAX_LOAN_VALUE_PERCENTAGE = 0.3;

    private ClientBusiness clientBusiness;
    private Client client;

    @Before
    public void setUp(){
        clientBusiness = new ClientBusiness();
        client = new Client();
    }

    @Test
    public void isValidLoanWithProcessedValue1000AndLoan300ShouldReturnTrue(){
        double processedSalary = 1000;
        client.setLoan(300);

        clientBusiness.isValidLoan(client, processedSalary);
    }

    @Test
    public void isValidLoanWithProcessedValue1000AndLoan301ShouldReturnFalse(){
        double processedSalary = 1000;
        client.setLoan(301);

        clientBusiness.isValidLoan(client, processedSalary);
    }

    @Test
    public void processSalaryLessDiscountTest(){
        client.setSalary(1300);
        client.setDiscount(300);

        Assert.assertEquals(1000, clientBusiness.processSalaryLessDiscounts(client), 0);
    }

}
