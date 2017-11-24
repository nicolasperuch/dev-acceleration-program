package service;

import model.Person;

import javax.security.auth.callback.Callback;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ilegra0225 on 24/11/17.
 */
public class Service {
    private Person person;
    private int i = 0;
    private Scanner input;
    private ArrayList<Person> lista;

    public Service() {
        person = new Person();
        lista = new ArrayList<>();
    }

    public void insertData() throws ParseException {
        while (i < 2) {
            String name;
            String birth;

            input = new Scanner(System.in);

            System.out.println("Informe o nome : ");
            name = input.next();

            System.out.println("Informe a data de nascimento : ");
            birth = input.next();

            if (isValidateBirthday(birth)) {
                lista.add(new Person(name,parseDate(birth)));
                i++;
            }
        }
    }

    private Date parseDate(String date) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM");
        df.setLenient(false);
        return df.parse(date);
    }

    private boolean isValidateBirthday(String birthDate) {
        Date aux;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM");
        df.setLenient(false);
        try {
            aux = df.parse(birthDate);
            return true;
        } catch (ParseException e) {
            System.err.println("Data inválida");
            return false;
        }
    }

    public void showMonths(){
        for (Person person : lista) {
            buildMessage(person);
        }
    }

    private void buildMessage(Person person){
        Date dt = person.getBirthDate();
        DateFormat df2 = new SimpleDateFormat ("MMMMM", new Locale ("pt", "BR"));
        System.out.println (df2.format (dt));
    }
}
