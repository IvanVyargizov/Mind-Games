package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void isGCD() {
        Engine.run(CONDITION_GAME, getQuestionsAndAnswers());
    }

    private static final String CONDITION_GAME = "Find the greatest common divisor of given numbers.";

    private static int getDifferenceABS(int firstNumber, int secondNumber) {
        return Math.max(Math.abs(firstNumber), Math.abs(secondNumber))
                - Math.min(Math.abs(firstNumber), Math.abs(secondNumber));
    }

    private static int getMinNumberABS(int firstNumber, int secondNumber) {
        return Math.min(Math.abs(firstNumber), Math.abs(secondNumber));
    }

    private static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT);
            int secondNumber = Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT);
            questionsAndAnswers[Engine.LINE_OF_QUESTIONS][i] = firstNumber + " " + secondNumber;
            int difference = getDifferenceABS(firstNumber, secondNumber);
            int minNumber = getMinNumberABS(firstNumber, secondNumber);
            if (minNumber == 0) {
                questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = Integer.toString(difference);
            } else {
                while (difference != minNumber) {
                    firstNumber = difference;
                    difference = getDifferenceABS(difference, minNumber);
                    minNumber = getMinNumberABS(firstNumber, minNumber);
                }
                questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = Integer.toString(minNumber);
            }
        }
        return questionsAndAnswers;
    }

}
