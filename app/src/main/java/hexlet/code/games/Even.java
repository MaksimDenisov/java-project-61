package hexlet.code.games;

import hexlet.code.Utils;

public class Even implements QuestionGame {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    @Override
    public final String getRules() {
        return RULES;
    }

    @Override
    public final Question getNewQuestion() {
        int number = Utils.getRandomNumber(MAX_NUMBER);
        return new Question(String.valueOf(number), (isEven(number)) ? "yes" : "no");
    }

    private boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
