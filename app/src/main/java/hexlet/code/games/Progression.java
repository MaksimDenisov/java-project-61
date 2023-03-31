package hexlet.code.games;

import hexlet.code.Utils;

public class Progression implements QuestionGame {
    private final String rules = "What number is missing in the progression?";
    private final int progressionLength = 10;
    private final int progressionMaxStep = 5;
    private final int progressionMaxFirstNumber = 10;

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
        int[] progression = generateProgression(progressionLength, progressionMaxStep, progressionMaxFirstNumber);
        var secretIndex = (int) (Math.random() * progression.length);
        StringBuilder questionBuilder = new StringBuilder("Question:");
        for (int i = 0; i < progression.length; i++) {
            questionBuilder.append(" ").append((i == secretIndex) ? ".." : String.valueOf(progression[i]));
        }
        return new Question(questionBuilder.toString(), String.valueOf(progression[secretIndex]));
    }

    private int[] generateProgression(int length, int maxStep, int firstNumber) {
        int[] progression = new int[length];
        int first = Utils.getRandomNumber(firstNumber);
        int step = Utils.getRandomNumber(maxStep) + 1;
        for (int i = 0; i < progression.length; i++) {
            progression[i] = first + step * i;
        }
        return progression;
    }
}
