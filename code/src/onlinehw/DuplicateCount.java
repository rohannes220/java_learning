package onlinehw;

public class DuplicateCount {

    public static int duplicateCount(String letters) {
        int length = letters.length();
        int duplicate = 0;
        for (int i = 0; i < length; i++) {
            char a = letters.charAt(i);
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    continue;
                }
                char b = letters.charAt(j);
                if (a == b) {
                    duplicate = duplicate + 1;
                }
            }
        }
        return duplicate / 2;
    }

    public static int getIndexInCountsArray(char ch) {
        int ascii = ch;
        if (ch >= '0' && ch <= '9') {
            return ascii + 4;
        }
        if (ch >= 'a' && ch <= 'z') {
            return ascii - 97;
        }
        if (ch >= 'A' && ch <= 'Z') {
            return ascii - 39;
        }

        // Since only 0-9, a-z, A-Z are allowed
        // we will never reach this point
        return -1;
    }

    public static int duplicateCount2(String word) {
        // Initialize counts array to store char counts
        int[] counts = new int[62];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        // Compute counts of each char
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char currentChar = word.charAt(i);
            int countsIndex = getIndexInCountsArray(currentChar);
            counts[countsIndex] += 1;
        }

        // Calculate the number of duplicate chars by iterating over counts
        int duplicate = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] >= 2) {
                duplicate += 1;
            }
        }
        return duplicate;
    }

    public static void testDuplicateCount() {
        // "Aa"-->0
        // "LOL"--> 1
        // "i"--> 0
        // "PoSsIBle"--> 0
        // "Help Help"--> 4
        // ""-->0
        // "aaabbb" --> 2
        // "Indivisibilities" --> 2

        String[] inputs = {
                "Aa",
                "LOL",
                "i",
                "PoSsIBle",
                "HelpHelp",
                "",
                "aaabbb",
                "Indivisibilities"
        };
        int[] outputs = {
                0,
                1,
                0,
                0,
                4,
                0,
                2,
                2
        };

        int failedCases = 0;
        int totalCases = inputs.length;
        for (int i = 0; i < totalCases; i++) {
            String input = inputs[i];
            int output = outputs[i];
            int actualOutput = duplicateCount2(input);
            if (output != actualOutput) {
                failedCases += 1;
                System.out.println("Test failed");
                System.out.println("Input: " + input);
                System.out.println("Output: " + output);
                System.out.println("Actual Output: " + actualOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of duplicateCount2 Completed");
        System.out.println((totalCases - failedCases) + "/" + totalCases + " passed");
    }

    public static void main(String[] args) {
        testDuplicateCount();
    }

}
