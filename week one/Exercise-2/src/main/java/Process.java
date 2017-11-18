import service.Fibonacci;

public class Process {

    public void start() {

        Fibonacci service = new Fibonacci();
        final double TARGET_NUMBER = 4000000;
        int i = 1;
        while(i <= TARGET_NUMBER){
            i = service.fibo(i);
        }
        System.out.println(service.getSumValue());
    }
}
