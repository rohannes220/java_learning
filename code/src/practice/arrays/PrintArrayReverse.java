package practice.arrays;

public class PrintArrayReverse {
    public static void main(String[] args) {
        int[] array = { -2, 7, 8, -3, -10 };

        // The reverse of {-2, 7, 8, -3, -10} is {-10, -3, 8, 7, -2}

        System.out.print("The reverse of {");
        for (int j = 0; j < array.length; j++) {
            if (j == array.length - 1) {
                System.out.print(array[j]);
            } else {
                System.out.print(array[j]);
                System.out.print(", ");
            }
        }
        System.out.print("} is {");
        for (int n = array.length - 1; n >= 0; n--) {
            if (n == 0) {
                System.out.print(array[n]);
            } else {
                System.out.print(array[n]);
                System.out.print(", ");
            }
        }
        System.out.println('}');

    }
}
