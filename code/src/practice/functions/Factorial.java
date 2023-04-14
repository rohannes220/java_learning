package practice.functions;

public class Factorial {
    public static int factorial(int y) {
        int product = 1;
        for (int i = 1; i <= y; i++) {
            product = product * i;
        }
        return product;
    }

    public static void main(String[] args) {
        int x = 5;
        int xFac = factorial(x);
        System.out.println(x + "! = " + xFac); // 5! = 120

        int y = 6;
        System.out.println(y + "! = " + factorial(y)); // 6! = 720
    }

}
