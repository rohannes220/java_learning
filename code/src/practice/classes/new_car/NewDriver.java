package practice.classes.new_car;

public class NewDriver {
  public static void printCar(NewCar m) {
    System.out.println("***************");
    System.out.println("* Car details *");
    System.out.println("***************");
    System.out.println("Make: " + m.make);
    System.out.println("Model: " + m.modelName);
    System.out.println("Year: " + m.year);
    System.out.println("Mileage: " + m.mileage);
    if (m.isSedan = true) {
      System.out.println("The car is a sedan!");
    } else {
      System.out.println("The car is not a sedan");
    }
  }

  public static void main(String[] args) {
    NewCar bmwI8 = new NewCar();
    bmwI8.year = 2021;
    bmwI8.isSedan = true;
    bmwI8.modelName = "i8";
    bmwI8.mileage = 92000;
    bmwI8.make = "Bmw";
    printCar(bmwI8);

    NewCar hondaCivic = new NewCar();
    hondaCivic.year = 2020;
    hondaCivic.make = "Honda";
    hondaCivic.modelName = "Civic";
    hondaCivic.isSedan = true;
    hondaCivic.mileage = 80000;
    printCar(hondaCivic);
  }
}
