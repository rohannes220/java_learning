package practice.functions;

public class Mystery5 {
    public static int f(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x + f(x - 1);
        }
    }

    public static void main(String[] args) {
        int a = f(4);
        System.out.println(a);
    }
}
