package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static void isGCD() {
        Engine.toGreet();
        Engine.printConditionsOfTheGame(CONDITIONS_OF_THE_GAME);
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static final String CONDITIONS_OF_THE_GAME = "Find the greatest common divisor of given numbers.";

    private static int getDifferenceABS(int firstNumber, int secondNumber) {
        return Math.max(Math.abs(firstNumber), Math.abs(secondNumber))
                - Math.min(Math.abs(firstNumber), Math.abs(secondNumber));
    }

    private static int getMinNumberABS(int firstNumber, int secondNumber) {
        return Math.min(Math.abs(firstNumber), Math.abs(secondNumber));
    }

    private static String[][] getArrayOfEquationAndAnswer() {
        String[][] arrayOfEquationAndAnswer
                = new String[Engine.LENGTH_OF_ARRAY_WHEN_WIN][Engine.LENGTH_OF_ARRAY_WHEN_WIN];
        for (int i = 0; i <= Engine.MAX_ITERATION; i++) {
            int firstNumber = Engine.getRandomNumber();
            int secondNumber = Engine.getRandomNumber();
            arrayOfEquationAndAnswer[Engine.LINE_OF_EQUATION][i] = firstNumber + " " + secondNumber;
            int difference = getDifferenceABS(firstNumber, secondNumber);
            int minNumber = getMinNumberABS(firstNumber, secondNumber);
            while (difference != minNumber) {
                firstNumber = difference;
                difference = getDifferenceABS(difference, minNumber);
                minNumber = getMinNumberABS(firstNumber, minNumber);
            }
            arrayOfEquationAndAnswer[Engine.LINE_OF_ANSWER][i] = Integer.toString(minNumber);
        }
        return arrayOfEquationAndAnswer;
    }

}
