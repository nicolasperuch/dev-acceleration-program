package service;

import message.Message;
import model.Person;
import validation.InputValidation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Service {
    private ArrayList<Person> list;
    private Message message;
    private InputValidation inputValidation;

    public Service() {
        list = new ArrayList<>();
        message = new Message();
        inputValidation = new InputValidation();
    }

    public void insertData() throws ParseException {
        int i = 0;
        while (i < 2) {
            Scanner input = new Scanner(System.in);
            String name;
            String birth;

            message.showMessage(message.INPUT_MESSAGE_NAME);
            name = input.next();

            message.showMessage(message.INPUT_MESSAGE_BIRTH_DATE);
            birth = input.next();

            if (inputValidation.isValidBirthday(birth)) {
                list.add(new Person(name,parseDate(birth)));
                i++;
            }
        }
    }

    private Date parseDate(String date) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM");
        df.setLenient(false);
        return df.parse(date);
    }

    public void showMonths(){
        list.forEach(l -> buildMessage(l));
    }

    private void buildMessage(Person person){
        Date dt = person.getBirthDate();
        DateFormat df2 = new SimpleDateFormat ("MMMMM", new Locale ("pt", "BR"));
        message.showMessage(df2.format(dt));
    }
}
