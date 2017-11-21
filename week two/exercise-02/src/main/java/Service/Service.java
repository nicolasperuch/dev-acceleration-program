package Service;

public class Service {
    private double percentageDistribution;
    private double tax;

    public Service() {
        this.percentageDistribution = 28;
        this.tax = 45;
    }

    public double Valor(double value) {
        double result = ((value * percentageDistribution)/100) + ((value * tax)/100) + value ;
        return result;
    }
}
