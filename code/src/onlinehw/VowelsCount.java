package onlinehw;

public class VowelsCount {
    // "RohanKUMAR! 123-"

    // Vowel counts for 'RohanKUMAR! 123-'
    // a : 2
    // o : 1
    // u : 1

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public static void countPrintVowels(String word) {
        // initialize the vowel count to 0
        int[] counts = new int[] { 0, 0, 0, 0, 0 };

        //covert everything to lowercase
        String wordLower = word.toLowerCase();

        //iterate each character
        int length = wordLower.length();
        for (int i = 0; i < length; i++) {
            char ch = wordLower.charAt(i);
            if (isVowel(ch) == true) {
                int index = getIndex(ch);
                counts[index] = counts[index] + 1;
            }
        }

        //print the nonlowr case string along with vowel and  count 
        System.out.println("Vowel counts for '" + word + "'");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(getChar(i) + " : " + counts[i]);
            }
        }

    }

    // Assumes that ch is a vowel
    public static int getIndex(char ch) {
        if (ch == 'a') {
            return 0;
        }
        if (ch == 'e') {
            return 1;
        }
        if (ch == 'i') {
            return 2;
        }
        if (ch == 'o') {
            return 3;
        }
        return 4;
    }

    // Assumes that index is between 0 and 4(inclusive)
    public static char getChar(int index) {
        if (index == 0) {
            return 'a';
        }
        if (index == 1) {
            return 'e';
        }
        if (index == 2) {
            return 'i';
        }
        if (index == 3) {
            return 'o';
        }
        return 'u';
    }

    public static void main(String[] args) {
        countPrintVowels("rOhanKUmar!@##");
    }
}
