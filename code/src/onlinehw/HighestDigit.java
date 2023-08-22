package onlinehw;

public class HighestDigit {

    public static int higestDigit(int number) {
        if (number < 0) {
            number = number * -1;
        }
        if (number == 0) {
            return 0;
        }
        int highestDigit = Integer.MIN_VALUE;
        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit > highestDigit) {
                highestDigit = currentDigit;
            }
            number = number / 10;
        }
        return highestDigit;
    }

    public static void testHighestDigit() {
        // 1234 --> 4
        // 2 --> 2
        // -1 --> 1
        // -901 --> 9
        // 77777 --> 7
        // 0 --> 0
        // -2222 --> 2
        int[] inputs = {
                1234,
                2,
                -1,
                -901,
                77777,
                0,
                -2222,
        };
        int[] expectedOutputs = {
                4,
                2,
                1,
                9,
                7,
                0,
                2,
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int input = inputs[i];
            int expectedOutput = expectedOutputs[i];
            int actualOutput = higestDigit(input);
            if (expectedOutput != actualOutput) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: " + input);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of highestDigit Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);

    }

    public static void main(String[] args) {
        testHighestDigit();
    }
}
