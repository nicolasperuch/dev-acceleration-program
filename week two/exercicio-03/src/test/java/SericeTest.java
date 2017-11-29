import Service.ServicePerson;
import model.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SericeTest {

   private ServicePerson service;
   private Person person;
    @Before
    public void setUp(){
        service = new ServicePerson();

        List<Person> lista = new ArrayList<>();

        lista.add(person = new Person("F", "louros", "azul", 20));
        lista.add(person = new Person("M", "pretos", "castanho", 31));
        lista.add(person = new Person("F", "castanhos", "verde", 30));
        lista.add(person = new Person("F", "castanhos", "preto", 25));
        lista.add(person = new Person("F", "louros", "verde", 28));
        }

    @Test
    public void isTheOldestTest(){
        Assert.assertEquals(service.isTheOldest(person), 31,0);
    }
}

