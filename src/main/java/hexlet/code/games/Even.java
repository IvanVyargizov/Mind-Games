package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Even {

    private static void printConditionsOfTheGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n");
    }

    public static void isEven() {
        Greet.toGreet();
        printConditionsOfTheGame();
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static String[][] getArrayOfEquationAndAnswer() {
        String[][] arrayOfEquationAndAnswer = new String[Engine.getLengthOfArray()][Engine.getLengthOfArray()];
        for (int i = 0; i <= Engine.getMaxIteration(); i++) {
            int equationToSolve = Engine.getRandomNumber();
            arrayOfEquationAndAnswer[Engine.getLineOfEquation()][i] = Integer.toString(equationToSolve);
            arrayOfEquationAndAnswer[Engine.getLineOfAnswer()][i] = equationToSolve % 2 == 0 ? "yes" : "no";
        }
        return arrayOfEquationAndAnswer;
    }

}
