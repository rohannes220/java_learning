package practice.patterns.pattern16;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // int nCopy = n;
        // for (int i = 1; i <= nCopy; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(j);
        // }
        // n--;
        // System.out.println(' ');
        // }
        // for (int k = 1; k <= nCopy; k++) {
        // for (int l = 1; l <= k; l++) {
        // System.out.print(l);
        // }
        // System.out.println(' ');
        // }
    }
}