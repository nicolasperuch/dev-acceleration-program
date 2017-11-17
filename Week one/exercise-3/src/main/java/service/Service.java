package service;

public class Service {

    private double targetNumber = 600851475143.0;
    private double largestFactoryNumber = 0;

    public double getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(double targetNumber) {
        this.targetNumber = targetNumber;
    }

    public double getLargestFactoryNumber() {
        return largestFactoryNumber;
    }

    public void setLargestFactoryNumber(double largestFactoryNumber) {
        this.largestFactoryNumber = largestFactoryNumber;
    }

    public boolean isTargetNumberBiggerThanCount(int count){
        return count * count <= targetNumber;
    }

    public boolean isPrimeFactoryOfTargetNumber(int count){
        if (targetNumber % count == 0) {
            processValues(count);
            return true;
        }
        return false;
    }

    private void processValues(int count){
        targetNumber = targetNumber / count;
        largestFactoryNumber = count;
    }

    public void isTargetNumberBiggerThanLargestFactoryNumber() {
        if(targetNumber > largestFactoryNumber)
            largestFactoryNumber = targetNumber;
    }
}