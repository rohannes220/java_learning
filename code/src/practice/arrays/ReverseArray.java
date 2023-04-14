package practice.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = { 23, 45, -9, 81, 24 };

        // Print the array
        // {1, 2, 3, 4, 5, 6, 11}
        System.out.print("Before reverse: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // add code after this
        // TODO: Reverse the array
        int n = array.length;
        for (int i = 0; i < (n / 2); i++) {
            // Swappilements at i and indexes n-i-1
            int copy = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = copy;
        }
        // before this

        // Print the array
        // {11, 6, 5, 4, 3, 2, 1}
        System.out.print("After reverse: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

}
