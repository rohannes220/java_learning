package practice.math;

public class CyclicSwap {
    public static void main(String[] args) {
        int x = 5;
        int y = 11;
        int z = 31;

        System.out.println(" x: " + x + " y: " + y + " z: " + z); // x: 5 y: 11 z: 31

        // do something
        int xCopy = x;
        x = y;
        y = z;
        z = xCopy;

        System.out.println(" x: " + x + " y: " + y + " z: " + z); // x: 11 y: 31 z: 5
    }
}
