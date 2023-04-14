package practice.math;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1297;
        int sum = 0;
        int nCopy = n;

        while (n > 0) {
            // 1. get units digit of n
            int digit = n % 10;
            // 2. add digit to sum
            sum = sum + digit;
            // 3. remove units digit from n
            n = n / 10;
        }

        // Print the sum of digits
        System.out.println("Sum of digits of " + nCopy + ": " + sum);
    }
}
