import model.Person;

import java.util.ArrayList;

public class Process {
    int age = 0;


    public void ConsultaPerson(){

        ArrayList<Person> lista = new ArrayList<>();

        lista.add(new Person("F", "louros", "azul", 20));
        lista.add(new Person("M", "pretos", "castanho", 31));
        lista.add(new Person("F", "castanhos", "verde", 30));
        lista.add(new Person("F", "castanhos", "preto", 25));
        lista.add(new Person("F", "louros", "verde", 18));
        lista.add(new Person("F", "louros", "verde", 35));
        lista.add(new Person("F", "louros", "verde", 27));


        for(int i = 0; i < lista.size(); i++){
            if(age < lista.get(i).getAge()) {
                if (lista.get(i).getAge() < lista.get(i + 1).getAge()) {
                    age = lista.get(i + 1).getAge();
                }
            }if(lista.get(i).getSex().contains("F") && lista.get(i).getHairColor().contains("louros") && lista.get(i).getEyesColor().contains("verde") && lista.get(i).getAge() >= 18 && lista.get(i).getAge() <= 35 ){
                System.out.println(lista.get(i).getAge());
            }
        }
        System.out.println("Pessoa Mais Velha \n" + age);
    }

}
