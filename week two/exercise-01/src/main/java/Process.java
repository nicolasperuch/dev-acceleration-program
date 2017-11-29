import service.Service;

public class Process {

    private Service service;

    public Process() {
        this.service = new Service();
    }

    public void start(){

        service.insertData();
        System.out.println("The oldest person is " + service.getTheOldest() +" years old.");
        System.out.println("And the newest person is "+ service.getTheNewest() +" years old.");

    }
}
