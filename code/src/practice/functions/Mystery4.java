package practice.functions;

public class Mystery4 {
    public static int f(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * f(x - 1);
        }
    }

    public static void main(String[] args) {
        int x = f(5);
        System.out.println(x);
    }
}
