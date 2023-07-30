package onlinehw;

public class Counts {

    // Assumes that word only has uppercase, lowercase and digits
    public static void countAndPrintChars(String word) {
        // Initialize the counts array
        // Store counts as follows Capitals, lower case, numbers :
        // [A,B,C,D,..Z,a,b,c,d,e..z,0,1,..9]
        int[] counts = new int[62];
        for (int j = 0; j < counts.length; j++) {
            counts[j] = 0;
        }

        // Get counts of all the characters
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char c = word.charAt(i);
            // find index of character count
            int index = getIndex(c);
            // Add 1 to the count
            counts[index] += 1;
        }

        // Iterate over the counts array and print each count
        printCharCountsFromCountsArray(counts);
    }

    public static void printCharCountsFromCountsArray(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                char ch = getChar(i);
                System.out.println(ch + " : " + counts[i]);
            }
        }
    }

    // Assumes that ch is alphanumeric
    public static int getIndex(char ch) {
        int ascii = (int) ch;
        // Check if ch is in A-Z
        if (ch >= 'A' && ch <= 'Z') {
            return ascii - 65;
        }

        // Check if ch is in a-z
        if (ch >= 'a' && ch <= 'z') {
            return ascii - 71;
        }

        // 0-9
        return ascii + 4;
    }

    // Assumes 0 <= index <= 61
    public static char getChar(int index) {
        int ascii;
        if (index <= 25) {
            ascii = 65 + index;
        } else if (index <= 51) {
            ascii = 71 + index;
        } else {
            ascii = index - 4;
        }
        char ch = (char) ascii;
        return ch;
    }

    public static void main(String[] args) {
        countAndPrintChars("aabbbbccd");
    }

}
