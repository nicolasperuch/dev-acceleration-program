import business.FactoryNumberBusiness;
import model.FactoryNumberModel;
import service.Service;

public class Process {

    private Service service;
    private FactoryNumberModel factoryNumberModel;
    private FactoryNumberBusiness factoryNumberBusiness;


    public Process() {
        this.service = new Service();
        this.factoryNumberModel = new FactoryNumberModel();
        this.factoryNumberBusiness = new FactoryNumberBusiness();
    }

    public void start(){

        int count = 2;

        while (factoryNumberBusiness.isTargetNumberBiggerThanCountSquared(factoryNumberModel, count)){
            if (!factoryNumberBusiness.isPrimeFactoryOfTargetNumber(factoryNumberModel, count)) {
                count++;
            } else {
                factoryNumberModel = service.processValues(factoryNumberModel, count);
            }
        }

        if(factoryNumberBusiness.isTargetNumberBiggerThanLargestFactoryNumber(factoryNumberModel)){
            factoryNumberModel.setLargestFactoryNumber(factoryNumberModel.getTargetNumber());
        }


        System.out.println(factoryNumberModel.getLargestFactoryNumber());
        System.out.println("Done.");
    }
}