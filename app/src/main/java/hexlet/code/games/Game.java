package hexlet.code.games;

import java.util.Scanner;

public class Game {
    private static final String MSG_WELCOME = "Welcome to the Brain Games!";
    private static final String MSG_ASK_NAME = "May I have your name?";
    private static final String MSG_GREETING = "Hello, %s!\n";

    private static final String MSG_CONGRATULATION = "Congratulations, %s!\n";
    private static final String MSG_QUESTION = "Question: %s\n";
    private static final String MSG_YOUR_ANSWER = "Your answer: %s\n";
    private static final String MSG_CORRECT = "Correct!";
    private static final String MSG_WRONG_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.\n";
    private static final String MSG_TRY_AGAIN = "Let's try again, %s!\n";

    public static void play(Scanner scanner, Playable playable) {
        System.out.println(MSG_WELCOME);
        System.out.println(MSG_ASK_NAME);
        String name = scanner.next();
        System.out.printf(MSG_GREETING, name);
        System.out.println(playable.getRules());
        for (int i = 0; i < 3; i++) {
            playable.startRound();
            System.out.printf(MSG_QUESTION, playable.getQuestion());
            String answer = scanner.next();
            System.out.printf(MSG_YOUR_ANSWER, answer);
            if (answer.equals(playable.getCorrectAnswer())) {
                System.out.println(MSG_CORRECT);
            } else {
                System.out.printf(MSG_WRONG_ANSWER, answer, playable.getCorrectAnswer());
                System.out.printf(MSG_TRY_AGAIN, name);
                return;
            }
        }
        System.out.printf(MSG_CONGRATULATION, name);
    }
}
