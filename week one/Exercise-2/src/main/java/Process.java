import service.Fibonacci;

public class Process {

    public void start() {

        Fibonacci service = new Fibonacci();
        final double TARGET_NUMBER = 4000000;
        int currentValue = 1;
        while(currentValue <= TARGET_NUMBER){
            currentValue = service.calculateFibonnaci(currentValue);
        }
        System.out.println(service.getSumValue());
    }
}
