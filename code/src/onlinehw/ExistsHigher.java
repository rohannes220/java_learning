package onlinehw;

public class ExistsHigher {
    // https://edabit.com/challenge/aWzxPLibBLJgn8AbZ

    public static boolean existsHigher(int[] list, int n) {
        for (int i = 0; i < list.length; i++) {
            int digit = list[i];
            if (digit >= n) {
                return true;
            }
        }
        return false;
    }

    public static void testExistsHigher() {
        // [],5-> false
        // [3,3,3,3],3--> true
        // [2,5,6,7],10 --> false
        // [-1,-5,-6,-7,12], -2-> true
        // [1,2,1],0 --> true
        // [18,18,18,18,18,18], 3 --> true
        // [0,0,0,0,0,0,], -2 --> true
        // [-2,6,8,12,23,23], 23 --> true
        // [1,2,3,4,5,7,12,45,6,7,-1,-2,7], 7 --> true

        int[][] paramOne = {
                {},
                { 3, 3, 3, 3 },
                { 2, 5, 6, 7 },
                { -1, -5, -6, -7, 12 },
                { 1, 2, 1 },
                { 18, 18, 18, 18, 18, 18 },
                { 0, 0, 0, 0, 0, 0 },
                { -2, 6, 8, 12, 23, 23 },
                { 1, 2, 3, 4, 5, 7, 12, 45, 6, 7, -1, -2, 7 },
        };
        int[] paramTwo = {
                5,
                3,
                10,
                -2,
                0,
                3,
                -2,
                23,
                7,
        };
        boolean[] expectedOutputs = {
                false,
                true,
                false,
                true,
                true,
                true,
                true,
                true,
                true,
        };

        int totalTestCases = paramOne.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int[] inputOne = paramOne[i];
            int inputTwo = paramTwo[i];
            boolean expectedOutput = expectedOutputs[i];
            boolean actualOutput = existsHigher(inputOne, inputTwo);
            if (expectedOutput != actualOutput) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input 1: " + inputOne);
                System.out.println("Input 2: " + inputTwo);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of existsHigher Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);

    }

    public static void main(String[] args) {
        testExistsHigher();
    }
}
