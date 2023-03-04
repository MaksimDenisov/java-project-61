package hexlet.code.games;

public class Even implements Playable {
    private static final String NO = "no";
    private static final String YES = "yes";
    private int number;

    @Override
    public void startRound() {
        number = getRandomNumber(100);
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getCorrectAnswer() {
        return (number % 2 == 0) ? YES : NO;
    }

    @Override
    public String getQuestion() {
        return String.valueOf(number);
    }
}
