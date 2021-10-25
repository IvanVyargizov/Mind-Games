package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void isEven() {
        Engine.toGreet();
        Engine.printConditionsOfTheGame(CONDITIONS_OF_THE_GAME);
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static final String CONDITIONS_OF_THE_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String[][] getArrayOfEquationAndAnswer() {
        String[][] arrayOfEquationAndAnswer
                = new String[Engine.LENGTH_OF_ARRAY_WHEN_WIN][Engine.LENGTH_OF_ARRAY_WHEN_WIN];
        for (int i = 0; i <= Engine.MAX_ITERATION; i++) {
            int equationToSolve = Engine.getRandomNumber();
            arrayOfEquationAndAnswer[Engine.LINE_OF_EQUATION][i] = Integer.toString(equationToSolve);
            arrayOfEquationAndAnswer[Engine.LINE_OF_ANSWER][i] = equationToSolve % 2 == 0 ? "yes" : "no";
        }
        return arrayOfEquationAndAnswer;
    }

}
