package service;

public class PalindromeService {

    public static boolean isPalindrome(int nr) {

        int reversedNumber = 0;

        int value = nr;

        while (value > 0) {

            reversedNumber = 10 * reversedNumber + value % 10;
            value /= 10;

        }

        return nr == reversedNumber;
    }

}
