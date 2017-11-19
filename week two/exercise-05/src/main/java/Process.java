import service.Service;

public class Process {

    Service service;

    public void start(){
        service = new Service();
        service.insertData();

    }
}
