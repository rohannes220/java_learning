package practice.patterns.pattern12;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 15;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int j = 1; j <= n - 1; j++) {
            for (int i = 1; i <= n - j - 1; i++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= n - j; a++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
