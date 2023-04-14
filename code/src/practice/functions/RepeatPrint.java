package practice.functions;

public class RepeatPrint {
    public static void main(String[] args) {
        // ROhan
        // ROhan
        // ROhan
        printRepeatString("Rohan", 3);

        // Dharma
        // Dharma
        // Dharma
        // Dharma
        printRepeatString("Dharma", 4);
    }

    public static void printRepeatString(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }
}
