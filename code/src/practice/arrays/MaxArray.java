package practice.arrays;

public class MaxArray {
    public static void main(String[] args) {
        // Create an integer array of length 6 with random integers
        int[] array = { -11, -30, -85, -47, -99, -511 };

        // Find the maximum value of all the elements in the array
        int n = array.length;
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Print the max
        // Max of elements of the array: <max>
        System.out.println("Max of elements of the array: " + max);
    }
}
