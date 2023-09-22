package onlinehw;

public class TotalDistance {
    public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
        double finalUsage = fuelUsage;
        if (airConditioner) {
            finalUsage = finalUsage * 1.1;
        }
        for (int i = 0; i < passengers; i++) {
            finalUsage *= 1.05;
        }
        // finalUsage = finalUsage * Math.pow(1.05, passengers);
        double totalTravelled = (100 / finalUsage) * fuel;
        return totalTravelled;
    }

    public static void testTotalDistance() {
        double[] fuelInputs = {
                70.0,
                36.1,
                55.5,
                11.0,
                55.5,
                300.0
        };
        double[] fuelUsageInputs = {
                7.0,
                8.6,
                5.5,
                11.0,
                5.5,
                25.0
        };
        int[] passengersInputs = {
                0,
                3,
                5,
                0,
                5,
                11,
        };
        boolean[] aCInputs = {
                false,
                true,
                false,
                false,
                false,
                true,
        };
        double[] expectedOutputs = {
                1000.0,
                331.83,
                807.3,
                100.0,
                807.27,
                703.8,
        };

        int totalTestCases = fuelInputs.length;
        int failedCases = 0;
        for (int i = 0; i < totalTestCases; i++) {
            double fuel = fuelInputs[i];
            double fuelUsage = fuelUsageInputs[i];
            int passengers = passengersInputs[i];
            boolean ac = aCInputs[i];
            double expectedOutput = expectedOutputs[i];
            double actualOutput = totalDistance(fuel, fuelUsage, passengers, ac);
            if (Math.abs(actualOutput - expectedOutput) > 0.00001) {
                System.out.println("Failed Test Case: ");
                System.out.println("Fuel Input: " + fuel);
                System.out.println("Fuel Usage Input: " + fuelUsage);
                System.out.println("Passengers: " + passengers);
                System.out.println("Airconditioner: " + ac);
                System.out.println("Expected Output: " + expectedOutput);
                System.out.println("Actual Output: " + actualOutput);
                failedCases += 1;
                System.out.println();
            }
        }
        System.out.println("Testing of highestDigit Complete!");
        System.out.println("Success rate: " + (totalTestCases - failedCases) + "/" + totalTestCases);
    }

    public static void main(String[] args) {
        testTotalDistance();
    }
}
