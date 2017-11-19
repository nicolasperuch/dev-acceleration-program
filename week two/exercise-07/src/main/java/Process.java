import service.Service;

public class Process {

    Service service;

    public Process() {
        this.service = new Service();
    }

    public void start(){
        service.insertData();
    }
}
