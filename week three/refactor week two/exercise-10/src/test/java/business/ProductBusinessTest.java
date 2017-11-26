package business;

import model.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductBusinessTest {

    private final int FIRST_ELEMENT = 0;

    private ProductBusiness productBusiness;
    private Product xProduct;
    private Product yProduct;

    @Before
    public void setUp(){
        productBusiness = new ProductBusiness();
        xProduct = new Product();
        yProduct = new Product();
    }

    @Test
    public void processZValueWithZero(){
        xProduct.getValues().add(0);
        yProduct.getValues().add(7);

        int zValue = productBusiness.processZValue(xProduct, yProduct, FIRST_ELEMENT);

        Assert.assertEquals(0, zValue);
    }

    @Test
    public void processZValueWithoutZero(){
        xProduct.getValues().add(7);
        yProduct.getValues().add(7);

        int zValue = productBusiness.processZValue(xProduct, yProduct, FIRST_ELEMENT);

        Assert.assertEquals(9, zValue);
    }

    @Test
    public void multiplyingEachXYValue(){
        xProduct.getValues().add(7);
        yProduct.getValues().add(7);

        int result = productBusiness.multiplyingEachXYValue(xProduct, yProduct, FIRST_ELEMENT);

        Assert.assertEquals(49, result);
    }

    @Test
    public void modZValuePerTenWhenzValueIsTenShouldReturnZero(){
        int result = productBusiness.modZValuePerTen(10);

        Assert.assertEquals(0,result);
    }

    @Test
    public void modZValuePerTenWhenzValueIsFiveShouldReturnFive(){
        int result = productBusiness.modZValuePerTen(5);

        Assert.assertEquals(5,result);
    }

}

