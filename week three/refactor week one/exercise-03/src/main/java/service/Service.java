package service;

import model.FactoryNumberModel;

public class Service {

    public FactoryNumberModel processValues(FactoryNumberModel factoryNumberModel, int count){
        FactoryNumberModel factoryNumberAux = new FactoryNumberModel();

        factoryNumberAux.setTargetNumber( factoryNumberModel.getTargetNumber() / count );
        factoryNumberAux.setLargestFactoryNumber(count);

        return factoryNumberAux;
    }
}