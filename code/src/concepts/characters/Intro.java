package concepts.characters;

public class Intro {
    public static void main(String[] args) {
        // ASCII values
        // 'A' - 65
        // 'B' - 66
        // 'Z' - 90
        // 'a' - 97
        // 'b' - 98
        // 'z' - 122
        System.out.println('a' + 'b' + "bcd"); // 195bcd
        System.out.println('a' + "b" + "bcd"); // abbcd
        System.out.println('a' + "b" + 'c'); // abc
        System.out.println('a' + "b" + 'c' + 'd'); // abcd
        System.out.println('a' + 'b' + "c" + 'd'); // 195cd

        // char c = 'a';
        // System.out.println(c);
        // c = (char)(c + 1);
        // c++;
        // System.out.println(c);

        for(char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        for(char c = 'P'; c >= 'A'; c--) {
            System.out.print(c);
        }
        System.out.println();
    }
}
