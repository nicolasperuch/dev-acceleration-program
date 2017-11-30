package service;

import model.FactoryNumberModel;

public class Service {

    private FactoryNumberModel factoryNumberModel;

    public Service() {
        this.factoryNumberModel = new FactoryNumberModel();
    }

    public boolean isTargetNumberBiggerThanCount(int count){
        return count * count <= factoryNumberModel.getTargetNumber();
    }

    public boolean isPrimeFactoryOfTargetNumber(int count){
        if (factoryNumberModel.getTargetNumber() % count == 0) {
            processValues(count);
            return true;
        }
        return false;
    }

    private void processValues(int count){
        double targetNumber = factoryNumberModel.getTargetNumber();

        factoryNumberModel.setTargetNumber( targetNumber / count );
        factoryNumberModel.setLargestFactoryNumber(count);
    }

    public void isTargetNumberBiggerThanLargestFactoryNumber() {
        double targetNumber = factoryNumberModel.getTargetNumber();

        if(targetNumber > factoryNumberModel.getLargestFactoryNumber())
            factoryNumberModel.setLargestFactoryNumber(targetNumber);
    }

    public double getLargestFactoryNumber(){
        return factoryNumberModel.getLargestFactoryNumber();
    }
}