package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    public static void findProgression() {
        Engine.toGreet();
        Engine.printConditionsOfTheGame(CONDITIONS_OF_THE_GAME);
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static final String CONDITIONS_OF_THE_GAME = "What number is missing in the progression?";

    private static String[][] getArrayOfEquationAndAnswer() {
        String[][] arrayOfEquationAndAnswer
                = new String[Engine.LENGTH_OF_ARRAY_WHEN_WIN][Engine.LENGTH_OF_ARRAY_WHEN_WIN];
        for (int i = 0; i <= Engine.MAX_ITERATION; i++) {
            arrayOfEquationAndAnswer[Engine.LINE_OF_EQUATION][i] = getMissProgression(getProgression());
            arrayOfEquationAndAnswer[Engine.LINE_OF_ANSWER][i] = answer;
        }
        return arrayOfEquationAndAnswer;
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

        int elementOfProgression = Engine.getRandomNumber();
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
