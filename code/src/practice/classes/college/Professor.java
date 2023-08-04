package practice.classes.college;

public class Professor {
    int salary;
    String firstName;
    String lastName;
    String subject;

    public Professor(int sal, String first, String last, String subj) {
        salary = sal;
        firstName = first;
        lastName = last;
        subject = subj;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setSubject(String newSubject) {
        subject = newSubject;
    }

    // firstName - rohan, lastName - kumar
    // "kumar, rohan"
    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public void incrementSalary() {
        salary = salary + 10000;
    }
}
