package practice.strings;

public class IntegerToString {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println(x + y); // 12

        String xStr = Integer.toString(x);
        String yStr = Integer.toString(y);
        System.out.println(xStr + yStr); // 57
    }
}
