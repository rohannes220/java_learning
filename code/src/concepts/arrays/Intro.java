package concepts.arrays;

public class Intro {
    public static void main(String[] args) {
        // 1. Create an array with values -3, 5, 15, 17, 2, -19
        int[] array = { -3, 5, 15, 17, 2, -19 };

        // 2. Assign the value at index 5 to a variable x and print it
        int x = array[5];
        System.out.println(x);

        // 3. Modify the value at index 3 to -99
        array[3] = -99;

        // 4. Print all the values of the arra
        System.out.println("The length of array is " + array.length);
        System.out.println("The elements are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        /**
         * Another way to create an array
         */
        int[] array2 = new int[6];
        array2[0] = -3;
        array2[1] = 5; 
        array2[2] = 15; 
        array2[3] = 17; 
        array2[4] = 2; 
        array2[5] = -19; 

        // Print all the values of the arra
        System.out.println("The length of array is " + array2.length);
        System.out.println("The elements are:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
