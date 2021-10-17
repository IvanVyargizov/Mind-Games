package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Random;

public class Calc {

    public static void toCalc() {
        Greet.toGreet();
        printConditionsOfTheGame();
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static void printConditionsOfTheGame() {
        System.out.println("What is the result of the expression?\n");
    }

    private static String[][] getArrayOfEquationAndAnswer() {
        Random random = new Random();
        final int limitOfRandom = 3;
        String[][] arrayOfEquationAndAnswer = new String[Engine.getLengthOfArray()][Engine.getLengthOfArray()];
        for (int i = 0; i <= Engine.getMaxIteration(); i++) {
            int firstNumber = Engine.getRandomNumber();
            int secondNumber = Engine.getRandomNumber();
            switch (random.nextInt(limitOfRandom)) {
                case 0 -> {
                    arrayOfEquationAndAnswer[Engine.getLineOfEquation()][i] = firstNumber
                            + " " + "+" + " " + secondNumber;
                    arrayOfEquationAndAnswer[Engine.getLineOfAnswer()][i] = Integer
                            .toString(firstNumber + secondNumber);
                }
                case 1 -> {
                    arrayOfEquationAndAnswer[Engine.getLineOfEquation()][i] = firstNumber
                            + " " + "-" + " " + secondNumber;
                    arrayOfEquationAndAnswer[Engine.getLineOfAnswer()][i] = Integer
                            .toString(firstNumber - secondNumber);
                }
                case 2 -> {
                    arrayOfEquationAndAnswer[Engine.getLineOfEquation()][i] = firstNumber
                            + " " + "*" + " " + secondNumber;
                    arrayOfEquationAndAnswer[Engine.getLineOfAnswer()][i] = Integer
                            .toString(firstNumber * secondNumber);
                }
                default -> System.out.println("UNKNOWN ERROR");
            }
        }
        return arrayOfEquationAndAnswer;
    }

}
