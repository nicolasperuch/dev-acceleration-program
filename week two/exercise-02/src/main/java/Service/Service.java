package Service;

public class Service {
    private final double PERCENTAGE_DISTRIBUTION = 28;
    private final double TAX = 45;

    public double calculateValueWhithPercen(double value) {
        double result = ((value * PERCENTAGE_DISTRIBUTION)/100) + ((value * TAX)/100) + value ;
        return result;
    }
}
