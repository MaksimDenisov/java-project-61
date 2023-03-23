package hexlet.code.games;

import hexlet.code.Utils;

public class GCD implements QuestionGame {
    private static final String RULES = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 99;

    @Override
    public final String getRules() {
        return RULES;
    }

    @Override
    public final Question getNewQuestion() {
        int a = Utils.getRandomNumber(MAX_NUMBER) + 1;
        int b = Utils.getRandomNumber(MAX_NUMBER) + 1;
        return new Question(String.format("%d %d", a, b), String.valueOf(getGCD(a, b)));
    }

    private int getGCD(int a, int b) {
        while ((a % b) > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return b;
    }
}
