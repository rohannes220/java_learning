package practice.strings;

public class CountSpaces {
    public static void main(String[] args) {
        // Output:
        // The number of spaces in 'How are you doing? bye! ': 6
        String str = "How are you doing?  bye! ";
        int numSpaces = 0;

        // * start *
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == ' ') {
                numSpaces = numSpaces + 1;
            }
        }
        // * end *

        System.out.println(numSpaces);

    }
}
