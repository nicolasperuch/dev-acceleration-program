import service.Service;

public class Process {

    private Service service;

    public Process() {
        service = new Service();
    }

    public void start(){
        service.insertData(service.getxProduct());
        service.insertData(service.getyProduct());
    }
}
