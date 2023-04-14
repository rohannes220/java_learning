package practice.functions;

public class Sum {
    public static int calculateSum(int x, int y) {
        int c = x + y;
        return c;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = calculateSum(a, b);
        System.out.println(a + " + " + b + " = " + sum);
    }

}
