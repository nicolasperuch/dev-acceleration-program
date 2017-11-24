import service.Service;

import java.text.ParseException;

public class Process {

    Service service = new Service();

    public void start() throws ParseException {
        service.insertData();
        service.showMonths();
    }
}
