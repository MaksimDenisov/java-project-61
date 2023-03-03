package hexlet.code;

import java.util.Scanner;

public class App {
    private static final String MSG_CHOOSE_GAME = "Please enter the game number and press Enter.";
    private static final String MSG_GREETING = "1 - Greet";
    private static final String MSG_GAME_EVEN = "2 - Even";
    private static final String MSG_EXIT = "0 - Exit";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        chooseGame(scanner);
        scanner.close();
    }

    private static void chooseGame(Scanner scanner) {
        System.out.println(MSG_CHOOSE_GAME);
        System.out.println(MSG_GREETING);
        System.out.println(MSG_GAME_EVEN);
        System.out.println(MSG_EXIT);
        switch (scanner.next()) {
            case "1":
                Cli.printWelcome();
                Cli.askNameAndGreeting();
                break;
            case "2":
                Even.start(scanner);
                break;
            case "0":
                break;
            default:
                chooseGame(scanner);
        }
    }
}
