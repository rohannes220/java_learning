package onlinehw;

public class HarshadNumber {

    public static boolean isHarshad(int input) {
        int inputCopy = input;
        if (input < 0) {
            input = input * -1;
        }
        int sum = 0;
        while (input > 0) {
            int digit = input % 10;
            input = input / 10;
            sum = sum + digit;
        }
        if (inputCopy % sum != 0) {
            return false;
        }
        return true;
    }

    public static void testIsHarshad() {
        int[] inputs = new int[] {
                -1456,
                55,
                1,
                756,
                18,
                100000,
                -136,
        };
        boolean[] outputs = new boolean[] {
                true,
                false,
                true,
                true,
                true,
                true,
                false,
        };

        int failedCases = 0;
        int totalCases = inputs.length;
        for (int i = 0; i < totalCases; i++) {
            int input = inputs[i];
            boolean output = outputs[i];
            boolean actualOutput = isHarshad(input);
            if (output != actualOutput) {
                failedCases += 1;
                System.out.println("Input: " + input);
                System.out.println("Output: " + output);
                System.out.println("Actual Output: " + actualOutput);
            }
        }
        System.out.println("Testing of isHarshad Completed");
        System.out.println((totalCases - failedCases) + "/" + totalCases + " passed");
    }

    public static void main(String[] args) {
        testIsHarshad();
    }
}
