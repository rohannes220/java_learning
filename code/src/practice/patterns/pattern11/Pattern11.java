package practice.patterns.pattern11;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int x = n - 1; x >= i; x--) {
                System.out.print("*");
            }
            // Alternate way
            // for (int x = 1; x <= n - i; x++) {
            // System.out.print("*");
            // }
            System.out.println();
        }
    }
}
