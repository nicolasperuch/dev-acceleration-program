package message;

public class Message {

    public final String LOAN_ACCEPTED = "Aproved Loan";
    public final String LOAN_DENIED = "Loan denied";

    public void showMessage(String message){
        System.out.println(message);
    }
}
