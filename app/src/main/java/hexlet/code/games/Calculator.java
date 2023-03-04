package hexlet.code.games;

import java.util.Scanner;

public class Calculator extends Game {
    protected static final String MSG_QUESTION = "Question: %d  %c  %d\n";

    public Calculator(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    protected boolean round() {
        int a = getRandomNumber();
        int b = getRandomNumber();
        char operator = getRandomOperator();
        int correctAnswer = getAnswer(a, b, operator);
        System.out.printf(MSG_QUESTION, a, operator, b);
        int answer = Integer.parseInt(getScanner().next());
        if (answer == correctAnswer) {
            System.out.println(MSG_CORRECT);
            return true;
        } else {
            System.out.printf(MSG_WRONG_ANSWER, answer, correctAnswer);
            System.out.printf(MSG_TRY_AGAIN, getName());
            return false;
        }
    }

    private char getRandomOperator() {
        char[] operators = new char[]{'+', '-', '*'};
        return operators[(int) (Math.random() * 3)];
    }

    private int getAnswer(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };
    }
}
