package practice.functions;

public class EvenOdd {
    public static boolean isEven(int y) {
        return y % 2 == 0;
    }

    public static void main(String[] args) {
        int x = 12;
        int y = -11;

        if (isEven(x)) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        if (isEven(y)) {
            System.out.println(y + " is even");
        } else {
            System.out.println(y + " is odd");
        }
    }
}
