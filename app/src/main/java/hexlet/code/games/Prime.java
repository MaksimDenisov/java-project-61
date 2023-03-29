package hexlet.code.games;

import hexlet.code.Utils;

@SuppressWarnings("FieldCanBeLocal")
public class Prime implements QuestionGame {
    private final String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private final int maxNumber = 100;

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
        int number = Utils.getRandomNumber(maxNumber);
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
