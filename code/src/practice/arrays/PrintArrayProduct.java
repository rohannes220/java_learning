package practice.arrays;

import java.util.Scanner;

public class PrintArrayProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int n = s.nextInt();
        int[] array = new int[n];

        int product = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = s.nextInt();
            product = product * array[i];
        }

        for (int y = 0; y < n; y++) {
            System.out.print(array[y]);
            if (y <= n - 2) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = " + product);

        s.close();
    }

}
