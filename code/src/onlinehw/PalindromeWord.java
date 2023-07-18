package onlinehw;

public class PalindromeWord {

    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int f = 0; f < (len / 2); f++) {
            char fwd = s.charAt(f);
            char bkwd = s.charAt(len - f - 1);
            if (fwd != bkwd) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String w) {
        int fwd = 0;
        int bkwd = w.length() - 1;
        while (fwd < bkwd) {
            char fwdChar = w.charAt(fwd);
            char bkwdChar = w.charAt(bkwd);
            if (fwdChar != bkwdChar) {
                return false;
            }
            fwd += 1;
            bkwd -= 1;
        }
        return true;
    }

    public static void testIsPalindrome() {
        // Madam -> false
        // mAdAm -> true
        // DAD -> true
        // Rohan -> false
        // "" -> true
        // a -> true
        // Ab -> false
        // AAb -> false
        // LL -> true
        // oL -> false
        // uxcb -> false
        // lol -> true
        // acca -> true
        // zzzzzzz -> true
        String[] inputs = new String[] {
                "Madam",
                "mAdAm",
                "DAD",
                "Rohan",
                "",
                "a",
                "Ab",
                "AAb",
                "LL",
                "oL",
                "uxcb",
                "lol",
                "acca",
                "zzzzzzz",
        };
        boolean[] expectedOutputs = new boolean[] {
                false,
                true,
                true,
                false,
                true,
                true,
                false,
                false,
                true,
                false,
                false,
                true,
                true,
                true,
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            String input = inputs[i];
            boolean expectedOutput = expectedOutputs[i];
            boolean actualOutput = isPalindrome2(input);
            if (expectedOutput != actualOutput) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: " + input);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of isPalindrome2 Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);
    }

    public static void main(String[] args) {
        testIsPalindrome();
    }
}
