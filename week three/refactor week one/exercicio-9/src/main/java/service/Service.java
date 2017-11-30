package service;

import business.PythagoreanTripletBusiness;

public class Service {
    private int result;
    private PythagoreanTripletBusiness pythagoreanTripletBusiness;

    public Service() {
        this.pythagoreanTripletBusiness = new PythagoreanTripletBusiness();
    }

    public void startPythagoreanTripletProcess(int maxValue){
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
            this.result = pythagoreanTripletBusiness.calculatePythagoreanTripletValue(a, b, c);
        }
    }

    private boolean isPythagoreanTriplet(int a, int b, int c, int maxValue){
        return pythagoreanTripletBusiness.sumOfAllValues(a, b, c) == maxValue &&
                (pythagoreanTripletBusiness.potentiation(c) ==
                        pythagoreanTripletBusiness.potentiation(a) +
                                pythagoreanTripletBusiness.potentiation(b));
    }

    public int getResult() {
        return result;
    }
}
