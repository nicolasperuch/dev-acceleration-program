
import Service.ServiceCredit;

import java.util.Scanner;

public class Process {

    ServiceCredit service = new ServiceCredit();

    public void start(){

        Scanner le = new Scanner(System.in);
        System.out.println("informe o valor de saldo médio\n");
        double value = le.nextDouble();

        switch (service.validateCredit(value)){
            case NENHUM_CREDITO:
                System.out.println(" Seu saldo médio é: " + value + "\n você não pode receber crédito" );
                break;
            case CREDITO_20_CREDITO:
                System.out.println(" Seu saldo médio é: " + value + " e sua porcetagem de crédito será de " + service.calculateCredit(value,20) + " reais");
                break;
            case SALDO_30_CREDITO:
                System.out.println(" Seu saldo médio é: " + value + " e sua porcetagem de crédito será de " + service.calculateCredit(value,30) + " reais");
                break;
            case SALDO_40_CREDITO:
                System.out.println(" Seu saldo médio é: " + value + " e sua porcetagem de crédito será de " + service.calculateCredit(value,40) + " reais");
                break;
        }
    }
}
