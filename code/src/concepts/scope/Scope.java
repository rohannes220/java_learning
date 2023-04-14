package concepts.scope;

public class Scope {
    public static void main(String[] args) {
        // When i is declared inside the loop
        // we cannot access it outside
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        for (int i = 11; i <= 12; i++) {
            System.out.println(i);
        }

        // Since j is declared outside the for loop
        // we can access and print j after the loop has been exited
        int j = 19;
        j = 10;
        for (j = 1; j <= 3; j++) {
            System.out.println(j);
        }
        System.out.println(j);

        // while loop
        int x = 4;
        while (x > 1) {
            int y = x * x;
            System.out.println(y);
            x -= 2;
        }
        System.out.println(x);

        // if
        int z = 105;
        if (z != 34) {
            boolean isZEven = (z % 2 == 0);
            System.out.println(isZEven);
            z++;
        }
        System.out.println(z);

        System.out.println("end");
    }
}
