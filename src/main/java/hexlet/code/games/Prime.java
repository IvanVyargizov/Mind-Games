package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Prime {

    public static void isPrime() {
        Greet.toGreet();
        printConditionsOfTheGame();
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static void printConditionsOfTheGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n");
    }

    private static String[][] getArrayOfEquationAndAnswer() {
        String[][] arrayOfEquationAndAnswer = new String[Engine.getLengthOfArray()][Engine.getLengthOfArray()];
        for (int i = 0; i <= Engine.getMaxIteration(); i++) {
            int equationToSolve = Math.abs(Engine.getRandomNumber()) + 1;
            arrayOfEquationAndAnswer[Engine.getLineOfEquation()][i] = Integer.toString(equationToSolve);
            arrayOfEquationAndAnswer[Engine.getLineOfAnswer()][i] = prime(equationToSolve);
        }
        return arrayOfEquationAndAnswer;
    }

    private static String prime(int number) {
        if (number == 1 || (number % 2 == 0 && number > 2)) {
            return "no";
        } else if (number == 2) {
            return "yes";
        } else {
            int i = number / 2;
            while (i != 1) {
                if (number % i == 0) {
                    return "no";
                }
                i += -1;
            }
            return "yes";
        }
    }
}
