import service.PalindromeService;

public class Process {

    public void start() {

        PalindromeService service = new PalindromeService();

        int max = 100001;

        for (int i = 999 ; i >= 100 ; i--) {

            if (max >= i*999 ) {
                break;

            }
            for (int j = 999 ; j >= i ; j-- ) {

                int p = i * j;

                if (max < p && service.isPalindrome(p)) {

                    max = p;

                }
            }
        }

    }
}
