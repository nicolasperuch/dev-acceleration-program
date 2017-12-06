import model.Names;
import service.Service;

import java.io.FileNotFoundException;
import java.math.BigInteger;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        Names names;

        Service service = new Service();

        long totalAlphabeticalScoreNames;

        names = service.getNamesFromTxt();
        names = service.orderNamesByAlphabeticalOrder(names);
        names = service.removeDoubleQuotesFromEachName(names);
        totalAlphabeticalScoreNames = service.calculateScoreNames(names);

        System.out.println(totalAlphabeticalScoreNames);



/*



        return 3;
    }*/
    }
}
