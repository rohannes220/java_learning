package practice.math;

public class DoubleReverse {
    public static void main(String[] args) {
        int n = -134;
        int doubleReverse = 0;

        for (int i = 1; i <= 2; i++) {
            int nCopy = n;
            if (nCopy < 0) {
                nCopy = -1 * nCopy;
            }
            while (nCopy > 0) {
                int digit = nCopy % 10;
                doubleReverse = 10 * doubleReverse + digit;
                nCopy = nCopy / 10;
            }
        }
        if (n < 0) {
            doubleReverse = -1 * doubleReverse;
        }

        System.out.println("The double reverse of " + n + ": " + doubleReverse);

    }

}
