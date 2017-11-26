package business;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductBusiness {

    public List<Integer> processZProduct(Product xProduct, Product yProduct){
        List<Integer> zList = new ArrayList<>();

        for(int i=0; i < 3 ; i++){
            zList.add(processZValue(xProduct, yProduct, i));
        }
        return zList;
    }

    public int processZValue(Product xProduct, Product yProduct, int position){
        int zValue;

        zValue = (xProduct.getValues().get(position) * yProduct.getValues().get(position));
        zValue = zValue % 10;
        return zValue;
    }

    public int processFinalValue (Product product){
        int finalValue = 1;
        for(int value : product.getValues()){
            finalValue *= value;
        }
        return finalValue;
    }

}
