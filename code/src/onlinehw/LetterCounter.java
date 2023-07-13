package onlinehw;

import java.util.Arrays;

public class LetterCounter {
    // letterCounter([
    // ["D", "E", "Y", "H", "A", "D"],
    // ["C", "B", "Z", "Y", "J", "K"],
    // ["D", "B", "C", "A", "M", "N"],
    // ["F", "G", "G", "R", "S", "R"],
    // ["V", "X", "H", "A", "S", "S"]
    // ], "D") ➞ 3

    // "D" shows up 3 times: twice in the first row, once in the third row.
    public static int letterCounter(String[][] array, String letter) {
        int numRows = array.length;
        int letterCount = 0;
        for (int i = 0; i < numRows; i++) {
            int numColumns = array[i].length;
            for (int j = 0; j < numColumns; j++) {
                String value = array[i][j];
                if (value.equals(letter) == true) {
                    letterCount += 1;
                }
            }
        }
        return letterCount;
    }

    public static void testLetterCounter() {
        // {
        // ["D", "E", "Y", "H", "A", "D"]
        // }, A --> 1
        // {

        /**
         * {
         * {"A","X","Y","U","P"}
         * {"B","D","S","U","E"}
         * } , U --> 2
         */

        /**
         * {
         * {"X","X","Y","U","P"}
         * {"B","D","S","U","E"}
         * {"E"}
         * } , X --> 2
         */

        /**
         * {
         * {"V","V","V","V","V"}
         * {"V","V","V","V","V"}
         * {"V"}
         * } , V --> 11
         * 
         */

        /**
         * {
         * {"a","b"}
         * {"A"}
         * {"a","A","t","l"}
         * } , a --> 2
         * 
         * 
         * 
         * }
         */

        /**
         * {}, n --> 0
         */

        /**
         * {
         * {},
         * {},
         * {},
         * } , p --> 0
         */
        /**
         * {
         * {},
         * {"C","C",v},
         * {},
         * } , C --> 2
         */

        String[][][] paramOneInputs = new String[][][] {
                {
                        { "D", "E", "Y", "H", "A", "D" }
                },
                {
                        { "A", "X", "Y", "U", "P" },
                        { "B", "D", "S", "U", "E" }
                },
                {
                        { "X", "X", "Y", "U", "P" },
                        { "B", "D", "S", "U", "E" },
                        { "E" }
                },
                {
                        { "V", "V", "V", "V", "V" },
                        { "V", "V", "V", "V", "V" },
                        { "V" }
                },
                {
                        { "a", "b" },
                        { "A" },
                        { "a", "A", "t", "l" }
                },
                {},
                {
                        {},
                        {},
                        {},
                },
                {
                        {},
                        { "C", "C", "v" },
                        {},
                }
        };
        String[] paramTwoInputs = new String[] {
                "A", "U", "X", "V", "a", "n", "p", "C"
        };
        int[] expectedOutputs = new int[] {
                1, 2, 2, 11, 2, 0, 0, 2
        };
        int numOfTestCases = paramOneInputs.length;
        int failedCases = 0;
        for (int i = 0; i < numOfTestCases; i++) {
            String[][] paramOneInput = paramOneInputs[i];
            String paramTwoInput = paramTwoInputs[i];
            int expectedOutput = expectedOutputs[i];
            int actualOutput = letterCounter(paramOneInput, paramTwoInput);
            if (expectedOutput != actualOutput) {
                failedCases += 1;
                System.out.println("Failed Test Case:");
                System.out.println("Parameter One: " + Arrays.deepToString(paramOneInput));
                System.out.println("Parameter Two: " + paramTwoInput);
                System.out.println("Actual Output: " + actualOutput);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of letterCounter Completed");
        System.out.println((numOfTestCases - failedCases) + "/" + numOfTestCases + " passed");
    }

    public static void main(String[] args) {
        testLetterCounter();
    }
}
