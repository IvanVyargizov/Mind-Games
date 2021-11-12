package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String CONDITION_GAME
            = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        final int maxNumber = 100;
        final int minNumber = 2;
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandomNumber(minNumber, maxNumber);
            questions[i] = String.valueOf(number);
            answers[i] = getAnswer(number);
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

    private static String getAnswer(int number) {
        if (number == 2) {
            return "yes";
        } else if (number % 2 == 0) {
            return "no";
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
