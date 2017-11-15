package Service;

public class ServicePrime {

    private int primeCont;

    public ServicePrime() {
        this.primeCont = 0;
    }

    public int getPrimeCont() {
        return primeCont;
    }

    public void setPrimeCont(int primeCont) {
        this.primeCont = primeCont;
    }

    public boolean isPrime(double value){
        for(int i=2;i<value;i++) {
            if(value%i==0)
                return false;
        }
        return true;
    }
}
