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

        zValue = multiplyingEachXYValue(xProduct, yProduct, position);
        zValue = modZValuePerTen(zValue);
        return zValue;
    }

    public int multiplyingEachXYValue(Product xProduct, Product yProduct, int position) {
        return xProduct.getValues().get(position) * yProduct.getValues().get(position);
    }

    public int modZValuePerTen (int zValue){
        return zValue % 10;
    }

    public int processFinalValue (Product product){
        int finalValue = 1;
        for(int value : product.getValues()){
            finalValue *= value;
        }
        return finalValue;
    }

}
