package practice.classes.student;

public class Driver {
    public static void main(String[] args) {
        Student rohan = new Student();
        rohan.name = "Rohan";
        rohan.major = "PS";
        rohan.grade = 9.2;

        printStudent(rohan);

        rohan.name = rohan.name + " Kumar";
        printStudent(rohan);

        Student dharma = new Student();
        dharma.name = "Dharma";
        dharma.major = "Civil";
        dharma.grade = 6.7;
        printStudent(dharma);
    }

    public static void printStudent(Student s) {
        System.out.println("Student '" + s.name + "' from '" + s.major + "' has " + s.grade + "!!!");
    }
}
