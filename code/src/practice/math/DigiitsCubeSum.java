package practice.math;

public class DigiitsCubeSum {
    public static void main(String[] args) {
        // Find the sum of the cubes of all the digits of n
        int n = 1235;
        int sumOfCubes = 0;

        // write code here
        // after this comment
        int nCopy = n;
        while (nCopy > 0) {
            int digit = nCopy % 10;
            sumOfCubes = sumOfCubes + (digit * digit * digit);
            nCopy = nCopy / 10;
        }
        // and end here

        // this should print the sum of cubes of digits of n
        System.out.println("Sum of cubes of digits of " + n + ": " + sumOfCubes);
    }
}
