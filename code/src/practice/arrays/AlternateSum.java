package practice.arrays;

public class AlternateSum {
    public static void main(String[] args) {
        // Alternate sum: 23 - 45 + 9 - 81 + 24 = (23 + 9 + 24) - (45 + 81)
        // Output:
        // The alternate sum is: -70
        int[] array = { 12, 23 };
        int alternateSum = 0;

        // * write code after this *
        // Find alternate sum
        int pSum = 0;
        int nSum = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            pSum = pSum + array[i];
        }
        for (int i = 1; i < array.length; i = i + 2) {
            nSum = nSum + array[i];
        }
        alternateSum = pSum - nSum;
        // * before this *

        // Printing alternate sum
        System.out.println("Alternate sum: " + alternateSum);
    }
}
