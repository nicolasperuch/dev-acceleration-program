package service;

public class Fibonacci {

    public void fibo(int n) {
        int a = 1;
        int b = 1;
        int aux;
        int soma = 0;

        for (int i = 0; i < n; i++) {
            if (a <= 4000000) {
                System.out.println("(" + i + ")" + a);
                aux = a;
                a = a + b;
                b = aux;
                if (a % 2 == 0)
                    System.out.println(soma += a);
            }else{
                System.out.println(soma);
                break;
            }
        }
    }
}