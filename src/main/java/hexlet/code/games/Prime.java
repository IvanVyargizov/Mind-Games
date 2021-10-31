package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void isPrime() {
        Engine.initializationLoop(CONDITIONS_OF_THE_GAME, getArrayOfEquationAndAnswer());
    }

    private static final String CONDITIONS_OF_THE_GAME
            = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static String[][] getArrayOfEquationAndAnswer() {
        String[][] arrayOfEquationAndAnswer
                = new String[Engine.LENGTH_OF_ARRAY_WHEN_WIN][Engine.LENGTH_OF_ARRAY_WHEN_WIN];
        for (int i = 0; i <= Engine.MAX_ITERATION; i++) {
            int equationToSolve = Math.abs(Engine.getRandomNumber()) + 1;
            arrayOfEquationAndAnswer[Engine.LINE_OF_EQUATION][i] = Integer.toString(equationToSolve);
            arrayOfEquationAndAnswer[Engine.LINE_OF_ANSWER][i] = prime(equationToSolve);
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
