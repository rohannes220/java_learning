package practice.classes.constructors.student;

public class Driver {
    public static void main(String[] args) {
        // Create a student class with a constructor with first
        // parameter as name and second parameter as grade

        // Create a student object
        // with initial values as name as Rohan and grade as 9.2
        Student s = new Student("Rohan", 9.2);
        System.out.println(s.isMarried);

        // Print the student object in the following format
        // Student{name="Rohan Kumar", grade=9.5}
        System.out.println("Student{name=\"" + s.name + "\", grade=" + s.grade + "}");

        // Change the grade from 9.2 to 9.3
        // Change the name to "Rohan Kumar"
        s.grade = 9.3;
        s.name = "Rohan Kumar";

        // Print the student object in the following format
        // Student{name="Rohan Kumar", grade=9.5}
        System.out.println("Student{name=\"" + s.name + "\", grade=" + s.grade + "}");

        // Create a student object
        // with initial values as name as DT and grade as 6.7
        Student n = new Student("DT", 6.7);
        System.out.println(n.isMarried);
        n.isMarried = true;
        System.out.println(n.isMarried);

        // Print the student object in the following format
        // Student{name="Rohan Kumar", grade=9.5}
        System.out.println("Student{name=\"" + n.name + "\", grade=" + n.grade + "}");
    }
}
