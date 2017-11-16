package service;

public class Fibonacci {
    private int previusValue;
    private int aux;
    private int sumValue;

    public int getSumValue() {
        return sumValue;
    }

    public void setSumValue(int sumValue) {
        this.sumValue = sumValue;
    }

    public Fibonacci() {
        this.previusValue = 1;
        this.aux = 0;
        this.sumValue = 0;
    }
    public int fibo(int currentValue) {
        aux = currentValue;
        currentValue +=  previusValue;
        previusValue = aux;
        isEvenValue(currentValue);
        return currentValue;
    }
    public boolean isEvenValue(int currentValue){
        if(currentValue % 2 == 0){
            sumValue+=currentValue;
            return true;
        }
        return false;
    }
}