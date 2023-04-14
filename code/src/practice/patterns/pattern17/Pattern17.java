package practice.patterns.pattern17;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                if (i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

}
