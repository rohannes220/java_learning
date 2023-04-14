package practice.arrays;

public class ProductArray {
    public static void main(String[] args) {
        // Create a list of arrays and find the product
        int[] array1 = { 12, -35, 34, 44, 15 };
        int product = 1;
        int n = array1.length;

        // Do the math
        for (int i = 0; i < n; i++) {
            product = product * array1[i];
        }

        // Print it
        System.out.println("The product of all the numbers in the array is: " + product);
    }

}
