package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static void toCalc() {
        Engine.toGreet();
        Engine.printConditionsOfTheGame(CONDITIONS_OF_THE_GAME);
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static final String CONDITIONS_OF_THE_GAME = "What is the result of the expression?";

    private static String[][] getArrayOfEquationAndAnswer() {
        Random random = new Random();
        final int limitOfRandom = 3;
        String[][] arrayOfEquationAndAnswer
                = new String[Engine.LENGTH_OF_ARRAY_WHEN_WIN][Engine.LENGTH_OF_ARRAY_WHEN_WIN];
        for (int i = 0; i <= Engine.MAX_ITERATION; i++) {
            int firstNumber = Engine.getRandomNumber();
            int secondNumber = Engine.getRandomNumber();
            switch (random.nextInt(limitOfRandom)) {
                case 0 -> {
                    arrayOfEquationAndAnswer[Engine.LINE_OF_EQUATION][i] = firstNumber
                            + " " + "+" + " " + secondNumber;
                    arrayOfEquationAndAnswer[Engine.LINE_OF_ANSWER][i] = Integer
                            .toString(firstNumber + secondNumber);
                }
                case 1 -> {
                    arrayOfEquationAndAnswer[Engine.LINE_OF_EQUATION][i] = firstNumber
                            + " " + "-" + " " + secondNumber;
                    arrayOfEquationAndAnswer[Engine.LINE_OF_ANSWER][i] = Integer
                            .toString(firstNumber - secondNumber);
                }
                case 2 -> {
                    arrayOfEquationAndAnswer[Engine.LINE_OF_EQUATION][i] = firstNumber
                            + " " + "*" + " " + secondNumber;
                    arrayOfEquationAndAnswer[Engine.LINE_OF_ANSWER][i] = Integer
                            .toString(firstNumber * secondNumber);
                }
                default -> System.out.println("UNKNOWN ERROR");
            }
        }
        return arrayOfEquationAndAnswer;
    }

}
