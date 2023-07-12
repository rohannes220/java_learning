package onlinehw;

import java.util.Arrays;
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
        // {1} -> 1
        // {1,-2,-3} -> -4
        // {2,2,-2} -> 2
        // {2,2,3,3} -> 10
        // {-1,-3,-5,-8} -> -17
        // {0} -> 0
        int[][] inputValues = new int[][] {
                { 1 },
                { 1, -2, -3 },
                { 2, 2, -2 },
                { 2, 2, 3, 3 },
                { -1, -3, -5, -8 },
                { 0 }
        };
        int[] expectedValues = new int[] {
                1,
                -4,
                2,
                10,
                -17,
                0
        };

        int totalTestCases = inputValues.length;
        int failedTestCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int[] currInput = inputValues[i];
            int expected = expectedValues[i];
            int actual = getSum(currInput);
            if (expected != actual) {
                failedTestCases += 1;
                System.out.println("Test case failed");
                System.out.println("Input: " + Arrays.toString(currInput));
                System.out.println("Expected output: " + expected);
                System.out.println("Actual output: " + actual);
                System.out.println();
            }
        }
        System.out.println("Testing of getSum Completed!");
        System.out.println((totalTestCases - failedTestCases) + " / " + totalTestCases + " cases passed");
    }

    public static void testGetMaxValue() {
        // {1} --> 1
        // (1,1,1,5)--> 5
        // (4,4,4,4)--> 4
        // (-3,-2,-1,0)--> 0
        // (10,34,87,1000) --> 1000
        // (3,3,9,9) --> 9
        // (-3,-5,-9,-10) --> -3

        int[][] inputs = new int[][] {
                { 1 },
                { 1, 1, 1, 5 },
                { 4, 4, 4, 4 },
                { -3, -2, -1, 0 },
                { 10, 34, 87, 1000 },
                { 3, 3, 9, 9 },
                { -3, -5, -9, -10 },
        };

        int[] expectedOutputs = new int[] {
                1,
                5,
                4,
                0,
                1000,
                9,
                -3,
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int[] input = inputs[i];
            int expectedOutput = expectedOutputs[i];
            int actualOutput = getMaxValue(input);
            if (actualOutput != expectedOutput) {
                failedCases += 1;
                System.out.println("Failed Case");
                System.out.println("Input: " + Arrays.toString(input));
                System.out.println("Actual Output: " + actualOutput);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println();
            }
        }

        // 8 / 10 cases passed
        System.out.println("Testing of getMaxValue Completed!");
        System.out.println((totalTestCases - failedCases) + " / " + totalTestCases + " cases passed");
    }

    public static void testGetMinValue() {
        int[][] inputs = {
                { 11, 2, 3 },
                { 1, 2, 2 },
                { 0, 0, 0 },
                { 1 },
                { 87, 9, 10 },
                { -2, -4, -5 },
                { -1, 3, 4 },
        };
        int[] expectedOutputs = { 2, 1, 0, 1, 9, -5, -1 };

        int totalTestCases = inputs.length;
        int failure = 0;
        for (int i = 0; i < inputs.length; i++) {
            int[] input = inputs[i];
            int expectedOutput = expectedOutputs[i];
            int actualOutput = getMinValue(input);
            if (actualOutput != expectedOutput) {
                failure += 1;
                System.out.println("Failed Case");
                System.out.println("Input: " + Arrays.toString(input));
                System.out.println("Actual Output: " + actualOutput);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of getMinValue Completed!");
        System.out.println((totalTestCases - failure) + " / " + totalTestCases + " cases passed");

    }

    public static void testGetStringFromIntegerArray() {

        int[][] inputs = new int[][] {
                { 4, 5, 6, 7 },
                { -3, 1, 2 },
                { 2, 2, -2 },
                { 2, 12, 13, 3 },
                { -1, -3, -5, -8 },
                { 0 }
        };

        String[] outputs = new String[] {
                "4 5 6 7",
                "-3 1 2",
                "2 2 -2",
                "2 12 13 3",
                "-1 -3 -5 -8",
                "0",
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;

        for (int i = 0; i < totalTestCases; i++) {
            int[] input = inputs[i];
            String expectedOutput = outputs[i];
            String actualOutput = getStringFromIntegerArray(input);
            if (expectedOutput.equals(actualOutput) == false) {
                failedCases += 1;
                System.out.println("Failed Case");
                System.out.println("Input: " + Arrays.toString(input));
                System.out.println("Actual Output: " + actualOutput);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of getStringFromIntegerArray Completed!");
        System.out.println((totalTestCases - failedCases) + " / " + totalTestCases + " cases passed");

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
