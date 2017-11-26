import Service.ServicePerson;
import model.Person;
import org.junit.Before;
import java.util.ArrayList;
import java.util.List;

public class SericeTest {

   private ServicePerson service;

    @Before
    public void setUp(){
        service = new ServicePerson();

        List<Person> lista = new ArrayList<>();

        lista.add(new Person("F", "louros", "azul", 20));
        lista.add(new Person("M", "pretos", "castanho", 31));
        lista.add(new Person("F", "castanhos", "verde", 30));
        lista.add(new Person("F", "castanhos", "preto", 25));
        lista.add(new Person("F", "louros", "verde", 18));
        }
    //como testar metodos privados
}

