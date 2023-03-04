package hexlet.code.games;

public class GCD implements Playable {

    private int a;
    private int b;

    @Override
    public final void startRound() {
        a = getRandomNumber(100);
        b = getRandomNumber(100);
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
