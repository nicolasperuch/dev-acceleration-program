
import business.BusinessCredit;
import message.Message;
import service.ServiceCredit;

import java.util.Scanner;

public class Process {

    ServiceCredit service = new ServiceCredit();
    BusinessCredit businessCredit = new BusinessCredit();
    Message message = new Message();

    public Process() {
        this.service = new ServiceCredit();
        this.businessCredit = new BusinessCredit();
        this.message = new Message();
    }

    public void start(){

        Scanner le = new Scanner(System.in);
        message.inputMessage();
        double value = le.nextDouble();

        switch (service.validateCredit(value)){
            case NENHUM_CREDITO:
                message.showCreditMessage(value);
                break;
            case SALDO_20_CREDITO:
                message.showCreditMessage(value, businessCredit, 20);
                break;
            case SALDO_30_CREDITO:
                message.showCreditMessage(value, businessCredit, 30);
                break;
            case SALDO_40_CREDITO:
                message.showCreditMessage(value, businessCredit, 40);
                break;
            default:
                message.showInvalidMessage();
                break;
        }
    }
}
