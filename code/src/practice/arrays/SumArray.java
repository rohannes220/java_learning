package practice.arrays;

public class SumArray {
    public static void main(String[] args) {
        // Create an integer array of length 6 with random integers
        int[] array = { -11, 3, 5, 7, 9, 11 };

        // Find the sum of all the elements in the array
        int sum = 0;
        int n = array.length;
        for (int i = 0; i <= n - 1; i++) {
            sum = sum + array[i];
        }

        // Print the sum
        // Sum of elements of the array: 21
        System.out.println("Sum of elements of the array: " + sum);
    }
}
