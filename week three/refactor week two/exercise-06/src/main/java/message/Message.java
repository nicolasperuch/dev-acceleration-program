package message;

public class Message {

    public final String INPUT_MESSAGE_NAME = "Informe o nome : ";
    public final String INPUT_MESSAGE_BIRTH_DATE = "Informe a data de nascimento (DD/MM): ";
    public final String INVALID_MESSAGE_BIRTH_DATE = "Data Inválida";

    public void showMessage(String message){
        System.out.println(message);
    }


}
