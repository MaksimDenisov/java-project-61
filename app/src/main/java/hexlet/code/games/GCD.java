package hexlet.code.games;

public class GCD implements Playable {
    private static final int MAX_NUMBER = 100;
    private int a;
    private int b;

    @Override
    public final void startRound() {
        a = getRandomNumber(MAX_NUMBER);
        b = getRandomNumber(MAX_NUMBER);
    }

    @Override
    public final String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public final String getCorrectAnswer() {
        while ((a % b) > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return String.valueOf(b);
    }

    @Override
    public final String getQuestion() {
        return String.format("%d %d", a, b);
    }
}
