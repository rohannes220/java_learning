package onlinehw;

import java.util.Scanner;

public class Password {

    public static boolean isLength(String a) {
        int length = a.length();
        if (length >= 10) {
            return true;
        }
        return false;
    }

    public static void testIsLength() {
        String a = "aslkhbal3535";
        boolean result = isLength(a);
        System.out.println("String: " + a + ", expected: true, result: " + result);

        a = "abc";
        result = isLength(a);
        System.out.println("String: " + a + ", expected: false, result: " + result);

        a = "";
        result = isLength(a);
        System.out.println("String: " + a + ", expected: false, result: " + result);

        a = "abcdefghij";
        result = isLength(a);
        System.out.println("String: " + a + ", expected: true, result: " + result);
    }

    public static boolean isLetterAndDigits(String a) {
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isLetter(c) == true || Character.isDigit(c) == true) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void testIsLetterAndDigts() {
        String a = "aab1234";
        boolean result = isLetterAndDigits(a);
        System.out.println("String: " + a + ", expected: true, result: " + result);

        a = "aab1234!";
        result = isLetterAndDigits(a);
        System.out.println("String: " + a + ", expected: false, result: " + result);

        a = "a!";
        result = isLetterAndDigits(a);
        System.out.println("String: " + a + ", expected: false, result: " + result);

        a = "4!";
        result = isLetterAndDigits(a);
        System.out.println("String: " + a + ", expected: false, result: " + result);

        a = ".!";
        result = isLetterAndDigits(a);
        System.out.println("String: " + a + ", expected: false, result: " + result);

        a = "a";
        result = isLetterAndDigits(a);
        System.out.println("String: " + a + ", expected: true, result: " + result);

        a = "4";
        result = isLetterAndDigits(a);
        System.out.println("String: " + a + ", expected: true, result: " + result);

        a = "aab1234!!!>>>...";
        result = isLetterAndDigits(a);
        System.out.println("String: " + a + ", expected: false, result: " + result);
    }

    public static boolean isTwoDigts(String a) {
        int number = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isDigit(c) == true) {
                number += 1;
            }
        }
        if (number < 2) {
            return false;
        }
        return true;
    }

    public static void testIsTwoDigits() {
        String a = "11aaabbb";
        boolean result = isTwoDigts(a);
        System.out.println("String: " + a + "expected result is: true" + ", result: " + result);

        a = "1111222";
        result = isTwoDigts(a);
        System.out.println("String: " + a + "expected result is: true" + ", result: " + result);

        a = "assaaaa";
        result = isTwoDigts(a);
        System.out.println("String: " + a + "expected result is: false" + ", result: " + result);

        a = " ";
        result = isTwoDigts(a);
        System.out.println("String: " + a + "expected result is: false" + ", result: " + result);

        a = "abc45lol";
        result = isTwoDigts(a);
        System.out.println("String: " + a + "expected result is: true" + ", result: " + result);

        a = "ABCDEFiokl09";
        result = isTwoDigts(a);
        System.out.println("String: " + a + "expected result is: true" + ", result: " + result);

        a = "1asdfert6K";
        result = isTwoDigts(a);
        System.out.println("String: " + a + "expected result is: true" + ", result: " + result);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. A password must have at least ten characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = s.nextLine();
        if (isLength(password) == true && isLetterAndDigits(password) == true && isTwoDigts(password) == true) {
            System.out.println("The password is valid: " + password);
        } else {
            System.out.println("The password is invalid: " + password);
        }
        s.close();
    }
}
