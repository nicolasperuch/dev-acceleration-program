package service;

public class Service {
    private int result;

    public void startSteps(int maxValue){
        step1(maxValue);
    }

    private void step1(int maxValue){
        for (int a = 0; a <= maxValue; a++) {
            step2(a, maxValue);
        }
    }

    private void step2(int a, int maxValue){
        for (int b = a + 1; b <= maxValue; b++) {
            step3(a, b, maxValue);
        }
    }

    private void step3(int a, int b, int maxValue){
        for (int c = b + 1; c <= maxValue; c++) {
            step4(a, b, c, maxValue);
        }
    }

    private void step4(int a, int b, int c, int maxValue){
        if(isPythagoreanTriplet(a, b, c, maxValue)){
            this.result = calculatePythagoreanTripletValue(a, b, c);
        }
    }

    private boolean isPythagoreanTriplet(int a, int b, int c, int maxValue){
        return sumOfAllValues(a, b, c) == maxValue && (potentiation(c) == potentiation(a) + potentiation(b));
    }

    private int potentiation(int value){
        return value * value;
    }

    private int sumOfAllValues(int a, int b, int c){
        return a + b + c;
    }

    private int calculatePythagoreanTripletValue(int a, int b, int c) {
        return a * b * c;
    }

    public int getResult() {
        return result;
    }
}
