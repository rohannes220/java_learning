package practice.classes.constructors.car;

public class Car {
    int year;
    double mileage;
    String make;
    String model;
    String color;

    Car(String ma, String mo, int y, double m, String c) {
        year = y;
        mileage = m;
        make = ma;
        model = mo;
        color = c;
    }
}
