import Service.ServicePrime;

public class Process {

    private ServicePrime service = new ServicePrime();
    private final double TARGET_NUMBER = 2000000.0;

    public void start(){

        for(long i=2;i<TARGET_NUMBER; i++)
            if(service.isPrime(i))
                service.addValueToSumOfAllPrimeNumbers(i);

        System.out.println(service.getSumOfAllPrimeNumbers());
    }
}
