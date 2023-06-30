package onlinehw;

public class ValidatePin {

    public static boolean validate(String pin) {
        int length = pin.length();
        if (length == 4 || length == 6) {
            for (int i = 0; i <= length - 1; i++) {
                char ch = pin.charAt(i);
                if (Character.isDigit(ch) == false) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void testValidate() {
        String pin = "123aaa";
        boolean result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: false, result: " + result);

        pin = "0";
        result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: false, result: " + result);

        pin = " ";
        result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: false, result: " + result);

        pin = "2222";
        result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: true, result: " + result);

        pin = " 1a ";
        result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: false, result: " + result);

        pin = "1234";
        result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: true, result: " + result);

        pin = "121212121212121212";
        result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: false, result: " + result);

        pin = "14908";
        result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: false, result: " + result);

        pin = "149087";
        result = validate(pin);
        System.out.println("Pin: " + pin + ", expected: true, result: " + result);

    }

    public static void testValidate2() {
        String[] inputValues = { "abcd1243", "1234", "6", "12345h", "aassff12", "0", "", " a g b", "222222", "222222A",
                "123456", " " };
        boolean[] expectedValues = { false, true, false, false, false, false, false, false, true, false, true, false };

        int totalTestCases = inputValues.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            String currentInputValue = inputValues[i];
            boolean currentExpectedValue = expectedValues[i];
            boolean result = validate(currentInputValue);
            if (result != currentExpectedValue) {
                failedCases += 1;
                System.out.println("Test case failed");
                System.out.println("Input: " + currentInputValue);
                System.out.println("Expected Output: " + currentExpectedValue);
                System.out.println("Actual Output: " + result);
                System.out.println("");
            }
        }
        // 8 / 10 test cases passed
        int passedCases = totalTestCases - failedCases;
        System.out.println(passedCases + " / " + totalTestCases + " test cases passed");
    }

    public static void main(String args[]) {
        testValidate2();
    }

}
