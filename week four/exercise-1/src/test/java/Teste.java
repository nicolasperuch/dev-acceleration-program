import org.junit.Test;

/**
 * Created by ilegra0225 on 05/12/17.
 */
public class Teste {

    @Test
    public void teste1(){
        String name = "ADS";
        char character = name.charAt(0);
        //System.out.println(character);
        int asciiValue = (int) character;
        System.out.println(asciiValue);
    }
}
