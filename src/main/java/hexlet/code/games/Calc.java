package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String CONDITION_GAME = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void run() {
        final int maxIndex = 2;
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomNumber(Utils.MIN, Utils.MAX);
            int secondNumber = Utils.getRandomNumber(Utils.MIN, Utils.MAX);
            int index = Utils.getRandomNumber(maxIndex);
            questions[i] = firstNumber + " " + OPERATORS[index] + " " + secondNumber;
            answers[i] = getAnswer(firstNumber, secondNumber, index);
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

    private static String getAnswer(int firstNumber, int secondNumber, int index) {
        switch (OPERATORS[index]) {
            case "+" -> {
                return String.valueOf(firstNumber + secondNumber);
            }
            case "-" -> {
                return String.valueOf(firstNumber - secondNumber);
            }
            case "*" -> {
                return String.valueOf(firstNumber * secondNumber);
            }
            default -> {
                return null;
            }
        }
    }
}
