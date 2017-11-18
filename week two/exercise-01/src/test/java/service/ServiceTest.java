package service;

import model.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ServiceTest {

    private Service service;

    @Before
    public void setUp(){
        service = new Service();

        List<Person> people = new ArrayList<>();

        people.add(new Person("Oldest",23));
        people.add(new Person("Newest", 8));
        people.add(new Person("Middle-age", 18));

        service.setPeople(people);
    }

    @Test
    public void getTheOldestTest(){
        Assert.assertEquals("Oldest, 23", service.getTheOldest());
    }

    @Test
    public void getTheNewestTest(){
        Assert.assertEquals("Newest, 8", service.getTheNewest());
    }

}
