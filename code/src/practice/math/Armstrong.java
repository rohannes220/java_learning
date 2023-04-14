package practice.math;

public class Armstrong {
    public static void main(String[] args) {
        // Find the sum of the cubes of all the digits of
        int n = 153;
        int sumOfCubes = 0;

        // code to find the sum of cubes of digits of n
        int nCopy = n;
        while (nCopy > 0) {
            int digit = nCopy % 10;
            sumOfCubes = sumOfCubes + (digit * digit * digit);
            nCopy = nCopy / 10;
        }

        // 153 is an armstrong number
        // 1235 is not an armstrong number
        // add code after this
        if (sumOfCubes == n) {
            System.out.println(n + " is an armstrong number");
        } else {
            System.out.println(n + " is not an armstrong number");
        }
        // end here

        
    }
}
