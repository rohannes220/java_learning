package practice.arrays;

public class PrintAlternateSum {
    public static void main(String[] args) {
        // Output
        // 'Alternate sum = 23 - 45 + 9 - 81 + 24 = -70'
        int[] array = { 23, 45 };
        int alternateSum = 0;

        // * write code after this *
        System.out.print("Alternate sum = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i % 2 == 0) {
                if (i != array.length - 1) {
                    System.out.print(" - ");
                }
                alternateSum = alternateSum + array[i];
            } else {
                if (i != array.length - 1) {
                    System.out.print(" + ");
                }
                alternateSum = alternateSum - array[i];
            }
        }
        System.out.println(" = " + alternateSum);
        // * before this *
    }
}
