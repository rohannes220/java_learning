package practice.strings;

public class StringsArray {
    public static void main(String[] args) {
        // Declare an array of strings
        String a = "helloO";
        String[] array = { "", "kaaejdlkdsa", a };

        // Write code to find the sum of all the number of vowels of strings in the
        // array
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            String copy = array[i].toLowerCase();
            int iVowels = 0;
            for (int s = 0; s < copy.length(); s++) {
                char c = copy.charAt(s);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    total = total + 1;
                    iVowels = iVowels + 1;
                }
            }
            System.out.println("The number of vowels in \"" + array[i] + "\": " + iVowels);
        }

        // Print output:
        // The number of vowels in "hAesl": 2
        // The number of vowels in "kajdlkdsa": 2
        // The number of vowels in "helloO": 3
        // Total number of vowels: 7
        System.out.println("Total number of vowels: " + total);
    }
}
