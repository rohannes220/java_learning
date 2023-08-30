package onlinehw;

import java.util.Arrays;

//https://edabit.com/challenge/r7JegKpMpntfDyy6D
public class Jazzify {

    public static String[] jazzify(String[] inputs) {
        String[] output = new String[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            String currValue = inputs[i];
            int length = currValue.length();
            char lastChar = currValue.charAt(length - 1);
            if (lastChar != '7') {
                currValue = currValue + "7";
            }
            output[i] = currValue;
        }
        return output;
    }

    public static void testJazzify() {
        String[][] inputs = {
                { "G", "F", "C" },
                { "UT", "MA" },
                { "W", "I7", "WA", "oIL" },
                {},
                { "SC7", "G" },
                { "Dm", "GE", "A", "C8" },
                { "A7b", "G", "A7G7" }
        };
        String[][] expectedOutputs = {
                { "G7", "F7", "C7" },
                { "UT7", "MA7" },
                { "W7", "I7", "WA7", "oIL7" },
                {},
                { "SC7", "G7" },
                { "Dm7", "GE7", "A7", "C87" },
                { "A7b7", "G7", "A7G7" }
        };

        int numOfTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < numOfTestCases; i++) {
            String[] input = inputs[i];
            String[] expectedOutput = expectedOutputs[i];
            String[] actualOutput = jazzify(input);
            boolean areEqual = Arrays.equals(expectedOutput, actualOutput);
            if (areEqual == false) {
                failedCases += 1;
                System.out.println("Failed Test Case:");
                System.out.println("Inputs: " + Arrays.toString(input));
                System.out.println("Actual Output: " + Arrays.toString(actualOutput));
                System.out.println("Expected Output: " + Arrays.toString(expectedOutput));
                System.out.println();
            }
        }
        System.out.println("Testing of jazzify Completed");
        System.out.println((numOfTestCases - failedCases) + "/" + numOfTestCases + " passed");
    };

    public static void main(String[] args) {
        testJazzify();
    }
}
