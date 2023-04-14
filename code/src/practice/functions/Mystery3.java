package practice.functions;

public class Mystery3 {
    public static int g(int a) {
        return a * a;
    }

    public static String h(int a) {
        System.out.println(a + "^2 = " + (a * a));
        return "Success";
    }

    public static void f(int a) {
        System.out.println(a + "^2 = " + (a * a));
    }

    public static void main(String[] args) {
        int x = 5;
        f(x);

        String c = h(x);
        System.out.println(c.substring(0, 3));

        int y = g(x);
        System.out.println(x + "^2 = " + y);
    }
}
