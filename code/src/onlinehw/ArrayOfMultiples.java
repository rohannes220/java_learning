package onlinehw;

import java.util.Scanner;
import java.util.Arrays;

// Reference: https://edabit.com/challenge/rzpucPyoyEtXPo2BG
public class ArrayOfMultiples {

    public static int[] arrayOfMultiples(int num, int length) {
        int[] finalArray = new int[length];
        for (int i = 0; i < length; i++) {
            int product = num * (i + 1);
            finalArray[i] = product;
        }
        return finalArray;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Number: ");
        int number = s.nextInt();

        System.out.print("Length: ");
        int length = s.nextInt();

        int[] finalMultipleOfArray = arrayOfMultiples(number, length);
        System.out.println("The result is: " + Arrays.toString(finalMultipleOfArray));

        s.close();
    }

}
