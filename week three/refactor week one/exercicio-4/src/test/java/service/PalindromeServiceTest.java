package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeServiceTest {

    private PalindromeService palindroService;

    @Before
    public void setUp() {
        palindroService = new PalindromeService();
    }

    @Test
    public void isPalindromeWhenValueIsPrimeShouldReturnTrue() throws Exception {
        Assert.assertTrue(palindroService.isPalindrome(9009));
    }

    @Test
    public void isPalindromeWhenValueIsNotPrimeShouldReturnFalse() throws Exception {
        Assert.assertFalse(palindroService.isPalindrome(900));
    }

}