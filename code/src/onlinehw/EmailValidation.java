package onlinehw;

public class EmailValidation {
    // https://edabit.com/challenge/7r4Hz8MvJq4sbHhXB
    public static boolean emailValidation(String email) {
        int atIndex = email.indexOf("@");
        // 1. find @
        if (atIndex == -1) {
            return false;
        }

        // 2. check if there are characters before @
        if (atIndex == 0) {
            return false;
        }

        // 3. find if there is a dot after the @
        int properDotIndex = email.indexOf(".", atIndex);
        if (properDotIndex == -1) {
            return false;
        }

        return true;

    }

    public static void testEmailValidation() {
        // @gmail.com --> false
        // hello.gmail@com --> false
        // gmail --> false
        // hello@gmail --> false
        // rohan@gmail.com --> true
        // james.bond@gmail.com -> true

        String[] inputs = {
                "@gmail.com",
                "hell.gmail@com",
                "gmail",
                "hello@gmail",
                "rohan@gmail.com",
                "james.bond@gmail.com",
        };
        boolean[] outputs = {
                false,
                false,
                false,
                false,
                true,
                true,
        };
        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            String input = inputs[i];
            boolean expectedOutput = outputs[i];
            boolean actualOutput = emailValidation(input);
            if (expectedOutput != actualOutput) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: " + input);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of emailValidation Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);

    }

    public static void main(String[] args) {
        testEmailValidation();
    }
}
