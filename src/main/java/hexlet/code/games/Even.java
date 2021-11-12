package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String CONDITION_GAME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.getRandomNumber(Utils.MIN, Utils.MAX);
            questions[i] = String.valueOf(number);
            answers[i] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

}
