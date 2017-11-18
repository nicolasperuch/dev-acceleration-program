package Service;

/**
 * Created by ilegra0267 on 17/11/17.
 */
public class PythagoreanTriplet {
    private int result;

    public int Validete(int max) {
        for (int a = 0; a <= max; a++) {
            for (int b = a + 1; b <= max; b++) {
                for (int c = b + 1; c <= max; c++) {
                    if (a + b + c == max && (c * c == a * a + b * b)) {
                        result = a * b * c;
                    }
                }
            }
        }
        return result;
    }
}
