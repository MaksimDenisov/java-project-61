package hexlet.code.games;

import hexlet.code.Utils;

@SuppressWarnings("FieldCanBeLocal")
public class Even implements QuestionGame {
    private final String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        return new Question(String.valueOf(number), (isEven(number)) ? "yes" : "no");
    }

    private boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
