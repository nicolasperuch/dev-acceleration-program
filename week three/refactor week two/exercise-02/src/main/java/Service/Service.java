package Service;

public class Service {
    private final double PERCENTAGE_DISTRIBUTION = 0.28;
    private final double TAX = 0.45;

    public double calculateValueWhithPercen(double value) {
        double result = (value * PERCENTAGE_DISTRIBUTION) + (value * TAX) + value ;
        return result;
    }
}
