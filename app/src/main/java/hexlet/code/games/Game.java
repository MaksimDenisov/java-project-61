package hexlet.code.games;

import java.util.Scanner;

public abstract class Game {
    private static final String MSG_WELCOME = "Welcome to the Brain Games!";
    private static final String MSG_ASK_NAME = "May I have your name?";
    private static final String MSG_GREETING = "Hello, %s!\n";

    private static final String MSG_CONGRATULATION = "Congratulations, %s!\n";

    protected static final String MSG_QUESTION = "Question: %d\n";
    protected static final String MSG_YOUR_ANSWER = "Your answer: %s\n";
    protected static final String MSG_CORRECT = "Correct!";
    protected static final String MSG_WRONG_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.\n";
    protected static final String MSG_TRY_AGAIN = "Let's try again, %s!\n";

    private String name;
    private final Scanner scanner;

    public Game(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println(MSG_WELCOME);
        System.out.println(MSG_ASK_NAME);
        name = scanner.next();
        System.out.printf(MSG_GREETING, name);
        System.out.println(getRules());
        for (int i = 0; i < 3; i++) {
            if (!round()) {
                return;
            }
        }
        System.out.printf(MSG_CONGRATULATION, name);
    }

    public final String getName() {
        return name;
    }

    public final Scanner getScanner() {
        return scanner;
    }

    protected void printCorrectAnswer() {
        System.out.println(MSG_CORRECT);
    }

    protected void printWrongAnswer(String answer, String correctAnswer) {
        System.out.printf(MSG_WRONG_ANSWER, answer, correctAnswer);
        System.out.printf(MSG_TRY_AGAIN, getName());
    }

    protected int getRandomNumber() {
        return (int) Math.round(Math.random() * 100);
    }

    protected abstract String getRules();

    protected abstract boolean round();
}
