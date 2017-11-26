
import Service.ServiceCredit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static Service.ServiceCredit.OpcoesMenu.*;

public class SericeTest {

   private ServiceCredit service;

    @Before
    public void setUp(){
        service = new ServiceCredit();
    }

    @Test
    public void validateCredit20PercentageTest(){

        Assert.assertEquals(String.valueOf(service.validateCredit(250)),CREDITO_20_CREDITO);
    }

    @Test
    public void validateCredit20PercentageTest2(){

        Assert.assertEquals(String.valueOf(service.validateCredit(201)),CREDITO_20_CREDITO);
    }
    @Test
    public void validateCredit20PercentageTest3(){

        Assert.assertEquals(String.valueOf(service.validateCredit(400)),CREDITO_20_CREDITO);
    }
    @Test
    public void validateCredit30PercentageTest(){
        Assert.assertEquals(String.valueOf(service.validateCredit(500)),SALDO_30_CREDITO);
    }

    @Test
    public void validateCredit30PercentageTest1(){
        Assert.assertEquals(String.valueOf(service.validateCredit(401)),SALDO_30_CREDITO);
    }

    @Test
    public void validateCredit30PercentageTest2(){
        Assert.assertEquals(String.valueOf(service.validateCredit(500)),SALDO_30_CREDITO);
    }
    @Test
    public void validateCredit40PercentageTest(){

        Assert.assertEquals(String.valueOf(service.validateCredit(600)),SALDO_40_CREDITO);
    }
    @Test
    public void validateCreditPercentageNullTest(){
        Assert.assertEquals(String.valueOf(service.validateCredit(0)),NENHUM_CREDITO);
    }

    @Test
    public void validateCreditPercentageNullTest1(){
        Assert.assertEquals(String.valueOf(service.validateCredit(100)),NENHUM_CREDITO);
    }

    @Test
    public void validateCreditPercentageNullTest2(){
        Assert.assertEquals(String.valueOf(service.validateCredit(200)),NENHUM_CREDITO);
    }
    @Test
    public void calculateCreditTest(){

        Assert.assertEquals(String.valueOf(service.calculateCredit(200,10)),20);
    }

}
