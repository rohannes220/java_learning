package practice.functions;

public class Mystery2 {
    public static int g(int a, int b) {
        System.out.println("g(" + a + ", " + b + ")");
        return (a + b) * (a - b);
    }

    public static String f(String s, int n) {
        System.out.println("f(" + s + ", " + n + ")");
        String out = "";
        for (int i = 0; i < n; i++) {
            out = out + s;
            System.out.println(out);
        }
        return out;
    }

    public static void main(String[] args) {
        int a = g(g(2, 1), 2);
        String x = f("h", a);
        System.out.println("output: " + x);
        System.out.println("end");
    }
}
