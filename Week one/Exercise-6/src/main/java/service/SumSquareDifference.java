package service;

public class SumSquareDifference {

    public void CalculateService(int n){
        int squareValue = 0;
        int totalSquareValue = 0;
        int totalSum = 0;
        for(int i = 0; i <= n; i++){
            squareValue += Math.pow(i, 2 );
            totalSquareValue += i;
        }
        totalSum += Math.pow(totalSquareValue, 2 );
        System.out.println(squareValue);
        System.out.println(totalSum);
    }
}
