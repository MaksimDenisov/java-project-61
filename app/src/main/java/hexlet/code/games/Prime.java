package hexlet.code.games;

import java.util.Scanner;

public class Prime extends Game {
    private static final String NO = "no";
    private static final String YES = "yes";

    public Prime(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    protected boolean round() {
        int number = getRandomNumber();
        System.out.printf(MSG_QUESTION, number);
        String answer = getScanner().next();
        String correctAnswer = (isPrime(number)) ? YES : NO;
        System.out.printf(MSG_YOUR_ANSWER, answer);
        if (answer.equals(correctAnswer)) {
            printCorrectAnswer();
            return true;
        } else {
            printWrongAnswer(answer, correctAnswer);
            return false;
        }
    }

    boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
