package onlinehw;

import java.util.Scanner;

public class Reverse {
    public static int reverseNumber(int number) {
        int backwards = 0;
        while (number > 0) {
            int digit = number % 10;
            backwards = (10 * backwards) + digit;
            number = number / 10;
        }
        return backwards;
    }

    public static void testReverseNumber() {
        // 456978, 1, 0, 1111, 676
        int number = 456978;
        int reverseResult = reverseNumber(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 1;
        reverseResult = reverseNumber(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 0;
        reverseResult = reverseNumber(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 1111;
        reverseResult = reverseNumber(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 676;
        reverseResult = reverseNumber(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

    }

    public static int reverseNumber2(int number) {
        if (number == 0) {
            return 0;
        }
        String backwards = "";
        while (number > 0) {
            int lastDigit = number % 10;
            backwards = backwards + lastDigit;
            number = number / 10;
        }
        return Integer.parseInt(backwards);
    }

    public static void testReverseNumber2() {
        // 456978, 1, 0, 1111, 676
        int number = 456978;
        int reverseResult = reverseNumber2(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 1;
        reverseResult = reverseNumber2(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 0;
        reverseResult = reverseNumber2(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 1111;
        reverseResult = reverseNumber2(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 676;
        reverseResult = reverseNumber2(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

    }

    public static int reverseNumber3(int number) {
        String backwardNumber = "";
        String numberString = Integer.toString(number);
        int length = numberString.length();
        for (int i = length - 1; i >= 0; i--) {
            char digit = numberString.charAt(i);
            backwardNumber += digit;
        }
        return Integer.parseInt(backwardNumber);
    }

    public static void testReverseNumber3() {
        // 456978, 1, 0, 1111, 676
        int number = 456978;
        int reverseResult = reverseNumber3(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 1;
        reverseResult = reverseNumber3(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 0;
        reverseResult = reverseNumber3(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 1111;
        reverseResult = reverseNumber3(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

        number = 676;
        reverseResult = reverseNumber3(number);
        System.out.println("Reverse of " + number + ": " + reverseResult);

    }

    public static void main(String[] args) {
        // Input a number: 23782
        // Reverse of 23782: 28732
        Scanner s = new Scanner(System.in);
        System.out.print("Input a number: ");
        int input = s.nextInt();
        int result = reverseNumber(input);
        System.out.println("Reverse of " + input + ": " + result);
        s.close();
    }
}
