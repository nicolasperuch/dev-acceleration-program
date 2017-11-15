package Service;

public class ServicePrime {

    private double sumOfAllPrimeNumbers;

    public ServicePrime() {
        this.sumOfAllPrimeNumbers = 0;
    }

    public double getSumOfAllPrimeNumbers() {
        return sumOfAllPrimeNumbers;
    }

    public void setSumOfAllPrimeNumbers(double sumOfAllPrimeNumbers) {
        this.sumOfAllPrimeNumbers = sumOfAllPrimeNumbers;
    }

    public void addValueToSumOfAllPrimeNumbers(double value) {
        System.out.println("Adding value: " + value);
        this.sumOfAllPrimeNumbers += value;
    }

    public boolean isPrime(double value){
        for(int i=2;i<value;i++) {
            if(value%i==0)
                return false;
        }
        return true;
    }

}
