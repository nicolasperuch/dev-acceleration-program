import message.Message;
import service.Service;

public class Process {

    private Service service;
    private Message message;

    public Process() {
        this.service = new Service();
        this.message = new Message();
    }

    public void start(){
        service.insertData();

        if(service.loanProcess()) {
            message.showMessage(message.LOAN_ACCEPTED);
        } else {
            message.showMessage(message.LOAN_DENIED);
        }

    }
}
