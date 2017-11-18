package service;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    private List<Person> people;
    private String name;
    private int age;
    private Person oldest;
    private Person newest;

    public Service() {
        this.people = new ArrayList<>();
        this.oldest = new Person();
        this.newest = new Person();
    }

    public void insertData(){
        for (int i=0; i < 3 ; i++){
            Scanner input = new Scanner(System.in);

            System.out.println("Person number " + (i+1));
            System.out.printf("Insert the name: ");
            name = input.nextLine();
            System.out.printf("Insert the age: ");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getOldest() {
        return oldest;
    }

    public void setOldest(Person oldest) {
        this.oldest = oldest;
    }

    public Person getNewest() {
        return newest;
    }

    public void setNewest(Person newest) {
        this.newest = newest;
    }
}
