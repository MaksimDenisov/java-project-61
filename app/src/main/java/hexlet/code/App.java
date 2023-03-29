package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.QuestionGame;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static final Map<String, QuestionGame> GAMES = new LinkedHashMap<>();

    static {
        GAMES.put("2", new Even());
        GAMES.put("3", new Calc());
        GAMES.put("4", new GCD());
        GAMES.put("5", new Progression());
        GAMES.put("6", new Prime());
    }

    public static void main(String[] args) {
        chooseGame();
    }

    public static void chooseGame() {
        final String msgGame = "%s - %s\n";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.printf(msgGame, "1", "Greet");
        GAMES.keySet().forEach(k -> System.out.printf("%s - %s\n", k, GAMES.get(k).getGameName()));
        System.out.printf(msgGame, "0", "Exit");
        String key = scanner.next();
        switch (key) {
            case "1" -> {
                Cli.printWelcome();
                Cli.askNameAndGreeting();
            }
            case "2", "3", "4", "5", "6" -> Engine.play(GAMES.get(key));
            case "0" -> {
            }
            default -> chooseGame();
        }
        scanner.close();
    }
}
