package practice.functions;

public class PrintTable {
    public static void main(String[] args) {
        // 5 x 1 = 5
        // 5 x 2 = 10
        // ...
        // 5 x 7 = 35
        printTable(5, 7);

        // 7 x 1 = 7
        // 7 x 2 = 14
        // 7 x 3 = 21
        printTable(7, 3);
    }

    public static void printTable(int multiple, int second) {
        for (int i = 1; i <= second; i++) {
            // String iStr = Integer.toString(i);
            // String mStr = Integer.toString(multiple);
            int product = multiple * i;
            System.out.println(multiple + " x " + i + " = " + product);
        }
    }
}
