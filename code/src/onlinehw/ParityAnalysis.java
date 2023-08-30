package onlinehw;

public class ParityAnalysis {
    // https://edabit.com/challenge/auwAWq4MXmXFwWrHf
    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean isSumOdd(int input) {
        int sum = 0;
        while (input > 0) {
            int digit = input % 10;
            input = input / 10;
            sum = sum + digit;
        }
        if (sum % 2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean parityAnalysis(int input) {
        boolean numberOdd = isOdd(input);
        boolean sumOdd = isSumOdd(input);
        if (numberOdd == sumOdd) {
            return true;
        }
        return false;
    }

    public static void testParityAnalysis() {
        // 243 --> false
        // 12 --> false
        // 3 --> true
        // 182 --> false
        // 133331 --> false
        // 987654321 --> true
        // 123456789 --> true
        // 3453 --> true
        // 0 > true
        int[] inputs = new int[] {
                243, 12, 3, 182, 133331, 987654321, 123456789, 3453, 0
        };
        boolean[] expectedOutputs = new boolean[] {
               true,
                false,
                true,
                false,
                false,
                true,
                true,
                true,
                true,
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            int input = inputs[i];
            boolean expectedOutput = expectedOutputs[i];
            boolean actualOutput = parityAnalysis(input);
            if (expectedOutput != actualOutput) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: " + input);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of parityAnalysis Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);
    };

    public static void main(String[] args) {
        testParityAnalysis();
    }
}
