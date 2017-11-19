package service;

import model.Client;

import java.util.Scanner;

public class Service {

    private final String SALARY = "salary";
    private final String DISCOUNT = "discount";
    private final String LOAN = "loan";
    private final double RANGE_MAX_LOAN_VALUE_PERCENTAGE = 0.3;

    private Client client;

    public Service() {
        this.client = new Client();
    }

    public void insertData(){
        client.setSalary(insert(SALARY));
        client.setDiscount(insert(DISCOUNT));
        client.setLoan(insert(LOAN));
    }

    private double insert(String field){
        double value = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.printf("Insert your " + field + ": ");
            value = input.nextDouble();
        }while(!isInputValid(value));

        return value;
    }

    private boolean isInputValid(double value){
        return value > 0;
    }

    public void loanProcess(){
        double processedSalary;

        processedSalary = processSalary();
        if(isValidLoan(processedSalary)){
            System.out.println("Aproved Loan");
        }else{
            System.out.println("Loan denied");
        }
    }

    private double processSalary(){
        return client.getSalary() - client.getDiscount();
    }

    private boolean isValidLoan(double processedSalary){
        return client.getLoan() <= (processedSalary * RANGE_MAX_LOAN_VALUE_PERCENTAGE);
    }
}
