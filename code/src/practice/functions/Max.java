package practice.functions;

public class Max {

    public static int getMax(int a, int b) {
        // a > b
        if (a > b) {
            return a;
        }
        // a <= b
        return b;
    }

    public static int getMin(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    public static void printMaxandMin(int a, int b, int max, int min) {
        System.out.println("value 1: " + a + ", value 2: " + b + ", max: " + max + ", min: " + min);
    }

    public static void processIntegers(int a, int b) {
        int max = getMax(a, b);
        int min = getMin(a, b);
        printMaxandMin(a, b, max, min);
    }

    public static void main(String[] args) {
        // "value 1: 10, value 2: 78, max: 78, min: 10"
        processIntegers(10, 78);
        processIntegers(-11, 21);
        processIntegers(11, 210);

    }
}
