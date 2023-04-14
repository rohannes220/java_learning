package practice.math;

public class Swap {
    public static void main(String[] args) {
        int x = 5;
        int y = 11;

        System.out.println(" x: " + x + " y: " + y); // x: 5 y: 11

        // do something
        int xCopy = x;
        x = y;
        y = xCopy;

        System.out.println(" x: " + x + " y: " + y); // x: 5 y: 11
    }
}