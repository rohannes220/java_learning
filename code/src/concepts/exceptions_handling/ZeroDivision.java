package concepts.exceptions_handling;

import java.util.Scanner;

public class ZeroDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = s.nextInt();
        System.out.print("Enter y: ");
        int y = s.nextInt();

        // Denominator can't be 0
        try {
            int result = x / y;
            System.out.println(x + " / " + y + " = " + result);
        } catch (Exception e) {
            System.out.println("Denominator can't be 0");
        }

        s.close();
    }
}
