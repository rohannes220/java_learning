package practice.functions;

public class Mystery {
    public static int g(int p, int q, int r) {
        System.out.println("g(" + p + ", " + q + ", " + r + ")");
        return p + q + r;
    }

    public static int f(int x) {
        System.out.println("f(" + x + ")");
        int a = 12;
        int b = x * a;
        int c = g(a, b, x);
        System.out.println("Computed c: " + c);
        return c + 3;
    }

    public static void main(String[] args) {
        System.out.println("main()");
        int y = 6;
        int x = f(y);
        System.out.println(x);
    }
}
