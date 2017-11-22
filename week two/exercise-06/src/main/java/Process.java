import model.Person;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Process {
    Person person = new Person();
    Scanner le = new Scanner(System.in);
    ArrayList<Person> lista = new ArrayList<>();

    public void start() throws ParseException {
        int i = 0;

        while(i < 2) {

            System.out.println("Informe o nome : ");
            person.setName(le.next());

            System.out.println("Informe a data de nascimento : ");
            person.setBirthDate(le.next().toString());

            lista.add(person);
            i++;
        }

        for (int aux = 0; aux <= lista.size(); aux ++){
            System.out.println(lista.get(i).getName() + "  " + lista.get(i).getBirthDate());
        }

    }
}
