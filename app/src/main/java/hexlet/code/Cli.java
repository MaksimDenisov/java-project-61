package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void printWelcome() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static String askNameAndGreeting() {
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.printf("Hello, %s!\n", name);
        return name;
    }
}
