package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void isEven() {
        Engine.run(CONDITION_GAME, getQuestionsAndAnswers());
    }

    private static final String CONDITION_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int questionToSolve = Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT);
            questionsAndAnswers[Engine.LINE_OF_QUESTIONS][i] = Integer.toString(questionToSolve);
            questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = questionToSolve % 2 == 0 ? "yes" : "no";
        }
        return questionsAndAnswers;
    }

}
