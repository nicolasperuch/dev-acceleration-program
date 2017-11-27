import service.DivisibleService;

public class Process {

    public void start() {

        DivisibleService service = new DivisibleService();

        long targetNumber = 1;

        while (1==1) {

            if (service.isDivisibleByAll(targetNumber)) {

                System.out.println(targetNumber);
                System.exit(0);

            }

            targetNumber++;
        }
    }
}
