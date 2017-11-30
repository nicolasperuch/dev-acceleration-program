package business;

import model.FactoryNumberModel;

public class FactoryNumberBusiness {

    public boolean isTargetNumberBiggerThanCountSquared(FactoryNumberModel factoryNumberModel, int count){
        return count * count <= factoryNumberModel.getTargetNumber();
    }

    public boolean isPrimeFactoryOfTargetNumber(FactoryNumberModel factoryNumberModel, int count){
        return  factoryNumberModel.getTargetNumber() % count == 0;
    }

    public boolean isTargetNumberBiggerThanLargestFactoryNumber(FactoryNumberModel factoryNumberModel) {
        return factoryNumberModel.getTargetNumber() > factoryNumberModel.getLargestFactoryNumber();

    }
}
