package hexlet.code.games;

import hexlet.code.Utils;

public final class Progression implements QuestionGame {
    private static final String RULES = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int PROGRESSION_MAX_STEP = 5;
    private static final int PROGRESSION_MAX_FIRST_NUMBER = 10;

    private int[] progression;
    private int secretIndex;

    @Override
    public String getRules() {
        return RULES;
    }

    @Override
    public Question getNewQuestion() {
        return new Question(getQuestion(), getCorrectAnswer());
    }

    public String getCorrectAnswer() {
        return String.valueOf(progression[secretIndex]);
    }

    public String getQuestion() {
        progression = getProgression(PROGRESSION_LENGTH, PROGRESSION_MAX_FIRST_NUMBER, PROGRESSION_MAX_STEP);
        secretIndex = (int) (Math.random() * progression.length);
        StringBuilder builder = new StringBuilder("Question:");
        for (int i = 0; i < progression.length; i++) {
            builder.append(" ").append((i == secretIndex) ? ".." : String.valueOf(progression[i]));
        }
        return builder.toString();
    }

    public int[] getProgression(int length, int firstNumber, int maxStep) {
        int[] newProgression = new int[length];
        int first = Utils.getRandomNumber(firstNumber);
        int step = Utils.getRandomNumber(maxStep) + 1;
        for (int i = 0; i < newProgression.length; i++) {
            newProgression[i] = first + step * i;
        }
        return newProgression;
    }
}
