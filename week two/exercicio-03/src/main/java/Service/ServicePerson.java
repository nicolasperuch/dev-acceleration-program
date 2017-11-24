package Service;

import model.Person;

import java.util.ArrayList;

public class ServicePerson {
    private  int age = 0;
    private double percentage = 0;
    private int quantityValidWoman = 0;
    private ArrayList<Person> lista;



    public ServicePerson() {
        lista = new ArrayList<>();

        lista.add(new Person("F", "louros", "azul", 20));
        lista.add(new Person("M", "pretos", "castanho", 31));
        lista.add(new Person("F", "castanhos", "verde", 30));
        lista.add(new Person("F", "castanhos", "preto", 25));
        lista.add(new Person("F", "louros", "verde", 18));
        lista.add(new Person("F", "louros", "verde", 35));
        lista.add(new Person("F", "louros", "verde", 27));

    }

    public void ConsultaPerson(){

        for(int i = 0; i < lista.size(); i++){
            if(isTheOldest(i)) {
                this.age = lista.get(i).getAge();
            }

            if(validateWoman(i)){
                quantityValidWoman++;
            }
        }
        System.out.printf("Pessoa Mais Velha " + age + " anos \n");

        System.out.println(calculatePersentage(lista) + "% das pessoas são do sexo feminino e de olhos verdes e cabelo loiro");
    }

    private double calculatePersentage(ArrayList<Person> lista){
        percentage = (quantityValidWoman * 100)/lista.size();
        return percentage;
    }

    private boolean isTheOldest(int i){
        return age < lista.get(i).getAge();
    }

    private boolean validateWoman(int i){
        return lista.get(i).getSex().contains("F") && lista.get(i).getHairColor().contains("louros") && lista.get(i).getEyesColor().contains("verde") && lista.get(i).getAge() >= 18 && lista.get(i).getAge() <= 35;
    }
}
