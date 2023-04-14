package practice.functions;

public class Greeting {
    public static void printGreeting(String greeting, String name) {
        System.out.println(greeting + ", " + name + "! Goodbye.");
    }

    public static void main(String[] args) {
        printGreeting("Good morning", "Rohan"); // Good morning, Rohan! Goodbye.
        printGreeting("Good evening", "Dharma"); // Good evening, Dharma! Goodbye.
        // Hello, Andrew! Goodbye.
        // printGreeting("Good evening", "Dharma");
        printGreeting("Hello", "Andrew");
    }

}