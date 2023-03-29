package hexlet.code.games;

import hexlet.code.Utils;

@SuppressWarnings("FieldCanBeLocal")
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
        var correctAnswer = switch (operator) {
            case '+' -> String.valueOf(a + b);
            case '-' -> String.valueOf(a - b);
            case '*' -> String.valueOf(a * b);
            default -> throw new IllegalArgumentException(String.format("%s is not valid operation.", operator));
        };
        return new Question(String.format("%d %c %d", a, operator, b), correctAnswer);
    }

    private char getRandomOperator() {
        char[] operators = new char[]{'+', '-', '*'};
        return operators[Utils.getRandomNumber(operators.length)];
    }
}
