package practice.patterns.pattern19;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int a = n - i; a >= 1; a--) {
                System.out.print(' ');
            }
            // System.out.print(1);
            for (int x = 1; x <= i; x++) {
                System.out.print(x);
            }
            for (int y = i - 1; y >= 1; y--) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

}
