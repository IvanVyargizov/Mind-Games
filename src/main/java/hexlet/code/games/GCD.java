package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class GCD {

    private static void printConditionsOfTheGame() {
        System.out.println("Find the greatest common divisor of given numbers.\n");
    }

    public static void isGCD() {
        Greet.toGreet();
        printConditionsOfTheGame();
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static int getDifferenceABS(int firstNumber, int secondNumber) {
        return Math.max(Math.abs(firstNumber), Math.abs(secondNumber))
                - Math.min(Math.abs(firstNumber), Math.abs(secondNumber));
    }

    private static int getMinNumberABS(int firstNumber, int secondNumber) {
        return Math.min(Math.abs(firstNumber), Math.abs(secondNumber));
    }

    private static String[][] getArrayOfEquationAndAnswer() {
        String[][] arrayOfEquationAndAnswer = new String[Engine.getLengthOfArray()][Engine.getLengthOfArray()];
        for (int i = 0; i <= Engine.getMaxIteration(); i++) {
            int firstNumber = Engine.getRandomNumber();
            int secondNumber = Engine.getRandomNumber();
            arrayOfEquationAndAnswer[Engine.getLineOfEquation()][i] = firstNumber + " " + secondNumber;
            int difference = getDifferenceABS(firstNumber, secondNumber);
            int minNumber = getMinNumberABS(firstNumber, secondNumber);
            while (difference != minNumber) {
                firstNumber = difference;
                difference = getDifferenceABS(difference, minNumber);
                minNumber = getMinNumberABS(firstNumber, minNumber);
            }
            arrayOfEquationAndAnswer[Engine.getLineOfAnswer()][i] = Integer.toString(minNumber);
        }
        return arrayOfEquationAndAnswer;
    }
}
