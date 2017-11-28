package service;

import business.BusinessCredit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceCreditTest {

    private ServiceCredit serviceCredit;
    private BusinessCredit businessCredit;

    @Before
    public void setUp(){
        serviceCredit = new ServiceCredit();
        businessCredit = mock(BusinessCredit.class);
    }

    @Test
    public void validateCreditValue100ShouldReturnNenhuCredito(){
        double value = 100;

        when(businessCredit.isValueBetween0And200(value)).thenReturn(true);
        serviceCredit.setBusinessCredit(businessCredit);

        Assert.assertEquals(ServiceCredit.OpcoesMenu.NENHUM_CREDITO, serviceCredit.validateCredit(value));
    }

    @Test
    public void validateCreditValue300ShouldReturnSaldo20Credito(){
        double value = 300;

        when(businessCredit.isValueBetween0And200(value)).thenReturn(false);
        when(businessCredit.isValueBetween201And400(value)).thenReturn(true);
        serviceCredit.setBusinessCredit(businessCredit);

        Assert.assertEquals(ServiceCredit.OpcoesMenu.SALDO_20_CREDITO, serviceCredit.validateCredit(value));
    }

    @Test
    public void validateCreditValue500ShouldReturnSaldo30Credito(){
        double value = 500;

        when(businessCredit.isValueBetween0And200(value)).thenReturn(false);
        when(businessCredit.isValueBetween201And400(value)).thenReturn(false);
        when(businessCredit.isValueBetween401And600(value)).thenReturn(true);
        serviceCredit.setBusinessCredit(businessCredit);

        Assert.assertEquals(ServiceCredit.OpcoesMenu.SALDO_30_CREDITO, serviceCredit.validateCredit(value));
    }

    @Test
    public void validateCreditValue700ShouldReturnSaldo40Credito(){
        double value = 700;

        when(businessCredit.isValueBetween0And200(value)).thenReturn(false);
        when(businessCredit.isValueBetween201And400(value)).thenReturn(false);
        when(businessCredit.isValueBetween401And600(value)).thenReturn(false);
        when(businessCredit.isValueBiggerThan600(value)).thenReturn(true);
        serviceCredit.setBusinessCredit(businessCredit);

        Assert.assertEquals(ServiceCredit.OpcoesMenu.SALDO_40_CREDITO, serviceCredit.validateCredit(value));
    }

    @Test
    public void validateCreditNegativeValueShouldReturnOpcaoInvalida(){
        double value = -100;

        when(businessCredit.isValueBetween0And200(value)).thenReturn(false);
        when(businessCredit.isValueBetween201And400(value)).thenReturn(false);
        when(businessCredit.isValueBetween401And600(value)).thenReturn(false);
        when(businessCredit.isValueBiggerThan600(value)).thenReturn(false);
        serviceCredit.setBusinessCredit(businessCredit);

        Assert.assertEquals(ServiceCredit.OpcoesMenu.OPCAO_INVALIDA, serviceCredit.validateCredit(value));
    }

}
