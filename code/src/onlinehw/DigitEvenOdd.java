package onlinehw;

import java.util.Scanner;

public class DigitEvenOdd {
    public static boolean isEveryDigitEven(int input) {
        String inputString = Integer.toString(input);
        int length = inputString.length();
        for (int i = 0; i < length; i++) {
            char digitChar = inputString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            if (digit % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // TODO: write the same function without converting it to a string
    public static boolean isEveryDigitEven2(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int integer = e.nextInt();
        boolean result = isEveryDigitEven2(integer);
        if (result == true) {
            System.out.println("Check whether every digit of the said integer is even: " + result);
        } else {
            System.out.println("Check whether every digit of the said integer is even: " + result);
        }
        e.close();
    }
}
