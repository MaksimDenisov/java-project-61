package hexlet.code.games;

import java.util.Scanner;

public class GCD extends Game {
    protected static final String MSG_QUESTION = "Question: %d  %d\n";

    public GCD(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    protected boolean round() {
        int a = getRandomNumber();
        int b = getRandomNumber();
        int correctAnswer = getGCD(a, b);
        System.out.printf(MSG_QUESTION, a, b);
        int answer = Integer.parseInt(getScanner().next());
        if (answer == correctAnswer) {
            printCorrectAnswer();
            return true;
        } else {
            printWrongAnswer(String.valueOf(answer), String.valueOf(correctAnswer));
            return false;
        }
    }

    private int getGCD(int a, int b) {
        while ((a % b) > 0)  {
            int r = a % b;
            a = b;
            b = r;
        }
        return b;
    }
}
