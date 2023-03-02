package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final String MSG_WELCOME = "Welcome to the Brain Games!";
    private static final String MSG_ASK_NAME = "May I have your name?";
    private static final String MSG_GREETING = "Hello, %s!\n";

    public static void printWelcome() {
        System.out.println(MSG_WELCOME);
    }

    public static void askNameAndGreeting() {
        System.out.println(MSG_ASK_NAME);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.printf(MSG_GREETING, name);
    }
}
