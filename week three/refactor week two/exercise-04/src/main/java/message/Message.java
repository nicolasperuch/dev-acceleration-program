package message;

import business.BusinessCredit;

public class Message {

    public void showCreditMessage(double value, BusinessCredit service, int percentage){
        System.out.println(" Seu saldo médio é: " + value +
                            " e sua porcetagem de crédito será de "
                            + service.calculateCredit(value, percentage) + " reais");
    }

    public void showCreditMessage(double value){
        System.out.println(" Seu saldo médio é: " + value +
                            " você não pode receber crédito" );
    }

    public void showInvalidMessage(){
        System.out.println("Dados Inválidos!");
    }

}
