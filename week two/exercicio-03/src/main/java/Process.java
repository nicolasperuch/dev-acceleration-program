import Service.ServicePerson;

public class Process {

    private ServicePerson service;

    public Process() {
        this.service = new ServicePerson();
    }

    public void start(){
        service.ConsultaPerson();
    }

}
