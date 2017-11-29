package Service;

import model.Person;

import java.util.ArrayList;

public class ServicePerson {
    private  int age = 0;
    private double percentage = 0;
    private double quantityValidWoman = 0;
    private ArrayList<Person> lista;



    public ServicePerson() {
        lista = new ArrayList<>();

        lista.add(new Person("F", "louros", "azul",40));
        lista.add(new Person("M", "pretos", "castanho", 31));
        lista.add(new Person("F", "castanhos", "verde", 30));
        lista.add(new Person("F", "castanhos", "preto", 25));
        lista.add(new Person("F", "louros", "verde", 18));
        lista.add(new Person("F", "louros", "verde", 35));
        lista.add(new Person("F", "louros", "verde", 27));

    }

    public void ConsultPerson(){

        lista.forEach(n -> isTheOldest(n));
        lista.forEach(n -> validateWoman(n));

        System.out.printf("Pessoa Mais Velha " + age + " anos \n");
        System.out.println(calculatePersentage(lista) + "% das pessoas são do sexo feminino e de olhos verdes e cabelo loiro");
    }

    private double calculatePersentage(ArrayList<Person> lista){
        percentage = (quantityValidWoman * 100)/lista.size();
        return percentage;
    }

    public int isTheOldest(Person person){
            if(age < person.getAge())
               this.age = person.getAge();
            return this.age;
    }


    public double validateWoman(Person person){
        if(person.getSex().contains("F") && person.getHairColor().contains("louros") && person.getEyesColor().contains("verde") && person.getAge() >=18 && person.getAge() <= 35);
        return this.quantityValidWoman ++;
    }
}
