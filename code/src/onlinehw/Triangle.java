package onlinehw;

import java.util.Scanner;

public class Triangle {
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Enter first side: 3
        // Enter second side: 4
        // Enter third side: 5
        // (3, 4, 5) form a triangle

        // Enter first side: 13
        // Enter second side: 4
        // Enter third side: 5
        // (13, 4, 5) doesn't form a triangle

        Scanner s = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int firstSide = s.nextInt();

        System.out.print("Enter second side: ");
        int secondSide = s.nextInt();

        System.out.print("Enter third side: ");
        int thirdSide = s.nextInt();

        boolean result = isTriangle(firstSide, thirdSide, secondSide);

        if (result == true) {
            System.out.println("(" + firstSide + ", " + secondSide + ", " + thirdSide + ")" + " form a triangle");
        } else {
            System.out.println("(" + firstSide + ", " + secondSide + ", " + thirdSide + ")" + " doesn't form a triangle");
        }

        s.close();
    }
}
