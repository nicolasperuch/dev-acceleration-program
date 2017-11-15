import service.Service;

public class Process {

    private Service service;

    private final double TARGET_NUMBER = 600851475143.0;

    public Process() {
        this.service = new Service();
    }

    public void start(){

        for (double i=2; i< TARGET_NUMBER ; i++){
            if(service.isPrime(i))
                service.addPrimeNumberToList(i);
        }

        service.findTheLargestFactoryNumber(TARGET_NUMBER);

        System.out.println("The largest prime factor of " + TARGET_NUMBER +
                            " is " + service.getLargestFactoryNumber());
    }
}
