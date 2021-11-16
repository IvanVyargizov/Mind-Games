package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String CONDITION_GAME
            = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 2;

    public static void run() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandomNumber(MIN_NUMBER, MAX_NUMBER);
            questions[i] = String.valueOf(number);
            answers[i] = isPrime(number) ? "yes" : "no";
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

    private static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            int i = number / 2;
            while (i != 1) {
                if (number % i == 0) {
                    return false;
                }
                i += -1;
            }
            return true;
        }
    }
}
