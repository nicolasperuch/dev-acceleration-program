import service.Service;

public class Process {

    private Service service;


    public Process() {
        this.service = new Service();
    }

    public void start(){


        int count = 2;

        while (service.isTargetNumberBiggerThanCount(count)) {

            if (!service.isPrimeFactoryOfTargetNumber(count)) {
                count++;
            }
        }
        service.isTargetNumberBiggerThanLargestFactoryNumber();

        System.out.println(service.getLargestFactoryNumber());
    }
}