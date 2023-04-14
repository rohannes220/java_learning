package apps;

import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        // Dates Application
        //
        // Enter year (YYYY): 2022
        // Enter month (1-12): 3
        // Enter date (1-31): 17
        //
        // Date format options:
        // 1. DD-MM-YYYY
        // 2. MM-DD-YYYY
        // Choose date format: 2
        //
        // The entered date in the specified format is: 03-17-2022
        //
        // End of program
        Scanner s = new Scanner(System.in);
        System.out.println("Dates Application");
        System.out.println();

        System.out.print("Enter year (YYYY): ");
        int year = s.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = s.nextInt();

        System.out.print("Enter date (1-31): ");
        int date = s.nextInt();
        System.out.println();

        System.out.println("Date format options:");
        System.out.println("1. DD-MM-YYYY");
        System.out.println("2. MM-DD-YYYY");
        System.out.print("Choose date format: ");
        int format = s.nextInt();

        String dStr = Integer.toString(date);
        String mStr = Integer.toString(month);
        String yStr = Integer.toString(year);
        System.out.println();
        System.out.print("The entered date in the specified format is: ");
        if (format == 1) {
            if (month < 10) {
                mStr = '0' + mStr;
            }

            if (date < 10) {
                dStr = '0' + dStr;
            }

            if (year < 10) {
                yStr = "000" + yStr;
            } else if (year < 100) {
                yStr = "00" + yStr;
            } else if (year < 1000) {
                yStr = "0" + yStr;
            }
            System.out.println(dStr + "-" + mStr + "-" + yStr);
        } else if (format == 2) {
            if (month < 10) {
                mStr = '0' + mStr;
            }

            if (date < 10) {
                dStr = '0' + dStr;
            }

            if (year < 10) {
                yStr = "000" + yStr;
            } else if (year < 100) {
                yStr = "00" + yStr;
            } else if (year < 1000) {
                yStr = "0" + yStr;
            }
            System.out.println(mStr + "-" + dStr + "-" + yStr);
        } else {
            System.out.println("Please select a valid option");
        }

        System.out.println();
        System.out.println("End of program");

        s.close();
    }
}
