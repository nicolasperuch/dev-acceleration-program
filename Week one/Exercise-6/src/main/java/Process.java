import service.SumSquareDifference;

public class Process{

    public void start() {
        SumSquareDifference service = new SumSquareDifference();
        final int TARGET_NUMBER = 100;

        for(int i = 1; i <= TARGET_NUMBER; i++){
           service.CalculateService(i);
           if(i == 100){
               System.out.println(service.TotalSum(service.getSquareValue(), service.getTotalSquareValue()));
           }
        }

    }
}
