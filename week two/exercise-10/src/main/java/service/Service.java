package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
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

    public void startFinalValuesProcess(){
        processZProduct();
        this.xProduct.setFinalValue(processFinalValue(getXProduct()));
        this.yProduct.setFinalValue(processFinalValue(getYProduct()));
        this.zProduct.setFinalValue(processFinalValue(getZProduct()));
    }

    private void processZProduct(){
        List<Integer> zList = new ArrayList<>();
        int zValue;

        for(int i=0; i < 3 ; i++){
            zValue = (getXProduct().getValues().get(i) * getYProduct().getValues().get(i));
            zValue = zValue % 10;
            zList.add(zValue);
        }
        this.zProduct.setValues(zList);
    }

    private int processFinalValue (Product product){
        int finalValue = 1;
        for(int value : product.getValues()){
            finalValue *= value;
        }
        return finalValue;
    }

    public Product getXProduct() {
        return xProduct;
    }

    public void setXProduct(Product xProduct) {
        this.xProduct = xProduct;
    }

    public Product getYProduct() {
        return yProduct;
    }

    public void setYProduct(Product yProduct) {
        this.yProduct = yProduct;
    }

    public Product getZProduct() {
        return zProduct;
    }

    public void setZProduct(Product zProduct) {
        this.zProduct = zProduct;
    }

    public int getXProductFinalValue(){
        return xProduct.getFinalValue();
    }

    public int getYProductFinalValue(){
        return yProduct.getFinalValue();
    }

    public int getZProductFinalValue(){
        return zProduct.getFinalValue();
    }
}
