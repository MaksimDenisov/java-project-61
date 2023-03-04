package hexlet.code.games;

import java.util.Scanner;

public class Progression extends Game {
    public Progression(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    protected boolean round() {
        int[] progression = getProgression();
        int secretIndex = (int) (Math.random() * 10);
        System.out.println(getQuestion(progression, secretIndex));
        int correctAnswer = progression[secretIndex];
        int answer = Integer.parseInt(getScanner().next());
        if (answer == correctAnswer) {
            printCorrectAnswer();
            return true;
        } else {
            printWrongAnswer(String.valueOf(answer), String.valueOf(correctAnswer));
            return false;
        }
    }

    private int[] getProgression() {
        int[] progression = new int[10];
        int first = (int) (Math.random() * 10);
        int step = (int) (Math.random() * 5) + 1;
        for (int i = 0; i < 10; i++) {
            progression[i] = first + step * i;
        }
        return progression;
    }

    private String getQuestion(int[] progression, int secretIndex) {
        StringBuilder builder = new StringBuilder("Question:");
        for (int i = 0; i < 10; i++) {
            builder.append(" ").append((i == secretIndex) ? ".." : String.valueOf(progression[i]));
        }
        return builder.toString();
    }
}
