import Service.Service;

public class Runner {
    public static void main(String [] args){
        Service service = new Service();

        System.out.println("O preço do carro é \n" + service.Valor(5000));
    }
}
