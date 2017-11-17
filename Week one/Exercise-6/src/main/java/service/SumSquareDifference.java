package service;

public class SumSquareDifference {

    private int squareValue;
    private int sumTotalValue;
    private int totalSquareValue;
    private int calculateDiference;

    public int getSquareValue() {
        return squareValue;
    }

    public int getTotalSquareValue() {
        return totalSquareValue;
    }

    public SumSquareDifference() {
        this.squareValue = 0;
        this.sumTotalValue = 0;
        this.totalSquareValue = 0;
    }

    public int CalculateService(int n){
        squareValue += Math.pow(n, 2 );
        totalSquareValue += n;

        return squareValue;
    }
    public int TotalSum(int a, int b){
        sumTotalValue += Math.pow(b,2);
        calculateDiference = sumTotalValue - a;

        return calculateDiference;
    }
}


