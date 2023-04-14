package practice.strings;

public class CountEachAlphabet {
    public static void main(String[] args) {
        // String
        String str = "a quick brown fox jumps over the lazy ddddog";
        System.out.println("The alphabet counts in \"" + str + "\" are");
        for (char c = 'a'; c <= 'z'; c++) {
            int alphabetCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (c == str.charAt(i)) {
                    alphabetCount = alphabetCount + 1;
                }
            }
            System.out.println(c + ": " + alphabetCount);
        }

        // Output
        // The alphabet counts in "a quick brown fox jumps over the lazy dog" are
        // a: 2
        // b: 1
        // ...
        // z: 1
    }
}
