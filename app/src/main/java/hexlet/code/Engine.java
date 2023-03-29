package hexlet.code;

import hexlet.code.games.QuestionGame;

import java.util.Scanner;

public class Engine {
    private static final int GAME_ROUNDS = 3;

    public static void play(QuestionGame game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.next();
        System.out.printf("Hello, %s!\n", name);
        System.out.println(game.getRules());
        for (int i = 0; i < GAME_ROUNDS; i++) {
            QuestionGame.Question question = game.getNewQuestion();
            System.out.printf("Question: %s\n", question.question());
            String answer = scanner.next();
            System.out.printf("Your answer: %s\n", answer);
            if (answer.equals(question.answer())) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, question.answer());
                System.out.printf("Let's try again, %s!\n", name);
                scanner.close();
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", name);
        scanner.close();
    }
}
