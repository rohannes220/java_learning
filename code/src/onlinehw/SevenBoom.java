package onlinehw;

import java.util.Arrays;

public class SevenBoom {
    public static boolean containsSeven(int number) {
        if (number < 0) {
            number = number * -1;
        }
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            if (digit == 7) {
                return true;
            }
        }
        return false;

    }

    public static String sevenBoom(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int number = array[i];
            if (containsSeven(number) == true) {
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }

    public static void testSevenBoom() {
        int[][] inputs = new int[][] {
                {
                        1, 1, 1, 1, 5, 7
                },
                {
                        5, 5, 5, 5, 5, 7
                },
                {
                        -7, 5, 6, 7, 3, 1
                },
                {
                        7
                },
                {
                        -1, -5, -6, -3, -7
                },
                {
                        5, 6, 6, 8, -7
                },
                {
                        1, 2, 3, 4, 5, 6
                },
                {
                        -3, -4, 5, 1, 2
                },
                {
                        0, 0, 0, 0, 0
                },
                {
                        1, 2, 3, 273, 4, 5
                },
                {
                        1111117, 8, 0, 2, 1
                },
                {
                        3, 8, 1, 3, 11117111
                },
                {
                        7145679, 0, 2, 3, 8, 1
                },
                {

                },
                {
                        -1111117, 8, 0, 2, 1
                },
                {
                        3, 8, 1, 3, -11117111
                },
                {
                        -7145679, 0, 2, 3, 8, 1
                },
        };
        String[] expectedOutputs = new String[] {
                "Boom!",
                "Boom!",
                "Boom!",
                "Boom!",
                "Boom!",
                "Boom!",
                "there is no 7 in the array",
                "there is no 7 in the array",
                "there is no 7 in the array",
                "Boom!",
                "Boom!",
                "Boom!",
                "Boom!",
                "there is no 7 in the array",
                "Boom!",
                "Boom!",
                "Boom!",
        };
        int failedCases = 0;
        int totalCases = inputs.length;
        for (int i = 0; i < totalCases; i++) {
            int[] input = inputs[i];
            String output = expectedOutputs[i];
            String actualOutput = sevenBoom(input);
            if (output.equals(actualOutput) == false) {
                failedCases += 1;
                System.out.println("Failed Test Case:");
                System.out.println("Input: " + Arrays.toString(input));
                System.out.println("Expected Output: " + output);
                System.out.println("Actual Output: " + actualOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of sevenBoom Completed");
        System.out.println((totalCases - failedCases) + "/" + totalCases + " passed");
    }

    public static void main(String[] args) {
        testSevenBoom();
    }
}
