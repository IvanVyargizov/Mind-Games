package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void isGCD() {
        Engine.run(CONDITION_GAME, getQuestionsAndAnswers());
    }

    private static final String CONDITION_GAME = "Find the greatest common divisor of given numbers.";

    private static int difference(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber) - Math.min(firstNumber, secondNumber);
    }

    private static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Math.abs(Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT));
            int secondNumber = Math.abs(Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT));
            questionsAndAnswers[Engine.LINE_OF_QUESTIONS][i] = firstNumber + " " + secondNumber;
            int difference = difference(firstNumber, secondNumber);
            int minNumber = Math.min(firstNumber, secondNumber);
            if (minNumber == 0) {
                questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = Integer.toString(difference);
            } else {
                while (difference != minNumber) {
                    firstNumber = difference;
                    difference = difference(difference, minNumber);
                    minNumber = Math.min(firstNumber, minNumber);
                }
                questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = Integer.toString(minNumber);
            }
        }
        return questionsAndAnswers;
    }

}
