package practice.math;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1297;
        int reverse = 0;
        int nCopy = n;

        while (n > 0) {
            // 1. get units digit of n
            int digit = n % 10;
            // 2. add digit at end of sumn
            reverse = 10 * reverse + digit;
            // 3. remove units digit from n
            n = n / 10;
        }

        // Print the reverse number
        System.out.println("Reverse of " + nCopy + ": " + reverse);
    }
}
