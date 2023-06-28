package onlinehw;

public class Square {
    public static int computeSquare(int number) {
        return number * number;
    }

    public static void testComputeSquare() {
        int[] inputValues = { -5, 0, 3, 2, -2, 11, 10 };

        int[] expectedValues = { 25, 0, 9, 4, 4, 121, 100 };
        int totalTestCases = inputValues.length;
        int failedCases = 0;
        for (int i = 0; i < inputValues.length; i++) {
            int input = inputValues[i];
            int expected = expectedValues[i];
            int result = computeSquare(input);
            if (result != expected) {
                failedCases += 1;
                System.out.println("Test case failed");
                System.out.println("Input: " + input);
                System.out.println("Expected: " + expected);
                System.out.println("Computed: " + result);
                System.out.println();
            }
        }

        int passedCases = totalTestCases - failedCases;
        System.out.println(passedCases + "/" + totalTestCases + " cases passed");
        System.out.println("Testing completed");
    }

    public static void main(String[] args) {
        testComputeSquare();
    }
}
