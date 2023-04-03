package hexlet.code.games;

import hexlet.code.Utils;

public class Calc implements QuestionGame {
    private final String rules = "What is the result of the expression?";
    private final int maxNumber = 100;

    /**
     * Rules of game.
     * @return Rules of game.
     */
    @Override
    public String getRules() {
        return rules;
    }

    /**
     * Get new question.
     * @return Question with correct answer.
     */
    @Override
    public Question getNewQuestion() {
        int a = Utils.getRandomNumber(maxNumber);
        int b = Utils.getRandomNumber(maxNumber);
        char operator = getRandomOperator();
        return new Question(String.format("%d %c %d", a, operator, b), String.valueOf(calculate(a, b, operator)));
    }

    private int calculate(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalArgumentException(String.format("%s is not valid operation.", operator));
        };
    }

    private char getRandomOperator() {
        char[] operators = new char[]{'+', '-', '*'};
        return operators[Utils.getRandomNumber(operators.length)];
    }
}
