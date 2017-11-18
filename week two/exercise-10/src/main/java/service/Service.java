package service;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    private Product xProduct;
    private Product yProduct;
    private Product zProduct;

    public Service() {
        this.xProduct = new Product("x", new ArrayList<>());
        this.yProduct = new Product("y", new ArrayList<>());
        this.zProduct = new Product("z", new ArrayList<>());
    }

    public void insertData(Product product) {
        int inputValue;
        int i = 0;

        while (i < 3) {
            Scanner input = new Scanner(System.in);

            System.out.printf("Insert " + product.getName() + (i+1) + ": ");
            inputValue = input.nextInt();

            if(validateInput(inputValue, product)){
                i++;
            }
        }
    }

    private boolean validateInput(int inputValue, Product product){
        if(isInputValid(inputValue)){
            product.getValues().add(inputValue);
            return true;
        } else{
            System.out.println("Invalid value. The input must be between 0 and 9.");
            return false;
        }
    }

    private boolean isInputValid(int input){
        return input >= 0 && input <= 9;
    }

    public Product getxProduct() {
        return xProduct;
    }

    public void setxProduct(Product xProduct) {
        this.xProduct = xProduct;
    }

    public Product getyProduct() {
        return yProduct;
    }

    public void setyProduct(Product yProduct) {
        this.yProduct = yProduct;
    }

    public Product getzProduct() {
        return zProduct;
    }

    public void setzProduct(Product zProduct) {
        this.zProduct = zProduct;
    }
}
