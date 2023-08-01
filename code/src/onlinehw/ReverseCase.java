package onlinehw;

//https://edabit.com/challenge/fCkawrffCeWEH5xja
public class ReverseCase {
    public static String reverseCase(String word) {
        String reverseWord = "";
        for (int i = 0; i < word.length(); i++) {
            // 1. store each individual character
            char ch = word.charAt(i);

            // 2a. take individual character and convert to opposite case
            char oppositeChar = reverseChar(ch);
            
            // 3. add oppositeChar to the reverseWord string
            reverseWord += oppositeChar;
        }
        return reverseWord;
    }

    // 2b. find opposite char through ascii
    public static char reverseChar(char ch) {
        int ascii = (int) ch;
        if (ascii >= 65 && ascii <= 90) {
            return (char) (ascii + 32);
        }
        if (ascii >= 97 && ascii <= 122) {
            return (char) (ascii - 32);
        }
        return (char) ascii;
    }

    public static void testReverseCase() {
        // Happy Birthday --> hAPPY bIRTHDAY
        // MANY THANKS --> many thanks
        // sPONtaneous --> SponTANEOUS
        // Rohan! --> error
        // I aTe PIE --> i AtE pie
        // Simonate98 --> error
        // i love blackpink --> I LOVE BLACKPINK
        // rOhAn WILL get a motorcycle --> RoHaN will GET A MOTORCYCLE
        // Vegetables are healthy! --> error
        // R --> r

        String[] inputs = {
                "Happy Birthday",
                "MANY THANKS",
                "sPONtaneous",
                "Rohan!",
                "I aTe PIE",
                "Simonate98",
                "i love blackpink",
                "rOhAn WILL get a motorcycle",
                "Vegetables are healthy!",
                "R",
        };

        String[] outputs = {
                "hAPPY bIRTHDAY",
                "many thanks",
                "SponTANEOUS",
                "rOHAN!",
                "i AtE pie",
                "sIMONATE98",
                "I LOVE BLACKPINK",
                "RoHaN will GET A MOTORCYCLE",
                "vEGETABLES ARE HEALTHY!",
                "r",
        };

        int failedCases = 0;
        int totalCases = inputs.length;
        for (int i = 0; i < totalCases; i++) {
            String input = inputs[i];
            String output = outputs[i];
            String actualOutput = reverseCase(input);
            if (!output.equals(actualOutput)) {
                failedCases += 1;
                System.out.println("Test failed");
                System.out.println("Input: " + input);
                System.out.println("Output: " + output);
                System.out.println("Actual Output: " + actualOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of reverseCase Completed");
        System.out.println((totalCases - failedCases) + "/" + totalCases + " passed");
    }

    public static void main(String[] args) {
        testReverseCase();
    }
}
