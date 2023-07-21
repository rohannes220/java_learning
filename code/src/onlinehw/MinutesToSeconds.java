package onlinehw;

public class MinutesToSeconds {

    public static int isMinutesToSeconds(String time) {

        int length = time.length();
        int indexOfColon = time.indexOf(':');
        int totalSeconds = 0;

        // Find the minutes
        String minutesString = time.substring(0, indexOfColon);
        int minutes = Integer.valueOf(minutesString);

        // Validate minutes
        if (minutes < 0) {
            return -1;
        }

        // Convert minutes to seconds and add to total
        totalSeconds = totalSeconds + (60 * minutes);

        // Find the seconds
        String secondsString = time.substring(indexOfColon + 1, length);
        int seconds = Integer.valueOf(secondsString);

        // Validate seconds
        if (seconds >= 60 || seconds < 0) {
            return -1;
        }

        // Return total
        totalSeconds = totalSeconds + seconds;
        return totalSeconds;
    }

    public static void testisMinutesToSeconds() {
        // 01:00-->60
        // 58:60 --> -1
        // -2:60 --> -1
        // 60:-20 --> -1
        // 121:12 --> 7272
        // 02:00 --> 120
        // 76:15 --> 4575
        // 60:00 --> 3600
        // 00:38 --> 38
        // 00:00 --> 0
        String[] inputs = {
                "01:00",
                "58:60",
                "-2:60",
                "60:-20",
                "121:12",
                "02:00",
                "76:15",
                "60:00",
                "00:38",
                "00:00",
        };

        int[] expectedOutputs = { 60, -1, -1, -1, 7272, 120, 4575, 3600, 38, 0 };

        int failedCases = 0;
        int totalCases = inputs.length;
        for (int i = 0; i < totalCases; i++) {
            String input = inputs[i];
            int expectedOutput = expectedOutputs[i];
            int actualOutput = isMinutesToSeconds(input);
            if (expectedOutput != actualOutput) {
                failedCases += 1;
                System.out.println("Failed Test Case:");
                System.out.println("Input: " + input);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of isMinutesToSeconds Completed");
        System.out.println((totalCases - failedCases) + "/" + totalCases + " passed");
    }

    public static void main(String[] args) {
        testisMinutesToSeconds();
    }
}
