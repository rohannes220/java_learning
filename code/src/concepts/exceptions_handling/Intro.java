package concepts.exceptions_handling;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        // Enter index: 4
        // Number at index 4 is 1
        // Enter index: 14
        // Invalid index: 14
        Scanner s = new Scanner(System.in);
        int[] arr = new int[] { 5, 7, 8, -12, 1 };
        System.out.print("Enter index: ");
        int x = s.nextInt();
        try {
            System.out.println("Inside try");
            System.out.println("Number at index " + x + " is " + arr[x]);
        } catch (Exception e) {
            System.out.println("Inside catch");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Invalid index: " + x);
        }

        s.close();
        System.out.println("end of program");
    }

    // Enter index: 11
    // Inside catch
    // Invalid index: 11
    // end of program
}