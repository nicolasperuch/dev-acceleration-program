import service.Service;

public class Process {

    private Service service;

    public Process() {
        this.service = new Service();
    }

    public void start (int targetNumber){
        service.startPythagoreanTripletProcess (targetNumber);
        System.out.println(service.getResult());
    }
}
