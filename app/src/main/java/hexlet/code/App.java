package hexlet.code;


import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final String MSG_CHOOSE_GAME = "Please enter the game number and press Enter.";
    private static final String MSG_GREETING = "1 - Greet";
    private static final String MSG_GAME_EVEN = "2 - Even";
    private static final String MSG_GAME_CALC = "3 - Calc";
    private static final String MSG_GAME_GCD = "4 - GCD";
    private static final String MSG_GAME_PROGRESSION = "5 - Progression";
    private static final String MSG_GAME_PRIME = "6 - Prime";
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
        System.out.println(MSG_GAME_CALC);
        System.out.println(MSG_GAME_GCD);
        System.out.println(MSG_GAME_PROGRESSION);
        System.out.println(MSG_GAME_PRIME);
        System.out.println(MSG_EXIT);
        switch (scanner.next()) {
            case "1":
                Cli.printWelcome();
                Cli.askNameAndGreeting();
                break;
            case "2":
                new Even(scanner).start();
                break;
            case "3":
                new Calculator(scanner).start();
                break;
            case "4":
                new GCD(scanner).start();
                break;
            case "5":
                new Progression(scanner).start();
                break;
            case "6":
                new Prime(scanner).start();
                break;
            case "0":
                break;
            default:
                chooseGame(scanner);
        }
    }
}
