package hexlet.code.games;

public class Calc implements Playable {
    private static final int MAX_NUMBER = 100;
    private int a;
    private int b;
    private char operator;

    @Override
    public final String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public final void startRound() {
        a = getRandomNumber(MAX_NUMBER);
        b = getRandomNumber(MAX_NUMBER);
        operator = getRandomOperator();
    }

    @Override
    public final String getCorrectAnswer() {
        return switch (operator) {
            case '+' -> String.valueOf(a + b);
            case '-' -> String.valueOf(a - b);
            case '*' -> String.valueOf(a * b);
            default -> "No answer";
        };
    }

    @Override
    public final String getQuestion() {
        return String.format("%d %c %d", a, operator, b);

    }

    private char getRandomOperator() {
        char[] operators = new char[]{'+', '-', '*'};
        return operators[getRandomNumber(operators.length)];
    }
}
