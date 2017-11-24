import service.Service;

public class Process {

    private Service service;

    public Process() {
        this.service = new Service();
    }

    public void start (int target_number){
        service.startSteps(target_number);
        System.out.println(service.getResult());
    }
}
