package onlinehw;

//https://edabit.com/challenge/p5kyThBZDR7oJhjR7
public class ReverseOdd {
    public static String reverseOdd(String input) {
        String finalOutput = "";
        String currentWord = "";
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                // if we are at the end of the word
                int curWordLength = currentWord.length();
                if (curWordLength % 2 == 1) {
                    currentWord = reverseWord(currentWord);
                }
                finalOutput += currentWord;
                finalOutput += " ";
                currentWord = "";
            } else {
                currentWord += ch;
            }
        }
        // finalOutput - "enO owt eerht "
        // currentWord - "four"
        if (currentWord.length() % 2 == 1) {
            finalOutput += reverseWord(currentWord);
        } else {
            finalOutput += currentWord;
        }
        return finalOutput;
    }

    public static String reverseWord(String word) {
        int length = word.length();
        String backwardWord = "";
        for (int i = length - 1; i >= 0; i--) {
            char letter = word.charAt(i);
            backwardWord += letter;
        }
        return backwardWord;
    }

    public static void testReverseOdd() {
        // reverseOdd("Bananas") ➞ "sananaB"
        // reverseOdd("One two three four") ➞ "enO owt eerht four"
        // reverseOdd("Make sure uoy only esrever sdrow of ddo length")
        // ➞ "Make sure you only reverse words of odd length"
        String[] inputs = {
                "one two",
                "Bananas",
                "One two three four",
                "Make sure uoy only esrever sdrow of ddo length"
        };

        String[] outputs = {
                "eno owt",
                "sananaB",
                "enO owt eerht four",
                "Make sure you only reverse words of odd length"
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            String input = inputs[i];
            String expectedOutput = outputs[i];
            String actualOutput = reverseOdd(input);
            if (expectedOutput.equals(actualOutput) == false) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: '" + input + "'");
                System.out.println("Expected Output: '" + expectedOutput + "'");
                System.out.println("Actual Output: '" + actualOutput + "'");
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of move complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);

    }

    public static void main(String[] args) {
        testReverseOdd();
    }

}
