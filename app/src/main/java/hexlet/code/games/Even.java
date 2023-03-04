package hexlet.code.games;

public class Even implements Playable {
    private static final int MAX_NUMBER = 100;
    private static final String NO = "no";
    private static final String YES = "yes";
    private int number;

    @Override
    public final void startRound() {
        number = getRandomNumber(MAX_NUMBER);
    }

    @Override
    public final String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public final String getCorrectAnswer() {
        return (number % 2 == 0) ? YES : NO;
    }

    @Override
    public final String getQuestion() {
        return String.valueOf(number);
    }
}
