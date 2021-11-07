package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {

    public static void toCalc() {
        Engine.run(CONDITION_GAME, getQuestionsAndAnswers());
    }

    private static final String CONDITION_GAME = "What is the result of the expression?";

    private static String[][] getQuestionsAndAnswers() {
        Random random = new Random();
        final int limitOfRandom = 3;
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT);
            int secondNumber = Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT);
            switch (random.nextInt(limitOfRandom)) {
                case 0 -> {
                    questionsAndAnswers[Engine.LINE_OF_QUESTIONS][i] = firstNumber
                            + " " + "+" + " " + secondNumber;
                    questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = Integer
                            .toString(firstNumber + secondNumber);
                }
                case 1 -> {
                    questionsAndAnswers[Engine.LINE_OF_QUESTIONS][i] = firstNumber
                            + " " + "-" + " " + secondNumber;
                    questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = Integer
                            .toString(firstNumber - secondNumber);
                }
                case 2 -> {
                    questionsAndAnswers[Engine.LINE_OF_QUESTIONS][i] = firstNumber
                            + " " + "*" + " " + secondNumber;
                    questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = Integer
                            .toString(firstNumber * secondNumber);
                }
                default -> System.out.println("UNKNOWN ERROR");
            }
        }
        return questionsAndAnswers;
    }

}
