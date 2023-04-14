package practice.strings;

public class CountCharInString {
    public static void main(String[] args) {
        // String
        String str = "a quick brown fox jumps over the lazy dog";
        char ch = 'a';
        int count = 0;
        int space = 0; 

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ch) {
                count = count + 1;
            }
            else{
            space = space + 1; 
            }
        }
        // Output
        // The # times 'z' occurs in "a quick brown fox jumps over the lazy dog": 1
        System.out.println("The # times '" + ch + "' occurs in \"" + str + "\": " + count);
        
    }
}
