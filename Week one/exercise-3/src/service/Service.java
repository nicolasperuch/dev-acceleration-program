package service;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private double largestFactoryNumber;
    private List<Double> primeNumbers;

    public Service() {
        this.primeNumbers = new ArrayList<>();
    }

    public void addPrimeNumberToList(double value){
        System.out.println("Adding value: " + value);
        primeNumbers.add(value);
    }

    public void findTheLargestFactoryNumber(double TARGET_NUMBER) {
        System.out.println("List prime numbers size: " + primeNumbers.size());
        for (double value: primeNumbers) {
            if(TARGET_NUMBER % value == 0)
                largestFactoryNumber = value;
        }



    }

    public boolean isPrime(double value){
        for(int i=2;i<value;i++) {
            if(value%i==0)
                return false;
        }
        return true;
    }

    public double getLargestFactoryNumber() {
        return largestFactoryNumber;
    }

    public void setLargestFactoryNumber(int largestFactoryNumber) {
        this.largestFactoryNumber = largestFactoryNumber;
    }
}
