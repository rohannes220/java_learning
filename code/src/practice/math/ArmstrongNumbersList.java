package practice.math;

public class ArmstrongNumbersList {
    public static void main(String[] args) {
        // List of armstrong numbers between 1 and 300:
        // 1
        // 153
        int start = 1;
        int end = 300;

        // add code here
        System.out.println("List of armstrong numbers between " + start + " and " + end + ':');
        for (int x = start; x <= end; x++) {
            int sumofCubes = 0;
            int xCopy = x;
            while (xCopy > 0) {
                int digit = xCopy % 10;
                sumofCubes = sumofCubes + (digit * digit * digit);
                xCopy = xCopy / 10;
            }
            if (x == sumofCubes) {
                System.out.println(x);
            }
        }
        // end here
    }
}
