package service;

public class SumSquareDifference {

    private int squareValue;
    private int sumTotalValue;
    private int totalSquareValue;
    private int calculateDiference;


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
    public int TotalSum(){
        sumTotalValue += Math.pow(totalSquareValue,2);
        calculateDiference = sumTotalValue - squareValue;

        return calculateDiference;
    }
}


