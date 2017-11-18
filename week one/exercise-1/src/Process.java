import service.MultipleService;

public class Process {

    public void start() {

        MultipleService service = new MultipleService();

        int multipleValuesCont = 0;

        for (int i =2; i< 1000; i++){
            if(service.isMultipleOf3(i)){
                multipleValuesCont += i;
                continue;
            }
            if(service.isMultipleOf5(i)){
                multipleValuesCont += i;
                continue;
            }
        }
        System.out.println("The sum of these multiples is "+multipleValuesCont);
    }
}
