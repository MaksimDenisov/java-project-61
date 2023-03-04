package hexlet.code.games;

import java.util.Scanner;

public class Even extends Game {
    private static final String NO = "no";
    private static final String YES = "yes";

    public Even(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    protected boolean round() {
        int number = getRandomNumber();
        System.out.printf(MSG_QUESTION, number);
        String answer = getScanner().next();
        String correctAnswer = isEven(number);
        System.out.printf(MSG_YOUR_ANSWER, answer);
        if (answer.equals(correctAnswer)) {
            printCorrectAnswer();
            return true;
        } else {
            printWrongAnswer(answer, correctAnswer);
            return false;
        }
    }

    private String isEven(long number) {
        return (number % 2 == 0) ? YES : NO;
    }
}
