package practice.math;

public class ReverseNumberCopy {
    public static void main(String[] args) {
        int n = -1234;
        int doubleReverse = 0;
        while (n < 0) {
            for (int i = 1; i <= 2; i++) {
                int nCopy = n;
                while (nCopy > 0) {
                    int digit = nCopy % 10;
                    doubleReverse = 10 * doubleReverse + digit;
                    nCopy = nCopy / 10;
                }
            }
            System.out.println("The double reverse of " + n + ": " + doubleReverse);
        }
    }
}
