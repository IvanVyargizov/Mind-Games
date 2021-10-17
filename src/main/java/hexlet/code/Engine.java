package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int MAX_ITERATION = 2;
    private static final int LINE_OF_EQUATION = 0;
    private static final int LINE_OF_ANSWER = 1;

    public static int getMaxIteration() {
        return MAX_ITERATION;
    }

    public static int getLineOfEquation() {
        return LINE_OF_EQUATION;
    }

    public static int getLineOfAnswer() {
        return LINE_OF_ANSWER;
    }

    public static int getLengthOfArray() {
        return getMaxIteration() + 1;
    }

    public static int getRandomNumber() {
        final int initialValue = -50;
        final int endValue = 100;
        return initialValue + (int) (Math.random() * endValue);
    }

    public static String getAnswer() {
        Scanner scAnswer = new Scanner(System.in);
        return scAnswer.nextLine();
    }

    private static String getOutputCorrect() {
        return "Correct!\n";
    }

    private static void getCongratulations() {
        System.out.println("Congratulations, " + Greet.getName() + "!");
    }

    private static String compareAnswers(String correctAnswer) {
        String playerAnswer = getAnswer();
        String output;
        if (correctAnswer.equals(playerAnswer)) {
            output = getOutputCorrect();
        } else {
            output = "\n" + "'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was"
                    + " '" + correctAnswer + "'." + "\nLet's try again, " + Greet.getName() + "!";
        }
        System.out.println(output);
        return output;
    }

    public static void initializationLoop(String[][] arrayOfEquationAndAnswer) {
        int counter = 0;
        while (counter <= Engine.getMaxIteration()) {
            System.out.println(arrayOfEquationAndAnswer[getLineOfEquation()][counter]);
            if (!Engine.compareAnswers(arrayOfEquationAndAnswer[getLineOfAnswer()][counter])
                    .equals(getOutputCorrect())) {
                break;
            } else {
                counter++;
            }
        }
        if (counter == getLengthOfArray()) {
            getCongratulations();
        }
    }
}
