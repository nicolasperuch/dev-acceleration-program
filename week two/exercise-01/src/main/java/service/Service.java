package service;

import message.Message;
import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    private List<Person> people;

    private Person oldest;
    private Person newest;
    private Message message;

    public Service() {
        this.people = new ArrayList<>();
        this.oldest = new Person();
        this.newest = new Person();
    }

    public void insertData(){
        for (int i=0; i < 3 ; i++){
            Scanner input = new Scanner(System.in);
            String name;
            int age;

            message.showMessage(message.INPUT_MESSAGE_NAME);
            name = input.nextLine();
            message.showMessage(message.INPUT_MESSAGE_YEARS_OLD);
            age = input.nextInt();

            people.add(new Person(name, age));
        }

    }

    public String getTheOldest(){
        for (Person person : people) {
            if(isTheOldest(person)){
                buildPerson(oldest, person);
            }
        }
        return this.oldest.getName() + ", " + this.oldest.getAge();
    }

    public String getTheNewest(){
        for(Person person : people){
            if(isTheNewest(person)){
                buildPerson(newest, person);
            }
        }
        return this.newest.getName() + ", " + this.newest.getAge();
    }

    private boolean isTheOldest(Person person){
        if(oldest.getAge() == 0) return  true;
        return person.getAge() > oldest.getAge();
    }

    private boolean isTheNewest(Person person){
        if(newest.getAge() == 0) return true;
        return person.getAge() < newest.getAge();
    }

    private void buildPerson(Person target, Person person){
        target.setName(person.getName());
        target.setAge(person.getAge());
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
