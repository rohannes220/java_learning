package onlinehw;

import java.util.Arrays;

public class RightTriangle {
    // https://edabit.com/challenge/q3hu6xr7eqBB3EKaB

    public static boolean rightTriangle(int[] numbers) {
        // 1. See if length of numbers is 3, otherwise return false
        int numberofSides = numbers.length;
        if (numberofSides != 3) {
            return false;
        }

        // 2. Check if all numbers are positive, if any number is negative we can return
        // false
        for (int i = 0; i < numberofSides; i++) {
            int currNum = numbers[i];
            if (currNum <= 0) {
                return false;
            }
        }

        // 3. Find the highest side
        int highestSide = getGreatestSide(numbers);

        // 4. Calculate the highestSide squared
        int sqaureOfHighestSide = highestSide * highestSide;

        // 5. Sum up all the sqaures
        int sumOfSqaureOfAllSides = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentSide = numbers[i];
            sumOfSqaureOfAllSides += (currentSide * currentSide);
        }

        // 6. Compare squareOfOtherSides with squareOfHighestSide
        int squareOfOtherSides = sumOfSqaureOfAllSides - sqaureOfHighestSide;
        if (squareOfOtherSides == sqaureOfHighestSide) {
            return true;
        }
        return false;
    }

    // Function assumes that all the numbers are positive
    public static int getGreatestSide(int[] numbers) {
        int length = numbers.length;
        int greatestNumber = numbers[0];
        for (int i = 1; i < length; i++) {
            if (greatestNumber < numbers[i]) {
                greatestNumber = numbers[i];
            }
        }
        return greatestNumber;
    }

    public static void testRightTriange() {
        // (3,4,5) --> true
        // (-2,-5,6) --> false
        // (85, 36, 77) --> true
        // (20,101,99) --> true
        // (27,123,120) --> true
        // (7,6,-3) --> false
        // (-3,-4,-5) --> false
        // (27,3,3,) --> false
        // (100,145,105) --> true

        int[][] inputs = {
                { 3, 4, 5 },
                { -2, -5, 6 },
                { 85, 36, 77 },
                { 20, 101, 99 },
                { 27, 123, 120 },
                { 7, 6, -3 },
                { -3, -4, -5 },
                { 27, 3, 3 },
                { 100, 145, 105 }
        };
        boolean[] expectedOutputs = { true, false, true, true, true, false, false, false, true };
        int failedCases = 0;
        int totalCases = inputs.length;
        for (int i = 0; i < totalCases; i++) {
            int[] input = inputs[i];
            boolean expectedOutput = expectedOutputs[i];
            boolean actualOutput = rightTriangle(input);
            if (expectedOutput != actualOutput) {
                failedCases += 1;
                System.out.println("Failed Test Case:");
                System.out.println("Input: " + Arrays.toString(input));
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of rightTriangle Completed");
        System.out.println((totalCases - failedCases) + "/" + totalCases + " passed");

    }

    public static void main(String args[]) {
        testRightTriange();
    }

}
