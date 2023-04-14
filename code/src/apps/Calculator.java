
package apps;

import java.util.Scanner;

public class Calculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create scanner
        Scanner s = new Scanner(System.in);

        /**
         * Calculator application
         * 
         * Choose one of the following operations:
         * 1. Addition
         * 2. Subtraction
         * 3. Multiplication
         * 4. Factorial
         * 5. Multiplication table
         * 6. Division
         * Enter an option (1 to 6): 6
         * Enter first number: 10
         * Enter second number: 3
         * 10 / 3
         * Quotient: 3
         * Remainder: 1
         * 
         * End of program
         */

        /**
         * Calculator application
         * 
         * Choose one of the following operations:
         * 1. Addition
         * 2. Subtraction
         * 3. Multiplication
         * 4. Factorial
         * 5. Multiplication table
         * 6. Division
         * 7. Power
         * 8. Permutation
         * Enter an option (1 to 8): 8
         * Enter first number: 5
         * Enter second number: 2
         * permutation(5, 2) = 20
         * 
         * End of program
         */

        // Print initial data
        System.out.println("**************************");
        System.out.println("* Calculator Application *");
        System.out.println("**************************");
        System.out.println("\nChoose one of the following operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Factorial");
        System.out.println("5. Multiplication table");
        System.out.println("6. Division");
        System.out.println("7. Power");
        System.out.println("8. Permutation");

        // Get option from user
        System.out.print("Enter an option (1 to 8): ");
        int option = s.nextInt();

        // Perform and print the operation
        if (option == 1) {
            // Taking the user input
            System.out.print("Enter first number: ");
            int first = s.nextInt();
            System.out.print("Enter second number: ");
            int second = s.nextInt();

            // Doing the math
            // Printing the result
            System.out.println(first + " + " + second + " = " + (first + second));

        } else if (option == 2) {
            // Taking the user input
            System.out.print("Enter first number: ");
            int first = s.nextInt();
            System.out.print("Enter second number: ");
            int second = s.nextInt();

            // Doing the math
            // Printing the result
            System.out.println(first + " - " + second + " = " + (first - second));
        } else if (option == 3) {
            // Taking the user input
            System.out.print("Enter first number: ");
            int first = s.nextInt();
            System.out.print("Enter second number: ");
            int second = s.nextInt();

            // Doing the math
            // Printing the result
            System.out.println(first + " x " + second + " = " + (first * second));
        } else if (option == 4) {
            // Taking the user input
            System.out.print("Enter the number: ");
            int n = s.nextInt();

            // Calculating the factorial
            int factorial = 1;
            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;
            }

            // Printing the result
            System.out.println(n + "! = " + factorial);
        } else if (option == 5) {
            System.out.print("Enter the integer for the table you want: ");
            int n = s.nextInt();
            System.out.print("Enter the number of rows for the table: ");
            int numRows = s.nextInt();

            for (int i = 1; i <= numRows; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }

        } else if (option == 6) {
            // Entering the numbers
            System.out.print("Enter first number: ");
            int first = s.nextInt();
            System.out.print("Enter second number: ");
            int second = s.nextInt();
            System.out.println(first + " " + "/" + ' ' + second);

            if (second == 0) {
                System.out.println("Division by zero is illegal ");
            } else {
                // Doing the math

                // Displaying it
                System.out.println("Quotient: " + first / second);
                System.out.println("Remainder: " + first % second);
            }
        } else if (option == 7) {
            System.out.print("Enter first number: ");
            int first = s.nextInt();
            System.out.print("Enter a second number: ");
            int second = s.nextInt();
            boolean isNegative = second < 0;
            if (second < 0) {
                second = -1 * second;
            }
            // Doing the math
            int power = 1;
            for (int i = 1; i <= second; i++) {
                power = power * first;
            }
            if (isNegative) {
                System.out.println(first + " ^ -" + second + " = 1 / " + power);
            } else {
                System.out.println(first + " ^ " + second + " = " + power);
            }
        } else if (option == 8) {
            System.out.print("Enter first number: ");
            int first = s.nextInt();
            System.out.print("Enter a second number: ");
            int second = s.nextInt();

            int firstFactorial = 1;
            // Doing the math first factorial
            for (int i = first; i >= 1; i--) {
                firstFactorial = firstFactorial * i;
            }

            // Doing the math second factorial
            int number = first - second;
            int secondFactorial = 1;
            for (int i = number; i >= 1; i--) {
                secondFactorial = i * secondFactorial;
            }

            // Printing the permuation
            // permutation(5, 2) = 20
            int result = firstFactorial / secondFactorial;
            System.out.println("permutation(" + first + ", " + second + ") = " + result);

        } else {
            System.out.println("Invalid option");
        }

        // Print end
        System.out.println("\nEnd of program ");

        // Closing scanner
        s.close();
    }
}