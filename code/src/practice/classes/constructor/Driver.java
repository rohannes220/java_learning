package practice.classes.constructor;

public class Driver {
    public static void main(String[] args) {
        int year = 2021;
        double mileage = 25000.5;
        String make = "Toyota";
        String model = "Camry";
        String color = "red";

        Car c = new Car(make, model, year, mileage, color);
        System.out.println(c);
        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.year);
        System.out.println(c.mileage);
        System.out.println(c.color);
    }
}
