package practice.strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world";

        // Problem 1
        String a1 = str.substring(7, 10);
        System.out.println(a1);// 'orl'

        // Problem 2
        String a2 = str.substring(0, 3) + str.substring(5, 7);
        System.out.println(a2);// 'Hel w'

        // Problem 3
        String a3 = str.substring(6, 11)
                .toUpperCase();
        System.out.println(a3);// 'WORLD'

        // Problem 4
        String str1 = "Rohan Kumar";
        // add code after this
        String a6 = str1.substring(6, 11);
        String a5 = str1.substring(0, 5);
        String a4 = a6 + ", " + a5;
        // before this
        System.out.println(a4); // 'Kumar, Rohan'
    }

}
