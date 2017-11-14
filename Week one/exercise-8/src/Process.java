import service.Service;

public class Process {

    public void start() {

        Service service = new Service();

        System.out.println("The greatest product of thirteen adjacent digits is: " + service.theGreatestProductOfTheThirteenAdjacentDigits());

    }
}
