package onlinehw;

import java.util.Scanner;

public class FourNumbers {

    public static String isEqual(int a, int b, int c, int d) {
        if (a == b && b == c && c == d) {
            return "Numbers are equal";
        }
        return "Numbers are not equal";
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
        System.out.println(isEqual(firstNumber, fourthNumber, secondNumber, thirdNumber));

        e.close();
    }

}
