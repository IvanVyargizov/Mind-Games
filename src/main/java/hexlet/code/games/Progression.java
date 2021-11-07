package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {

    public static void findProgression() {
        Engine.run(CONDITION_GAME, getQuestionsAndAnswers());
    }

    private static final String CONDITION_GAME = "What number is missing in the progression?";

    private static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            questionsAndAnswers[Engine.LINE_OF_QUESTIONS][i] = getMissProgression(getProgression());
            questionsAndAnswers[Engine.LINE_OF_ANSWERS][i] = answer;
        }
        return questionsAndAnswers;
    }

    private static int[] getProgression() {
        final Random length = new Random();
        final int maxLengthOfProgression = 6;
        final int minLengthOfProgression = 5;
        int lengthOfProgression = length.nextInt(maxLengthOfProgression) + minLengthOfProgression;
        int[] progression = new int[lengthOfProgression];

        final Random step = new Random();
        final int maxStepOfProgression = 51;
        final int minStepOfProgression = -25;
        int stepOfProgression = step.nextInt(maxStepOfProgression) + minStepOfProgression;

        int elementOfProgression = Utils.getRandomNumber(Utils.BOTTOM_LIMIT, Utils.UPPER_LIMIT);
        for (int i = 0; i < lengthOfProgression; i++) {
            progression[i] = elementOfProgression;
            elementOfProgression += stepOfProgression;
        }
        return progression;
    }

    private static String answer;
    private static String getMissProgression(int[] progression) {
        Random randomPositionOfAnswer = new Random();
        int positionOfAnswer = randomPositionOfAnswer.nextInt(progression.length);
        answer = Integer.toString(progression[positionOfAnswer]);

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
