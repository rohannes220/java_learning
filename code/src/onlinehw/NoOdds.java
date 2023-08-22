package onlinehw;

import java.util.Arrays;

//https://edabit.com/challenge/A7mDjLb7DZL5bk8oz
public class NoOdds {

    public static int[] noOdds(int[] inputs) {
        int length = inputs.length;
        int numberOfEvens = 0;
        for (int i = 0; i < length; i++) {
            int currNum = inputs[i];
            if (currNum % 2 == 0) {
                numberOfEvens += 1;
            }
        }

        int[] evens = new int[numberOfEvens];
        int currEvenCount = 0;

        for (int i = 0; i < inputs.length; i++) {
            int currNum = inputs[i];
            if (currNum % 2 == 0) {
                evens[currEvenCount] = currNum;
                currEvenCount += 1;
            }
        }
        return evens;
    }

    public static void testNoOdds() {
        // [2,2,4,4] --> [2, 2, 4, 4]
        // [43, 65, 23, 89, 53, 9, 6] --> [6]
        // [718,999,1007,593,785] --> [718]
        // [148, 6, 16, 85] --> [148, 6, 16]
        // [9, 49, 23]--> []
        // [53, 62, 65, 77] --> [62]
        int[][] inputs = {
                { 2, 2, 4, 4 },
                { 43, 65, 23, 89, 53, 9, 6 },
                { 718, 999, 1007, 593, 785 },
                { 148, 6, 16, 85 },
                { 9, 49, 23 },
                { 53, 62, 65, 77 },
        };
        int[][] expectedOutputs = {
                { 2, 2, 4, 4 },
                { 6 },
                { 718 },
                { 148, 6, 16 },
                {},
                { 62 },
        };
        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int[] input = inputs[i];
            int[] expectedOutput = expectedOutputs[i];
            int[] actualOutput = noOdds(input);
            if (Arrays.equals(actualOutput, expectedOutput) == false) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: " + Arrays.toString(input));
                System.out.println("Expected Output: " + Arrays.toString(expectedOutput));
                System.out.println("Actual Output: " + Arrays.toString(actualOutput));
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of noOdds Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);
    }

    public static void main(String[] args) {
        testNoOdds();
    }
}
