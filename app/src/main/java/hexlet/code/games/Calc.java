package hexlet.code.games;

import hexlet.code.Utils;

public class Calc implements QuestionGame {
    private static final String RULES = "What is the result of the expression?";
    private static final int MAX_NUMBER = 100;

    @Override
    public final String getRules() {
        return RULES;
    }

    @Override
    public final Question getNewQuestion() {
        int a = Utils.getRandomNumber(MAX_NUMBER);
        int b = Utils.getRandomNumber(MAX_NUMBER);
        char operator = getRandomOperator();
        return new Question(String.format("%d %c %d", a, operator, b), getCorrectAnswer(a, b, operator));
    }

    public final String getCorrectAnswer(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> String.valueOf(a + b);
            case '-' -> String.valueOf(a - b);
            case '*' -> String.valueOf(a * b);
            default -> "No answer";
        };
    }

    private char getRandomOperator() {
        char[] operators = new char[]{'+', '-', '*'};
        return operators[Utils.getRandomNumber(operators.length)];
    }
}
