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

    public static boolean isEquilateral(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return true;
        }
        return false;
    }

    public static boolean isIsoceles(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            return true;
        }
        return false;
    }

    public static boolean isScalene(int a, int b, int c) {
        if (isEquilateral(a, b, c) == false && isIsoceles(a, b, c) == false) {
            return true;
        }
        return false;
    }

    public static boolean isRight(int a, int b, int c) {
        if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int x = s.nextInt();

        System.out.print("Enter second side: ");
        int y = s.nextInt();

        System.out.print("Enter third side: ");
        int z = s.nextInt();

        if (isTriangle(x, y, z) == false) {
            // if it is not a triangle
            System.out.println("(" + x + ", " + y + ", " + z + ") don't form a triangle");
        } else if (isEquilateral(x, y, z) == true) {
            // if it is a triangle and equliateral
            System.out.println("(" + x + ", " + y + ", " + z + ") form an equilateral triangle");
        } else if (isIsoceles(x, y, z) == true) {
            // if it is a triangle and not equilateral and is isoceles
            System.out.println("(" + x + ", " + y + ", " + z + ") form an isoceles triangle");
        } else if (isRight(x, y, z) == true) {
            // if it is a triangle and not (equilateral isoceles) and is right
            System.out.println("(" + x + ", " + y + ", " + z + ") form a right triangle");
        } else if (isScalene(x, y, z) == true) {
            // if it is a triangle and not (equilateral, iscoleles, and scalene) but is a
            // scalene triangle
            System.out.println("(" + x + ", " + y + ", " + z + ") form a scalene triangle");
        }

        s.close();

        // Enter first side: 13
        // Enter second side: 4
        // Enter third side: 5
        // (13, 4, 5) don't form a triangle

        // Enter first side: 3
        // Enter second side: 4
        // Enter third side: 5
        // (3, 4, 5) form a right angle triangle

        // Enter first side: 3
        // Enter second side: 3
        // Enter third side: 3
        // (3, 3, 3) form an equilateral triangle

        // Enter first side: 2
        // Enter second side: 100
        // Enter third side: 100
        // (2, 100, 100) form a isoceles triangle

        // Enter first side: 2
        // Enter second side: 5
        // Enter third side: 9
        // (2, 100, 100) form a scalene triangle
    }
}
