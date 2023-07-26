package onlinehw;

//https://edabit.com/challenge/2Cbbs3pvH2gCMZMs
public class Move {

    public static String move(String w) {
        int length = w.length();
        String newWord = "";
        for (int i = 0; i < length; i++) {
            char ch = w.charAt(i);
            if (ch == 'Z' || ch == 'z') {
                return "error!";
            }
            int newAscii = ch + 1;
            char newChar = (char) newAscii;
            newWord += newChar;
        }
        return newWord;
    };

    public static void testMove() {
        // hello--> "ifmmp"
        // bye --> "czf"
        // welcome --> "xfmdpnf"
        // drizzle --> "error!"
        // h -> l
        // StEAl --> TuFBo
        // Ale -- > Bof
        // SMELL --> TNFMM
        // IdIoT --> JeJpU
        // Zinc --> error!

        String[] inputs = {
                "hello",
                "bye",
                "welcome",
                "h",
                "StEAl",
                "Ale",
                "SMELL",
                "IdIoT",
                "Zinc",
        };

        String[] outputs = {
                "ifmmp",
                "czf",
                "xfmdpnf",
                "i",
                "TuFBm",
                "Bmf",
                "TNFMM",
                "JeJpU",
                "error!"
        };

        int totalTestCases = inputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            String input = inputs[i];
            String expectedOutput = outputs[i];
            String actualOutput = move(input);
            if (expectedOutput.equals(actualOutput) == false) {
                System.out.println("Failed Test Case: ");
                System.out.println("Input: " + input);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of move complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);

    }

    public static void main(String[] args) {
        testMove();
    }

}
