package onlinehw;

public class HighLow {
    // https://edabit.com/challenge/iaCSbqngin2AXriyB
    public static String highLow(String numbers) {
        int biggestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        String currNumString = "";
        // added space at the end so last number is processed without writing extra code
        numbers = numbers + ' ';
        for (int i = 0; i < numbers.length(); i++) {
            char ch = numbers.charAt(i);
            if (ch == ' ') {
                int currentNumber = Integer.valueOf(currNumString);
                if (currentNumber > biggestNumber) {
                    biggestNumber = currentNumber;
                }
                if (currentNumber < smallestNumber) {
                    smallestNumber = currentNumber;
                }
                currNumString = "";
            } else {
                currNumString += ch;
            }
        }

        String finalOutput = biggestNumber + " " + smallestNumber;
        return finalOutput;
    }

    public static void testHighLow() {
        // 1 2 3 4 5 --> 5, 1
        // 4 3 2 7 -9 --> 7, -9
        // 6 6 6 6 -> 6 ,6
        // -1, -2, -3, -4 --> -1, -4
        // --> error
        // 123 145 190 -1 900 --> 900 , -1

        String[] inputs = {
                "1 3",
                "1 2 3 4 5",
                "4 3 7 -9",
                "6 6 6 6",
                "-1 -2 -3 -4",
                "123 145 190 -1 900",
                "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6",
                "1 -1",
                "1 1",
                "-1 -1",
                "1 -1 0",
                "1 1 0",
                "-1 -1 0",
                "42"
        };

        String[] outputs = {
                "3 1",
                "9 5",
                "7 -9",
                "6 6",
                "-1 -4",
                "900 -1",
                "542 -214",
                "1 -1",
                "1 1",
                "-1 -1",
                "1 -1",
                "1 0",
                "0 -1",
                "42 42",
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            String input = inputs[i];
            String expectedOutput = outputs[i];
            String actualOutput = highLow(input);
            if (!expectedOutput.equals(expectedOutput)) {
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
    };

    public static void main(String[] args) {
        testHighLow();
    }
}
