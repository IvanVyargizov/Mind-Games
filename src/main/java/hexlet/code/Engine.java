package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int MAX_ITERATION = 2;
    public static final int LINE_OF_EQUATION = 0;
    public static final int LINE_OF_ANSWER = 1;
    public static final int LENGTH_OF_ARRAY_WHEN_WIN = MAX_ITERATION + 1;

    private static String name;
    public static void toGreet() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?\n");
        Scanner scName = new Scanner(System.in);
        name = scName.nextLine();
        System.out.println("\nHello, " + name + "!\n");
    }

    public static void printConditionsOfTheGame(String conditionsOfTheGame) {
        System.out.println(conditionsOfTheGame + "\n");
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
        System.out.println("Congratulations, " + name + "!");
    }

    private static String compareAnswers(String correctAnswer) {
        String playerAnswer = getAnswer();
        String output;
        if (correctAnswer.equals(playerAnswer)) {
            output = getOutputCorrect();
        } else {
            output = "\n" + "'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was"
                    + " '" + correctAnswer + "'." + "\nLet's try again, " + name + "!";
        }
        System.out.println(output);
        return output;
    }

    public static void initializationLoop(String[][] arrayOfEquationAndAnswer) {
        int counter = 0;
        while (counter <= Engine.MAX_ITERATION) {
            System.out.println("Question: " + arrayOfEquationAndAnswer[LINE_OF_EQUATION][counter]);
            if (!Engine.compareAnswers(arrayOfEquationAndAnswer[LINE_OF_ANSWER][counter])
                    .equals(getOutputCorrect())) {
                break;
            } else {
                counter++;
            }
        }
        if (counter == LENGTH_OF_ARRAY_WHEN_WIN) {
            getCongratulations();
        }
    }
}
