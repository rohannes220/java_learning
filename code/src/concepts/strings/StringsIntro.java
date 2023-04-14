package concepts.strings;

public class StringsIntro {
    public static void main(String[] args) {
        String s = "rohan KuMar";
        System.out.println("the number of characters in '" + s + "': " + s.length());
        System.out.println("the lowercase of '" + s + "': " + s.toLowerCase());
        System.out.println("the uppercase of '" + s + "': " + s.toUpperCase());

        for (int i = 0; i < s.length(); i++) {
            System.out.println("the char at index " + i + " of '" + s + "': " +
                    s.charAt(i));
        }
        System.out.println("the substring of '" + s + "': " + s.substring(1, 4));
    }
}
