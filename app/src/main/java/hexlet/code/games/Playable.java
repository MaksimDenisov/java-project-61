package hexlet.code.games;

public interface Playable {

    void startRound();

    default String getGameName() {
        return this.getClass().getSimpleName();
    }

    String getRules();

    String getCorrectAnswer();

    String getQuestion();

    default int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }
}
