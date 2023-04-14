package practice.arrays;

public class PrintArray {
    public static void main(String[] args) {
        // 1. Create an array with the values 21, -35, 124, -44, -19
        int[] array = { -1921, -35, 124, -44, };

        // 2. Print the array
        // {21, -35, 124, -44, -19}

        // Method 1
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Method 2
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println("}");
    }
}
