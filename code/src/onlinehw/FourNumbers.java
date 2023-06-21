package onlinehw;

import java.util.Scanner;

public class FourNumbers {

    public static boolean isEqual(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = e.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = e.nextInt();

        System.out.print("Input third number: ");
        int thirdNumber = e.nextInt();

        System.out.print("Input fourth number: ");
        int fourthNumber = e.nextInt();

        if (isEqual(firstNumber, secondNumber, thirdNumber, fourthNumber) == true) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
        e.close();
    }

}
