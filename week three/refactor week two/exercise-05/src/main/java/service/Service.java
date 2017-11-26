package service;

import business.ClientBusiness;
import model.Client;
import validation.InputValidation;

import java.util.Scanner;

public class Service {

    private final String SALARY = "salary";
    private final String DISCOUNT = "discount";
    private final String LOAN = "loan";


    private Client client;
    private InputValidation inputValidation;
    private ClientBusiness clientBusiness;

    public Service() {
        this.client = new Client();
        this.inputValidation = new InputValidation();
        this.clientBusiness = new ClientBusiness();
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
        }while(!inputValidation.isInputValid(value));

        return value;
    }

    public boolean loanProcess(){
        double processedSalary;

        processedSalary = clientBusiness.processSalaryLessDiscounts(client);
        if(clientBusiness.isValidLoan(client, processedSalary)){
            return true;
        }else{
            return false;
        }
    }



}
