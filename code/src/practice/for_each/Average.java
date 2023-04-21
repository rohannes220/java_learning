package practice.for_each;

public class Average {
    public static void main(String[] args) {
        // Declare an array
        int[] array = { 1, 2 };

        // Write a for each loop to compute the average of all nums in array
        int sum = 0;
        for (int item : array) {
            sum = sum + item;
        }

        double average = (sum * 1.0) / array.length;
        System.out.println("The average is: " + average);
    }
}
