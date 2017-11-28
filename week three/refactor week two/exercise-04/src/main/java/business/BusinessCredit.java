package business;

public class BusinessCredit {

    public boolean isValueBetween0And200(double value){
        return value >= 0 && value <= 200;
    }

    public boolean isValueBetween201And400(double value){
        return value > 200 && value <= 400;
    }

    public boolean isValueBetween401And600(double value){
        return value > 400 && value <= 600;
    }

    public boolean isValueBiggerThan600(double value){
        return value > 600;
    }

    public double calculateCredit(double value, int percentage) {
        return (value * percentage)/100;
    }
}
