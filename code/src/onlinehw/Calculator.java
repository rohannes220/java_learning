package onlinehw;

import java.util.Scanner;

public class Calculator {

    public static Integer basicCalculator(int a, char operator, int b) {
        if (operator == '+') {
            int sum = a + b;
            return sum;
        } else if (operator == '-') {
            int difference = a - b;
            return difference;
        } else if (operator == '*') {
            int product = a * b;
            return product;
        } else if (operator == '/') {
            if (b == 0) {
                return null;
            }
            int answer = a / b;
            return answer;
        } else {
            return null;
        }
    }

    public static void testBasicCalculator() {
        // 2 + 4 = 6
        System.out.println("2 + 4 = " + basicCalculator(2, '+', 4));
        // 6 - 5 = 1
        System.out.println("6 - 5 = " + basicCalculator(6, '-', 5));
        // 12 / 3 = 4
        System.out.println("12 / 3 = " + basicCalculator(12, '/', 3));
        // 3 * 4 = 12
        System.out.println("3 * 4 = " + basicCalculator(3, '*', 4));
        // 0 + 0 = 0
        System.out.println("0 + 0 = " + basicCalculator(0, '+', 0));
        // -2 + (-2) = -4
        System.out.println("-2 + -2  = " + basicCalculator(-2, '+', -2));
        // -2 * -2 = 4
        System.out.println("-2 * -2  = " + basicCalculator(-2, '*', -2));
        // -3 * 7 = -21
        System.out.println("-3 * 7  = " + basicCalculator(-3, '*', 7));
        // 0 * -4 = 0
        System.out.println("0 * -4  = " + basicCalculator(0, '*', -4));
        // 12/7 = 1
        System.out.println("12 / 7  = " + basicCalculator(12, '/', 7));
        // 0 / 4 = 0
        System.out.println("0 / 4  = " + basicCalculator(0, '/', 4));
        // 0 / 0 = null
        System.out.println("0 / 0  = " + basicCalculator(0, '/', 0));
        // 0 * 0 = 0
        System.out.println("0 * 0  = " + basicCalculator(0, '*', 0));
        // 21 * 1 = 21
        System.out.println("21 * 1  = " + basicCalculator(21, '*', 1));
        // 1 / 0 = null
        System.out.println("1 / 0  = " + basicCalculator(1, '/', 0));
        // 1 x 0 = null
        System.out.println("1 x 0  = " + basicCalculator(1, 'x', 0));
    }

    public static void main(String[] args) {
        // Calculator
        // Enter x: 5
        // Enter y: 8
        // Enter operator (+, -, *, /): /
        // 5 / 8 = 0
        Scanner s = new Scanner(System.in);
        System.out.println("Calculator");

        System.out.print("Enter x: ");
        int firstInput = s.nextInt();

        System.out.print("Enter y: ");
        int secondInput = s.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operatorType = s.next().charAt(0);

        Integer result = basicCalculator(firstInput, operatorType, secondInput);

        System.out.println(firstInput + " " + operatorType + " " + secondInput + " = " + result);

        s.close();
    }
}
