package service;

public class DivisibleService {
    public boolean isDivisibleByAll(long value) {

        for (int i = 1; i < 21; i++) {

            if (value % i != 0) {

                return false;
            }
        }

        return true;
    }
}
