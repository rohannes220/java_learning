package onlinehw;

public class FirstNVowels {
    public static String firstNVowels(String sentence, int numVowels) {
        // https://edabit.com/challenge/ev5oH5FSzb9oF6skT
        int length = sentence.length();
        String newSentence = sentence.toLowerCase();
        int sentenceVowelCount = 0;
        String vowels = "";
        for (int i = 0; i < length; i++) {
            if (sentenceVowelCount == numVowels) {
                return vowels;
            }
            char ch = newSentence.charAt(i);
            if (isVowel(ch)) {
                sentenceVowelCount += 1;
                vowels += ch;
            }
        }
        return "invalid";
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public static void testFirstNVowels() {
        // "sharpening skills",4-> "aeii"
        // "major league", 5 --> "aoeau"
        // "hostess",5 --> invalid
        // "shrimp", 2-> invalid
        // "PIZZA AND eggs", 4 --> iaae
        // "My name is Rohan", 5 --> aeioa
        // "L" , 2 --> invalid
        // "Rohan is eating cheese" , "3" --> oai

        String[] sentences = {
                "sharpening skills",
                "major league",
                "hostess",
                "shrimp",
                "PIZZA AND eggs",
                "My name is Rohan",
                "L",
                "Rohan is eating cheese",
                "Something"
        };
        int[] numVowels = {
                4,
                5,
                5,
                2,
                3,
                5,
                2,
                3,
                0,
        };
        String[] expectedOutputs = {
                "aeii",
                "aoeau",
                "invalid",
                "invalid",
                "iaa",
                "aeioa",
                "invalid",
                "oai",
                "",
        };

        int totalTestCases = sentences.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            String sentence = sentences[i];
            int numVowel = numVowels[i];
            String expectedOutput = expectedOutputs[i];
            String actualOutput = firstNVowels(sentence, numVowel);
            if (!expectedOutput.equals(actualOutput)) {
                System.out.println("Failed Test Case: ");
                System.out.println("Sentence: " + sentence);
                System.out.println("numVowel: " + numVowel);
                System.out.println("Expected Output: '" + expectedOutput + "'");
                System.out.println("Actual Output: '" + actualOutput + "'");
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of firstNVowels Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);

    }

    public static void main(String[] args) {
        testFirstNVowels();
    }
}
