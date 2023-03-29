package hexlet.code.games;

import hexlet.code.Utils;

@SuppressWarnings("FieldCanBeLocal")
public class Progression implements QuestionGame {
    private final String rules = "What number is missing in the progression?";

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
        final int progressionLength = 10;
        final int progressionMaxStep = 5;
        final int progressionMaxFirstNumber = 10;

        int[] progression = new int[progressionLength];
        int first = Utils.getRandomNumber(progressionMaxFirstNumber);
        int step = Utils.getRandomNumber(progressionMaxStep) + 1;
        for (int i = 0; i < progression.length; i++) {
            progression[i] = first + step * i;
        }

        var secretIndex = (int) (Math.random() * progression.length);
        StringBuilder questionBuilder = new StringBuilder("Question:");
        for (int i = 0; i < progression.length; i++) {
            questionBuilder.append(" ").append((i == secretIndex) ? ".." : String.valueOf(progression[i]));
        }
        return new Question(questionBuilder.toString(), String.valueOf(progression[secretIndex]));
    }
}
