import service.SumSquareDifference;

import javax.xml.ws.Service;

public class Runner {
    public static void main(String[] args){
        new SumSquareDifference().CalculateService(100);
    }
}
