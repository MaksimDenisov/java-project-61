package hexlet.code.games;

public class Calc implements Playable {
    private int a;
    private int b;
    private char operator;

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public void startRound() {
        a = getRandomNumber(100);
        b = getRandomNumber(100);
        operator = getRandomOperator();
    }

    @Override
    public String getCorrectAnswer() {
        return switch (operator) {
            case '+' -> String.valueOf(a + b);
            case '-' -> String.valueOf(a - b);
            case '*' -> String.valueOf(a * b);
            default -> "No answer";
        };
    }

    @Override
    public String getQuestion() {
        return String.format("%d  %c  %d", a, operator, b);

    }

    private char getRandomOperator() {
        char[] operators = new char[]{'+', '-', '*'};
        return operators[getRandomNumber(3)];
    }
}
