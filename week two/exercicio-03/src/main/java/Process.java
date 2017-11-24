import Service.ServicePerson;

public class Process {
<<<<<<< HEAD
    private int age = 0;

    private ArrayList<Person> lista;

    public Process() {
        lista = new ArrayList<>();

        lista.add(new Person("F", "louros", "azul", 20));
        lista.add(new Person("M", "pretos", "castanho", 31));
        lista.add(new Person("F", "castanhos", "verde", 30));
        lista.add(new Person("F", "castanhos", "preto", 25));
        lista.add(new Person("F", "louros", "verde", 18));
        lista.add(new Person("F", "louros", "verde", 35));
        lista.add(new Person("F", "louros", "verde", 27));

    }

    public void consultPerson(){

        for(int i = 0; i < lista.size(); i++){
            if(isTheOldest(i)) {
                this.age = lista.get(i).getAge();
            }

            if(validateWoman(i)){
                System.out.println("Mulher que satisfaca o exercicio 2: " + lista.get(i).getAge() + " anos");
            }
        }
        System.out.printf("Pessoa Mais Velha " + age + " anos");
    }


    private boolean isTheOldest(int i){
        return age < lista.get(i).getAge();
    }

    private boolean validateWoman(int i){
        return lista.get(i).getSex().contains("F") && lista.get(i).getHairColor().contains("louros") && lista.get(i).getEyesColor().contains("verde") && lista.get(i).getAge() >= 18 && lista.get(i).getAge() <= 35;
    }
=======
   private ServicePerson servicePerson = new ServicePerson();

   public void start(){
       servicePerson.ConsultaPerson();
   }
>>>>>>> 57d025f478323f23021846726f2825a34527c051
}
