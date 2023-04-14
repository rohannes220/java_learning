package practice.patterns.pattern14;

public class Pattern14 {
  public static void main(String[] args) {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - j; j++) {
        System.out.print(" ");
      }
      for (int a = 1; a < i; a++) {
        System.out.println("*");
      }
    }
    System.out.println(" ");

  }
}
