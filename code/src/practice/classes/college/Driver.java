package practice.classes.college;

public class Driver {
    public static void main(String[] args) {
        // Create a Prfessor obj with values
        // f - Rohan
        // l - Kumar
        // s - 200000
        // sub - Java
        System.out.println("Creating a Professor object");
        Professor newHire = new Professor(200000, "Rohan", "Kumar", "Java");

        // print values of attributes
        System.out.println("First Name: " + newHire.getFirstName());
        System.out.println("Last Name: " + newHire.getLastName());
        System.out.println("Subject: " + newHire.getSubject());
        System.out.println("Salary: " + newHire.getSalary());

        // print full name
        System.out.println("Full Name: " + newHire.getFullName());

        // set sub to "Advanced Java"
        System.out.println("Setting subject to 'Advanced Java'");
        newHire.setSubject("Advanced Java");
        System.out.println("New Subject: " + newHire.getSubject());

        // increment the salary by 20000
        System.out.println("Incrementing the salary by 20000");
        newHire.incrementSalary();
        newHire.incrementSalary();

        System.out.println("New Salary: " + newHire.getSalary());

        // Output:
        // Creating a Professor object
        // First Name: Rohan
        // Last Name: Kumar
        // Subject: Java
        // Salary: 200000
        // Full Name: Kumar, Rohan
        // Setting subject to 'Advanced Java'
        // New Subject: Advanced Java
        // Incrementing the salary by 20000
        // New Salary: 220000
    }
}
