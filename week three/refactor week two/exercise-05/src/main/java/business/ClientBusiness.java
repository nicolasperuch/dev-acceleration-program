package business;

import model.Client;

public class ClientBusiness {

    private final double RANGE_MAX_LOAN_VALUE_PERCENTAGE = 0.3;

    public boolean isValidLoan(Client client, double processedSalary){
        return client.getLoan() <= (processedSalary * RANGE_MAX_LOAN_VALUE_PERCENTAGE);
    }

    public double processSalaryLessDiscounts(Client client){
        return client.getSalary() - client.getDiscount();
    }
}
