package practice.classes.car;

public class Driver {
    public static void main(String[] args) {
        // Output
        // ***************
        // * Car details *
        // ***************
        // Make: Tesla
        // Model Name: X
        // Year: 2021
        // Mileage: 10000 miles
        // This car is not a sedan!
        Car teslaModelX = new Car();
        teslaModelX.isSedan = false;
        teslaModelX.mileage = 10000;
        teslaModelX.year = 2021;
        teslaModelX.make = "Tesla";
        teslaModelX.modelName = "X";
        // printCarNaive(teslaModelX.make, teslaModelX.modelName, teslaModelX.year,
        // teslaModelX.mileage, teslaModelX.isSedan);
        printCar(teslaModelX);

        Car landRoverDefender110 = new Car();
        landRoverDefender110.isSedan = false;
        landRoverDefender110.mileage = 40000;
        landRoverDefender110.year = 2022;
        landRoverDefender110.make = "Land Rover";
        landRoverDefender110.modelName = "Defender 110";
        printCarNaive(landRoverDefender110.make, landRoverDefender110.modelName, landRoverDefender110.year,
                landRoverDefender110.mileage, landRoverDefender110.isSedan);

        // Output
        // ***************
        // * Car details *
        // ***************
        // Make: Toyota
        // Model Name: Corolla
        // Year: 2010
        // Mileage: 25000 miles
        // This car is a sedan!
        Car corolla = new Car();
        corolla.isSedan = true;
        corolla.mileage = 25000;
        corolla.year = 2010;
        corolla.make = "Toyota";
        corolla.modelName = "Corolla";
        printCar(corolla);
        // printCarNaive(corolla.make, corolla.modelName, corolla.year, corolla.mileage,
        // corolla.isSedan);
    }

    public static void printCarNaive(String make, String modelName, int year, int mileage, boolean isSedan) {
        System.out.println("***************");
        System.out.println("* Car details *");
        System.out.println("***************");
        System.out.println("Make: " + make);
        System.out.println("Model Name: " + modelName);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " miles");
        if (isSedan) {
            System.out.println("This car is a sedan!");
        } else {
            System.out.println("This car is not a sedan!");
        }
    }

    public static void printCar(Car c) {
        System.out.println("***************");
        System.out.println("* Car details *");
        System.out.println("***************");
        System.out.println("Make: " + c.make);
        System.out.println("Model Name: " + c.modelName);
        System.out.println("Year: " + c.year);
        System.out.println("Mileage: " + c.mileage + " miles");
        if (c.isSedan) {
            System.out.println("This car is a sedan!");
        } else {
            System.out.println("This car is not a sedan!");
        }
    }
}
