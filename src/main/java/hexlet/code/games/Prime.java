package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void isPrime() {
        Engine.run(CONDITION_GAME, getQuestionsAndAnswers());
    }

    private static final String CONDITION_GAME
            = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int questionToSolve = Math.abs(Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT)) + 1;
            questionsAndAnswers[Engine.LINE_OF_QUESTIONS][i] = Integer.toString(questionToSolve);
            questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = prime(questionToSolve);
        }
        return questionsAndAnswers;
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
