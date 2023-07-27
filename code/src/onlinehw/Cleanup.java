package onlinehw;

public class Cleanup {
    public static String cleanString(String input) {
        int length = input.length();
        String currWord = "";
        String finalString = "";
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch) && i == length - 1) {
                // If the last char of the input is a alphabet, it won't
                // be processed. so that is why we check this if condition.

                // If ch is alphabetic and it is the last char
                currWord += ch;
                finalString = finalString + currWord;
            } else if (Character.isLetter(ch)) {
                // If a character is alphabetic and it is not the last char of the input,
                // we add it to currWord
                currWord += ch;
            } else if (currWord.length() > 0) {
                // If ch is not alphabetic and currWord is non empty

                // This else if condition means that we have reached the char
                // right after a word. so we process the word
                finalString = finalString + currWord + " ";
                currWord = "";
            } else {
                // If ch is not alphabetic and currWord is empty
                continue;
            }
        }

        // If there are more non-alphabetic chars after the last word
        // the last word would have been processed without knowing that it is the last
        // word
        // so there would be an extra space at the end for those cases
        // so if the last char in the final output is a space, we remove the space
        int finalOutputLength = finalString.length();
        char last = finalString.charAt(finalOutputLength - 1);
        if (last == ' ') {
            return finalString.substring(0, finalOutputLength - 1);
        }
        return finalString;
    }

    public static void testCleanString() {
        // _ _ ;;hi rohan[[]] --> hi rohan
        // I smell . roses --> error
        // Eatcheese --> error
        // I went swimmin; g
        // I .. love ! potatoes--> I love potatoes
        // Rohan .. EAts ! food --> Rohan EAts food
        String[] inputs = {
                "  ;;hi rohan [[]]",
                "I smell  . roses",
                "Eat . cheese !! with .. toast",
                "I ..  love ! potatoes",
                "Rohan ..   EAts ! food",
                "actor",
                " hello",
                "world ",
                "foo bar",
                "a",
                "  a. :! ? ",
                "  a. :! ? b ",
        };

        String[] outputs = {
                "hi rohan",
                "I smell roses",
                "Eat cheese with toast",
                "I love potatoes",
                "Rohan EAts food",
                "actor",
                "hello",
                "world",
                "foo bar",
                "a",
                "a",
                "a b"
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            String input = inputs[i];
            String expectedOutput = outputs[i];
            String actualOutput = cleanString(input);
            if (expectedOutput.equals(actualOutput) == false) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: '" + input + "'");
                System.out.println("Expected Output: '" + expectedOutput + "'");
                System.out.println("Actual Output: '" + actualOutput + "'");
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of cleanWord complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);
    };

    public static void main(String[] args) {
        testCleanString();
    }

}
