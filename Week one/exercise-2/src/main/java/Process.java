import service.Fibonacci;

public class Process {

    public void start() {

        Fibonacci service = new Fibonacci();

        service.fibo(300 );

    }
}
