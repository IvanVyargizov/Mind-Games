package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String CONDITION_GAME = "Find the greatest common divisor of given numbers.";

    public static void run() {
        final int maxNumber = 100;
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomNumber(0, maxNumber);
            int secondNumber = Utils.getRandomNumber(0, maxNumber);
            questions[i] = firstNumber + " " + secondNumber;
            answers[i] = findGcd(firstNumber, secondNumber);
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

    private static String findGcd(int firstNumber, int secondNumber) {
        int difference = Math.max(firstNumber, secondNumber) - Math.min(firstNumber, secondNumber);
        int minNumber = Math.min(firstNumber, secondNumber);
        if (minNumber == 0) {
            return String.valueOf(difference);
        } else {
            while (difference != minNumber) {
                firstNumber = difference;
                difference = Math.max(difference, minNumber) - Math.min(difference, minNumber);
                minNumber = Math.min(firstNumber, minNumber);
            }
            return String.valueOf(minNumber);
        }
    }

}
