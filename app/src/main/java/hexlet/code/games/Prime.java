package hexlet.code.games;

import hexlet.code.Utils;

public class Prime implements QuestionGame {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    @Override
    public final String getRules() {
        return RULES;
    }

    @Override
    public final Question getNewQuestion() {
        int number = Utils.getRandomNumber(MAX_NUMBER);
        return new Question(String.valueOf(number), isPrime(number) ? "yes" : "no");
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
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
