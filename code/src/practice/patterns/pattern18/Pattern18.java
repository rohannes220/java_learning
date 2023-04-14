package practice.patterns.pattern18;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(1);
            }
            for (int a = 1; a <= i; a++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
