import java.text.ParseException;

public class Runner {
    public static void main(String[] args) {
        try {
            new Process().start();
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
}
