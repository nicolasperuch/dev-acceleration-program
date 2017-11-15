import Service.ServicePrime;

public class Process {

    private final int TARGET_NUMBER = 10001;

    ServicePrime service = new ServicePrime();

    public void start(){

        double value = 2;

        while(true){

            if(service.isPrime(value))
                service.setPrimeCont(service.getPrimeCont()+1);

            if(service.getPrimeCont() == TARGET_NUMBER)
                break;

            value++;
        }

        System.out.println(value);
    }
}
