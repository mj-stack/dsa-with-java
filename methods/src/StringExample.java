import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println(myGreet(name));
    }

    static String myGreet(String name) {
        return "Hello " + name;
    }

    static String greet() {

        String greeting = "How are you";

        return greeting;
    }
}
