package apps;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        // Enter the number of values: 4
        // Enter number 1: 5
        // Enter number 2: 3
        // Enter number 3: 7
        // Enter number 4: -1
        //
        // Statistics
        // 1. Count: 4
        // 2. Min: -1
        // 3. Max: 7
        // 4. Sum: 14
        // 5. Product: -105
        // 6. Average: 3.5
        //
        // End of program
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = s.nextInt();
        int[] array = new int[n];

        int product = 1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int k = s.nextInt();
            array[i] = k;
            if (k < min) {
                min = k;
            }
            if (k > max) {
                max = k;
            }
            sum = sum + k;
            product = product * k;
        }
        double average = (sum * 1.0) / n;

        System.out.println();
        System.out.println("Statistics");
        System.out.println("1. Count: " + n);
        System.out.println("2. Min: " + min);
        System.out.println("3. Max: " + max);
        System.out.println("4. Sum: " + sum);
        System.out.println("5. Product: " + product);
        System.out.println("6. Average: " + average);
        System.out.println();

        System.out.println("End of program");
        s.close();
    }
}
