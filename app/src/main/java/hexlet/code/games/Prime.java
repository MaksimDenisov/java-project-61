package hexlet.code.games;

public class Prime implements Playable {
    private static final String NO = "no";
    private static final String YES = "yes";
    private int number;

    @Override
    public final void startRound() {
        number = getRandomNumber(100);
    }

    @Override
    public final String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public final String getCorrectAnswer() {
        return isPrime(number) ? YES : NO;
    }

    @Override
    public final String getQuestion() {
        return String.valueOf(number);
    }

    private boolean isPrime(int n) {
        if (n == 1) {
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
