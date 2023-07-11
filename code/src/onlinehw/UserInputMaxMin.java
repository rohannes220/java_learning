package onlinehw;

import java.util.Scanner;

public class UserInputMaxMin {

    public static String getStringFromIntegerArray(int[] array) {
        int length = array.length;
        String output = "";
        for (int i = 0; i < length; i++) {
            int curr = array[i];
            if (i == 0) {
                output += curr;
            } else {
                output = output + " " + curr;
            }
        }
        return output;
    }

    public static int getMinValue(int[] array) {
        int length = array.length;
        int min = array[0];
        for (int i = 0; i < length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
            // if (min < array[i]) {
            // continue;
            // } else {
            // min = array[i];
            // }
        }
        return min;
    }

    public static int getSum(int[] array) {
        int length = array.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int value = array[i];
            sum += value;
        }
        return sum;
    }

    public static int getMaxValue(int[] array) {
        int length = array.length;
        int max = array[0];
        for (int i = 0; i < length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
            // if (max > array[i]) {
            // continue;
            // } else {
            // max = array[i];
            // }
        }
        return max;
    }

    public static void testGetSum() {
        // {1} --> 1
        int result = getSum(new int[] { 1 });
        int expected = 1;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();

        // {1,-2,-3}
        result = getSum(new int[] { 1, -2, -3 });
        expected = -4;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();

        // {2,2,-2}
        result = getSum(new int[] { 2, 2, -2 });
        expected = 2;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();

        // {2,2,3,3}
        result = getSum(new int[] { 2, 2, 3, 3 });
        expected = 10;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();

        // {-1,-3,-5,-8}
        result = getSum(new int[] { -1, -3, -5, -8 });
        expected = -17;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();

    }

    public static void testGetMaxValue() {
        // {1} --> 1
        int result = getMaxValue(new int[] { 1 });
        int expected = 1;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // (1,1,1,5)--> 5
        result = getMaxValue(new int[] { 1, 1, 1, 5 });
        expected = 5;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // (4,4,4,4)--> 4
        result = getMaxValue(new int[] { 4, 4, 4, 4 });
        expected = 4;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // (-3,-2,-1,0)--> 0
        result = getMaxValue(new int[] { -3, -2, -1, 0 });
        expected = 0;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // (10,34,87,1000) --> 1000
        result = getMaxValue(new int[] { 10, 34, 87, 1000 });
        expected = 1000;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // (3,3,9,9) --> 9
        result = getMaxValue(new int[] { 3, 3, 9, 9 });
        expected = 9;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // (-3,-5,-9,-10) --> -3
        result = getMaxValue(new int[] { -3, -5, -9, -10 });
        expected = -3;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();

    }

    public static void testGetMinValue() {
        // {1} -- > 1
        int result = getMinValue(new int[] { 1 });
        int expected = 1;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {2,2,2} -> 2
        result = getMinValue(new int[] { 2, 2, 2 });
        expected = 2;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {-1,-2,-3} -> -3
        result = getMinValue(new int[] { -1, -2, -3 });
        expected = -3;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {-2,3,4} -> -2
        result = getMinValue(new int[] { -2, 3, 4 });
        expected = -2;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {4,1,62,127} -> 1
        result = getMinValue(new int[] { 4, 1, 62, 127 });
        expected = 1;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {1,3,3,3} -> 1
        result = getMinValue(new int[] { 1, 3, 3, 3 });
        expected = 1;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {1,1,2,2} -> 1
        result = getMinValue(new int[] { 1, 1, 2, 2 });
        expected = 1;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {4,4,4,1} -> 1
        result = getMinValue(new int[] { 4, 4, 4, 1 });
        expected = 1;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {-3} -> -3
        result = getMinValue(new int[] { -3 });
        expected = -3;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();
        // {45,6,7,-2} -> -2
        result = getMinValue(new int[] { 45, 6, 7, -2 });
        expected = -2;
        System.out.println("result: " + result);
        System.out.println("expected: " + expected);
        System.out.println();

    }

    public static void testGetStringFromIntegerArray() {
        // {1, 2, 3} -> "1 2 3"
        String result = getStringFromIntegerArray(new int[] { 1, 2, 3 });
        String expected = "1 2 3";
        System.out.println("result: '" + result + "'");
        System.out.println("expected: '" + expected + "'");
        System.out.println();
        // {11, -2, 3, 41} -> "11 -2 3 41"
        result = getStringFromIntegerArray(new int[] { 11, -2, 3, 41 });
        expected = "11 -2 3 41";
        System.out.println("result: '" + result + "'");
        System.out.println("expected: '" + expected + "'");
        System.out.println();
        // {12} -> "12"
        result = getStringFromIntegerArray(new int[] { 12 });
        expected = "12";
        System.out.println("result: '" + result + "'");
        System.out.println("expected: '" + expected + "'");
        System.out.println();
        // {} -> ""
        result = getStringFromIntegerArray(new int[] {});
        expected = "";
        System.out.println("result: '" + result + "'");
        System.out.println("expected: '" + expected + "'");
        System.out.println();
    }

    public static void main(String[] args) {
        // Enter number of values you want to enter: 3
        // Enter value 1: 5
        // Enter value 2: -15
        // Enter value 3: 57

        // Results:
        // Values: 5 -15 57
        // Min: -15
        // Max: 57
        // Sum: 47

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of values you want to enter: ");
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int x = s.nextInt();
            array[i] = x;
        }
        System.out.println();
        System.out.println("Results:");
        String arrayString = getStringFromIntegerArray(array);
        System.out.println("Values: " + arrayString);
        int min = getMinValue(array);
        System.out.println("Min: " + min);
        int max = getMaxValue(array);
        System.out.println("Max: " + max);
        int sum = getSum(array);
        System.out.println("Sum: " + sum);
        s.close();

    }
}
