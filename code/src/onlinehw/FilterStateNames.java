package onlinehw;

import java.util.Arrays;

public class FilterStateNames {
    // https://edabit.com/challenge/3mCJ3idbMqueRTa7b

    public static boolean isAbbreviated(String state) {
        return state.length() == 2;
    }

    public static String[] filterStateNames(String[] states, String category) {
        // Count full names and abb names
        int fullNamesCount = 0;
        int abbNamesCount = 0;
        for (String state : states) {
            if (isAbbreviated(state)) {
                abbNamesCount += 1;
            } else {
                fullNamesCount += 1;
            }
        }

        // Store fullNames and abbNames in array. The array length is determined by how
        // many names we have of each type.
        String[] fullNames = new String[fullNamesCount];
        String[] abbNames = new String[abbNamesCount];

        // Difficult to determine where each name will go in array
        // Count variable
        // What does it do?
        // the count directly corelates to which index we will add the name to in the
        // respective array
        // For Example [CA,Arizona,Illinois,NC]
        // FullNamesCount (FNC) and AbbNamesCount (ANC) = 0;
        // Since the abbName Count is empty, CA will be added at input 0 (ANC IS NOW 1)
        // Since the fullName Count is empty , Arizona will be added at input 0 (FNC IS
        // NOW 1)
        // Illinois will be added to FNC 1 (index 1); (ADD 1 TO FNC)
        // NC will be added to ANC 1 (index 1); (Add 1 to ANC)
        int currFullNamesCount = 0;
        int currAbbNamesCount = 0;

        // Loop over each element and see if it is a full name or abb name
        // isAbb function checks to see if state is abb and if so it adds to
        // currAbbNamesCount
        for (String state : states) {
            if (isAbbreviated(state)) {
                abbNames[currAbbNamesCount] = state;
                currAbbNamesCount += 1;
            } else {
                fullNames[currFullNamesCount] = state;
                currFullNamesCount += 1;
            }
        }

        // Looks to see what type of category is inputted and from there we return the
        // category specific array
        if (category.equals("abb")) {
            return abbNames;
        }
        return fullNames;
    };

    public static void testFilterStateNames() {
        String[][] statesInputs = {
                { "Arizona", "Ohio", "California" },
                { "UT", "MA" },
                { "Wyoming", "Indiana", "WA" },
                { "Oregon", "NY", "NC" },
                { "SC" },
                // {},
                // { "NEVADA, Mississippi, Michigan, Pennsylvania" },
        };
        String[] categoryInputs = { "full", "abb", "abb", "full", "abb", "full", "abb" };
        String[][] expectedOutputs = {
                { "Arizona", "Ohio", "California" },
                { "UT", "MA" },
                { "WA" },
                { "Oregon" },
                { "SC" },
                // {""},
                // {},
        };

        int numOfTestCases = statesInputs.length;
        int failedCases = 0;
        for (int i = 0; i < numOfTestCases; i++) {
            String[] statesInput = statesInputs[i];
            String categoryInput = categoryInputs[i];
            String[] expectedOutput = expectedOutputs[i];
            String[] actualOutput = filterStateNames(statesInput, categoryInput);
            boolean areEqual = Arrays.equals(expectedOutput, actualOutput);
            if (areEqual == false) {
                failedCases += 1;
                System.out.println("Failed Test Case:");
                System.out.println("Parameter One: " + statesInput);
                System.out.println("Parameter Two: " + categoryInput);
                System.out.println("Actual Output: " + actualOutput);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println();
            }
        }
        System.out.println("Testing of filterStateNames Completed");
        System.out.println((numOfTestCases - failedCases) + "/" + numOfTestCases + " passed");
    }

    public static void main(String[] args) {
        testFilterStateNames();
    }

}
