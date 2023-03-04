package hexlet.code.games;

public class Progression implements Playable {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int PROGRESSION_MAX_STEP = 5;
    private static final int PROGRESSION_MAX_FIRST_NUMBER = 10;

    private int[] progression;
    private int secretIndex;

    @Override
    public void startRound() {
        progression = new int[PROGRESSION_LENGTH];
        int first = getRandomNumber(PROGRESSION_MAX_FIRST_NUMBER);
        int step = getRandomNumber(PROGRESSION_MAX_STEP) + 1;
        for (int i = 0; i < progression.length; i++) {
            progression[i] = first + step * i;
        }
        secretIndex = (int) (Math.random() * progression.length);
    }

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getCorrectAnswer() {
        return String.valueOf(progression[secretIndex]);
    }

    @Override
    public String getQuestion() {
        StringBuilder builder = new StringBuilder("Question:");
        for (int i = 0; i < progression.length; i++) {
            builder.append(" ").append((i == secretIndex) ? ".." : String.valueOf(progression[i]));
        }
        return builder.toString();
    }
}
