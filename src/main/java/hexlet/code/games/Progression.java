package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String CONDITION_GAME = "What number is missing in the progression?";
    private static String answer;

    public static void run() {
        String[] questions = new String[Engine.ROUNDS];
        String[] answers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questions[i] = getQuestions(getProgression());
            answers[i] = answer;
        }
        Engine.run(CONDITION_GAME, new String[][] {questions, answers});
    }

    private static int[] getProgression() {
        final int maxLengthOfProgression = 6;
        final int minLengthOfProgression = 5;
        int lengthOfProgression = Utils.getRandomNumber(minLengthOfProgression, maxLengthOfProgression);
        int[] progression = new int[lengthOfProgression];

        final int maxStepOfProgression = 51;
        final int minStepOfProgression = -25;
        int stepOfProgression = Utils.getRandomNumber(minStepOfProgression, maxStepOfProgression);

        int elementOfProgression = Utils.getRandomNumber(Utils.MIN, Utils.MAX);
        for (int i = 0; i < lengthOfProgression; i++) {
            progression[i] = elementOfProgression;
            elementOfProgression += stepOfProgression;
        }
        return progression;
    }

    private static String getQuestions(int[] progression) {
        int positionOfAnswer = Utils.getRandomNumber(progression.length - 1);
        answer = String.valueOf(progression[positionOfAnswer]);

        StringBuilder stringProgression = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == positionOfAnswer) {
                stringProgression.append(".. ");
            } else {
                stringProgression.append(progression[i]).append(" ");
            }
        }
        return stringProgression.toString();
    }
}
