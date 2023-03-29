package hexlet.code.games;

import hexlet.code.Utils;

@SuppressWarnings("FieldCanBeLocal")
public class GCD implements QuestionGame {
    private final String rules = "Find the greatest common divisor of given numbers.";
    private final int maxNumber = 99;

    /**
     * Rules of game.
     * @return Rules of game.
     */
    @Override
    public String getRules() {
        return rules;
    }

    /**
     * Get new question.
     * @return Question with correct answer.
     */
    @Override
    public Question getNewQuestion() {
        int a = Utils.getRandomNumber(maxNumber) + 1;
        int b = Utils.getRandomNumber(maxNumber) + 1;
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
