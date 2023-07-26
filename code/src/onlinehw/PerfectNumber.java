package onlinehw;

public class PerfectNumber {
    // https://edabit.com/challenge/vXYP24qRoQQijc834

    public static boolean perfectNumber(int number) {
        int totalSum = 0;
        if (number <= 0) {
            return false;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                totalSum += i;
            }
        }
        if (totalSum == number) {
            return true;
        }
        return false;
    }

    public static void testPerfectNumber() {
        // -123 --> false (no negative numbers)
        // 6--> true
        // 28 --> true
        // 496 --> true
        // 12 --> false
        // 97 --> false
        // 3--> false
        // 87 --> false
        // 0 --> true

        int[] inputs = { -123, 6, 28, 496, 12, 97, 3, 87, 0 };
        boolean[] expectedOutputs = { false, true, true, true, false, false, false, false, false };
        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int input = inputs[i];
            boolean expectedOutput = expectedOutputs[i];
            boolean actualOutput = perfectNumber(input);
            if (expectedOutput != actualOutput) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: " + input);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of perfectNumber Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);
    }

    public static void main(String[] args) {
        testPerfectNumber();
    }
}
