package concepts.functions;

public class FunctionsIntro {
    public static void greeting(String name) {
        System.out.println("Hello " + name + "!");
        System.out.println("how are you?!");
        System.out.println("Bye!");
    }

    public static void main(String[] args) {
        greeting("Rohan");

        System.out.println();
        System.out.println("some lines of print here");
        System.out.println("some lines of print here and here");
        System.out.println();

        greeting("Dharma");

        // for (int i = 1; i <= 5; i++) {
        //     greeting();
        // }
    }

}
