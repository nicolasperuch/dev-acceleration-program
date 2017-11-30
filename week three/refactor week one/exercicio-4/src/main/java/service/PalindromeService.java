package service;

public class PalindromeService {

    public static boolean isPalindrome(int number) {

        int reversedNumber = 0;

        int value = number;

        while (value > 0) {

            reversedNumber = 10 * reversedNumber + value % 10;
            value /= 10;

        }

        return number == reversedNumber;
    }
}
