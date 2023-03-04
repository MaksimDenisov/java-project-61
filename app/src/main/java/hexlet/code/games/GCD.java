package hexlet.code.games;

public class GCD implements Playable {

    private int a;
    private int b;

    @Override
    public void startRound() {
        a = getRandomNumber(100);
        b = getRandomNumber(100);
    }

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getCorrectAnswer() {
        while ((a % b) > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return String.valueOf(b);
    }

    @Override
    public String getQuestion() {
        return String.format("%d  %d", a, b);
    }
}
