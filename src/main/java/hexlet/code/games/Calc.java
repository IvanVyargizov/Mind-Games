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
            int index = Utils.getRandomNumber(0, maxIndex);
            questions[i] = firstNumber + " " + OPERATORS[index] + " " + secondNumber;
            answers[i] = calculate(firstNumber, secondNumber, index);
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

    private static String calculate(int firstNumber, int secondNumber, int index) {
        return switch (OPERATORS[index]) {
            case "+" -> String.valueOf(firstNumber + secondNumber);
            case "-" -> String.valueOf(firstNumber - secondNumber);
            case "*" -> String.valueOf(firstNumber * secondNumber);
            default -> null;
        };
    }
}
