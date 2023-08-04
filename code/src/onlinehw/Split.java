package onlinehw;

//https://edabit.com/challenge/jfRHGwHMZcnzZm9JL
public class Split {

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public static String split(String w) {
        int length = w.length();
        String vowels = "";
        String nonVowel = "";
        for (int i = 0; i < length; i++) {
            char ch = w.charAt(i);
            isVowel(ch);
            if (isVowel(ch) == true) {
                vowels = vowels + ch;
            } else {
                nonVowel = nonVowel + ch;
            }
        }
        String splitSentence = vowels + nonVowel;
        return splitSentence;
    }

    public static void testSplit() {
        // hello--> eohll
        // What's the time--> aeieWht's th tm
        // abcde --> aebcd
        // ..Rohan --> oa..Rhn
        // Eat! too much --> aoou E!tch
        // ;s..e//o --> eo;s..//
        // "Are you okay?9" -> "Aeouoar y ky?9"
        String[] inputs = {
                "hello",
                "What's the time",
                "abcde",
                "..Rohan",
                "Eat! too much",
                ";s..e//o",
                "Rohan is a genius",
                "Are you okay?9",
        };
        String[] expectedOutputs = {
                "eohll",
                "aeieWht's th tm",
                "aebcd",
                "oa..Rhn",
                "Eaoout! t mch",
                "eo;s..//",
                "oaiaeiuRhn s  gns",
                "Aeouoar y ky?9",
        };

        int failedCases = 0;
        int totalCases = inputs.length;
        for (int i = 0; i < totalCases; i++) {
            String input = inputs[i];
            String expectedOutput = expectedOutputs[i];
            String actualOutput = split(input);
            if (!expectedOutput.equals(actualOutput)) {
                failedCases += 1;
                System.out.println("Test failed");
                System.out.println("Input: " + input);
                System.out.println("Expected: " + expectedOutput);
                System.out.println("Actual: " + actualOutput);
                System.out.println();
            }
        }
        System.out.println((totalCases - failedCases) + "/" + totalCases + " passed");

    }

    public static void main(String[] args) {
        testSplit();
    }

}
