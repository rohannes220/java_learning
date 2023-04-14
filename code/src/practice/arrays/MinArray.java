package practice.arrays;

public class MinArray {
    public static void main(String[] args) {
        int[] array = { -2, 7, 8, -3, -10 };
        // float min = Float.POSITIVE_INFINITY;
        int min = Integer.MAX_VALUE;
        int n = array.length;

        // find the minium

        for (int i = 0; i <= n - 1; i++) {

            if (array[i] < min) {
                min = array[i];
            }

        }
        // Print it out
        System.out.println("The minimum value is: " + min);

    }

}
