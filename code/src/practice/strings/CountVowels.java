package practice.strings;

public class CountVowels {
    public static void main(String[] args) {
        // OUtput:
        // The number of vowels in "How are you doing? bye! Aaargh.": 11
        String str = "How are you doing? bye! Aaargh.";
        // String str = "bye! Aaargh.";
        // String str = "ro han";
        int numVowels = 0;

        // * start *
        String strCopy = str.toLowerCase();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = strCopy.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numVowels = numVowels + 1;
            }
        }
        System.out.print("The number of vowels in \"" + str + "\": ");
        // * end *

        System.out.println(numVowels);
    }
}
