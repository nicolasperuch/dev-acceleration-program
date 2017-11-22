package Service;

public class ServiceCredit {

    public String validateCredit(int value){
        if(value >= 0 && value <= 200){
            return "nenhum credito";
        }
        if(value >= 200 && value <= 400){
            return "20% do saldo medio";
        }
        if(value > 400 && value <= 600){
            return "30% do saldo medio";
        }
        if(value > 600){
            return "40% do saldo medio";
        }
        return "";
    }

    public int calculateCredit(int value, int percentage){
        int aux;
        aux = (value * percentage) / 100;
        return aux;
    }
}
