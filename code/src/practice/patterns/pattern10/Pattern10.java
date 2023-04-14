package practice.patterns.pattern10;

public class Pattern10 {
    public static void main(String[] args) {
        int x = 4;

        for (int c = 1; c <= x; c++) {
            System.out.print('#');
        }
        System.out.println();

        for (int j = 1; j <= x - 2; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int i = 1; i <= x - 2; i++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
        for (int a = 1; a <= x - 1; a++) {
            System.out.print(" ");
        }
        for (int c = 1; c <= x; c++) {
            System.out.print('#');
        }
        System.out.println();
    }

}
