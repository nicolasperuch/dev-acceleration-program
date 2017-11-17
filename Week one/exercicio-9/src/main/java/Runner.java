import Service.PythagoreanTriplet;

/**
 * Created by ilegra0267 on 17/11/17.
 */
public class Runner {
    public static void main(String[] args){
        final int TARGET_NUMBER  = 100;
        PythagoreanTriplet service = new PythagoreanTriplet();
        System.out.println(service.Validete(TARGET_NUMBER));
        }
    }

