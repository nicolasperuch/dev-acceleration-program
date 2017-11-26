import service.Service;

public class Process {

    private Service service;

    public Process() {
        service = new Service();
    }

    public void start(){
        service.insertData(service.getXProduct());
        service.insertData(service.getYProduct());
        service.startFinalValuesProcess();

        System.out.println("X : " + service.getXProductFinalValue());
        System.out.println("Y : " + service.getYProductFinalValue());
        System.out.println("Z : " + service.getZProductFinalValue());
    }
}
