import service.Service;

public class Process {

    private Service service;

    public Process() {
        this.service = new Service();
    }

    public void start(){
        service.populateList();
        service.showList();
        service.invertList();
        service.showList();
    }

}
