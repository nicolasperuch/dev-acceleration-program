package service;

import business.ProductBusiness;
import model.Product;
import validation.InputValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    private Product xProduct;
    private Product yProduct;
    private Product zProduct;
    private InputValidation inputValidation;
    private ProductBusiness productBusiness;

    public Service() {
        this.xProduct = new Product("x", new ArrayList<>());
        this.yProduct = new Product("y", new ArrayList<>());
        this.zProduct = new Product("z", new ArrayList<>());
        this.inputValidation = new InputValidation();
        this.productBusiness = new ProductBusiness();
    }

    public void insertData(Product product) {
        int inputValue;
        int i = 0;

        while (i < 3) {
            Scanner input = new Scanner(System.in);

            showInputMessage(product, i);
            inputValue = input.nextInt();

            if(inputValidation.validateInput(inputValue)){
                product.getValues().add(inputValue);
                i++;
            }
        }
    }


    public void startFinalValuesProcess(){
        zProduct.setValues(productBusiness.processZProduct(xProduct, yProduct));
        this.xProduct.setFinalValue(productBusiness.processFinalValue(getXProduct()));
        this.yProduct.setFinalValue(productBusiness.processFinalValue(getYProduct()));
        this.zProduct.setFinalValue(productBusiness.processFinalValue(getZProduct()));
    }

    private void showInputMessage(Product product, int position){
        System.out.printf("Insert " + product.getName() +
                            calculateProductPosition(position) + ": ");
    }

    private int calculateProductPosition(int position){
        return ++position;
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
