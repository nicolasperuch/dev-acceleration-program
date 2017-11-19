package service;

import model.Client;

import java.util.Scanner;

public class Service {

    private final String SALARY = "salary";
    private final String DISCOUNT = "discount";
    private final String LOAN = "loan";

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


}
