package onlinehw;

import java.util.Arrays;

public class ProductOfRemainingElements {
    public static int[] getLtr(int[] arr) {
        int len = arr.length;
        int[] ltr = new int[len];

        int product = 1;
        for (int i = 0; i < len; i++) {
            product = product * arr[i];
            ltr[i] = product;
        }

        return ltr;
    }

    public static int[] getRtl(int[] arr) {
        int len = arr.length;
        int[] rtl = new int[len];

        int product = 1;
        for (int i = len - 1; i >= 0; i--) {
            product = product * arr[i];
            rtl[i] = product;
        }

        return rtl;
    }

    public static boolean canPartition2(int[] arr) {
        int len = arr.length;
        int[] ltr = getLtr(arr);
        int[] rtl = getRtl(arr);

        for (int i = 0; i < len; i++) {

            int productOfRemaining;
            if (i == 0) {
                productOfRemaining = rtl[1];
            } else if (i == len - 1) {
                productOfRemaining = ltr[len - 2];
            } else {
                productOfRemaining = ltr[i - 1] * rtl[i + 1];
            }

            if (arr[i] == productOfRemaining) {
                return true;
            }
        }

        return false;
    }

    public static boolean canPartition(int[] arr) {
        int length = arr.length;
        for (int k = 0; k < length; k++) {
            int value = arr[k];
            int productOfRemaining = 1;
            for (int i = 0; i < length; i++) {
                if (i != k) {
                    productOfRemaining = productOfRemaining * arr[i];
                }
            }
            if (value == productOfRemaining) {
                return true;
            }
        }
        return false;
    }

    public static void testCanPartition() {
        // {12,1,6,2}--> true
        // {2,8,4,1} --> true
        // {1,5,15,3}--> true
        // {5,4,2,40}--> true
        // {-1,-1,2,2} --> false
        // {-1,2,2,12} --> false
        // {2,2,2,2} --> false
        // {-1,-3,-4, 12,56}--> false
        // {0,-1,}--> false
        // {0} --> true
        // {1,1} --> true

        int[][] inputs = {
                { 12, 1, 6, 2 },
                { 2, 8, 4, 1 },
                { 1, 5, 15, 3 },
                { 5, 4, 2, 20 },
                { -1, -1, 2, 2 },
                { -1, 2, 2, 12 },
                { 2, 2, 2, 2 },
                { -1, -3, -4, 12, 56 },
                { 0, -1 },
                { 1, 1 }
        };
        boolean[] outputs = {
                true,
                true,
                true,
                false,
                true,
                false,
                false,
                false,
                false,
                true,
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int[] input = inputs[i];
            boolean expectedOutput = outputs[i];
            boolean actualOutput = canPartition2(input);
            if (expectedOutput != actualOutput) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: " + Arrays.toString(input));
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of canPartition Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);

    }

    public static void main(String[] args) {
        testCanPartition();
    }

}
