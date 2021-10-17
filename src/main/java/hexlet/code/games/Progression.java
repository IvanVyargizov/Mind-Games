package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Random;

public class Progression {

    public static void findProgression() {
        Greet.toGreet();
        printConditionsOfTheGame();
        Engine.initializationLoop(getArrayOfEquationAndAnswer());
    }

    private static void printConditionsOfTheGame() {
        System.out.println("What number is missing in the progression?\n");
    }

    private static String[][] getArrayOfEquationAndAnswer() {
        String[][] arrayOfEquationAndAnswer = new String[Engine.getLengthOfArray()][Engine.getLengthOfArray()];
        for (int i = 0; i <= Engine.getMaxIteration(); i++) {
            arrayOfEquationAndAnswer[Engine.getLineOfEquation()][i] = getMissProgression(getProgression());
            arrayOfEquationAndAnswer[Engine.getLineOfAnswer()][i] = answer;
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
