
import Service.ServiceCredit;

import java.util.Scanner;

public class Process {

    ServiceCredit service = new ServiceCredit();

    public void start(){

        Scanner le = new Scanner(System.in);
        System.out.println("informe o valor de saldo médio\n");
        int value = le.nextInt();

        switch (service.validateCredit(value)){
            case "nenhum credito":
                System.out.println(" Seu saldo médio é: " + value + "\n você não pode receber crédito" );
                break;
            case "20% do saldo medio":
                System.out.println(" Seu saldo médio é: " + value + " e sua porcetagem de crédito será de " + service.calculateCredit(value,20) + " reais");
                break;
            case "30% do saldo medio":
                System.out.println(" Seu saldo médio é: " + value + " e sua porcetagem de crédito será de " + service.calculateCredit(value,30) + " reais");
                break;
            case "40% do saldo medio":
                System.out.println(" Seu saldo médio é: " + value + " e sua porcetagem de crédito será de " + service.calculateCredit(value,40) + " reais");
                break;
        }
    }
}
