import Service.Service;

public class Process {
    private Service service = new Service();

    public void start(){
        System.out.println("O preço do carro é \n" + service.calculateValueWhithPercen(5000));
    }
}
