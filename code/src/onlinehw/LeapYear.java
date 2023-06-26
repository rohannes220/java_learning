package onlinehw;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeap(int a) {
        if (a % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = s.nextInt();
        boolean result = isLeap(year);
        if (result == true) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + " is not a leap year");
        }
        s.close(); 
    }
}
