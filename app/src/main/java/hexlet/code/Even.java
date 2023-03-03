package hexlet.code;

import java.util.Scanner;

public class Even {
    private static final String MSG_WELCOME = "Welcome to the Brain Games!";
    private static final String MSG_ASK_NAME = "May I have your name?";
    private static final String MSG_GREETING = "Hello, %s!\n";
    private static final String MSG_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final String MSG_QUESTION = "Question: %d\n";
    private static final String MSG_YOUR_ANSWER = "Your answer: %s\n";
    private static final String MSG_CORRECT = "Correct!";
    private static final String MSG_WRONG_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'.\n";
    private static final String MSG_TRY_AGAIN = "Let's try again, %s!\n";
    private static final String MSG_CONGRATULATION = "Congratulations, %s!\n";
    private static final String NO = "no";
    private static final String YES = "yes";


    public static void start(Scanner scanner) {
        System.out.println(MSG_WELCOME);
        System.out.println(MSG_ASK_NAME);
        String name = scanner.next();
        System.out.printf(MSG_GREETING, name);
        System.out.println(MSG_RULE);
        for (int i = 0; i < 3; i++) {
            long number = Math.round(Math.random() * 100);
            System.out.printf(MSG_QUESTION, number);
            String answer = scanner.next();
            String correctAnswer = isEven(number);
            System.out.printf(MSG_YOUR_ANSWER, answer);
            if (answer.equals(correctAnswer)) {
                System.out.println(MSG_CORRECT);
            } else {
                System.out.printf(MSG_WRONG_ANSWER, answer, correctAnswer);
                System.out.printf(MSG_TRY_AGAIN, name);
                return;
            }
        }
        System.out.printf(MSG_CONGRATULATION, name);
    }

    private static String isEven(long number) {
        return (number % 2 == 0) ? YES : NO;
    }
}
