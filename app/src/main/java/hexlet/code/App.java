package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.games.Playable;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static final String MSG_CHOOSE_GAME = "Please enter the game number and press Enter.";
    private static final String MSG_GAME = "%s - %s\n";

    private static final Map<String, Playable> GAMES = new LinkedHashMap<>();

    static {
        GAMES.put("2", new Even());
        GAMES.put("3", new Calc());
        GAMES.put("4", new GCD());
        GAMES.put("5", new Progression());
        GAMES.put("6", new Prime());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        chooseGame(scanner);
        scanner.close();
    }

    private static void chooseGame(Scanner scanner) {
        System.out.println(MSG_CHOOSE_GAME);
        System.out.printf(MSG_GAME, "1", "Greet");
        GAMES.keySet().forEach(k -> System.out.printf(MSG_GAME, k, GAMES.get(k).getGameName()));
        System.out.printf(MSG_GAME, "0", "Exit");
        String key = scanner.next();
        switch (key) {
            case "1":
                Cli.printWelcome();
                Cli.askNameAndGreeting();
                break;
            case "2", "3", "4", "5", "6":
                Game.play(scanner, GAMES.get(key));
                break;
            case "0":
                break;
            default:
                chooseGame(scanner);
        }
    }
}
