package onlinehw;

import java.util.Scanner;

public class OddishEvenish {

    public static boolean isEvenish(int input) {
        String inputString = Integer.toString(input);
        int length = inputString.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            char digitCharacter = inputString.charAt(i);
            int digit = Character.getNumericValue(digitCharacter);
            sum = sum += digit;
        }
        if (sum % 2 == 0) {
            return true;
        }
        return false;
    }

    // TODO: write the same function without converting it to a string
    public static boolean isEvenish2(int input) {
        int sum = 0;
        while (input > 0) {
            int lastDigit = input % 10;
            sum += lastDigit;
            input = input / 10;
        }
        if (sum % 2 != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = s.nextInt();
        boolean result = isEvenish2(number);
        if (result == true) {
            System.out.println("The number: " + number + " is evenish");
        } else {
            System.out.println("The number: " + number + " is oddish");
            ;
        }
        s.close();
    }

}
