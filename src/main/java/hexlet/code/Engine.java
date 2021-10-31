package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int MAX_ITERATION = 2;
    public static final int LINE_OF_EQUATION = 0;
    public static final int LINE_OF_ANSWER = 1;
    public static final int LENGTH_OF_ARRAY_WHEN_WIN = MAX_ITERATION + 1;

    public static int getRandomNumber() {
        final int initialValue = -50;
        final int endValue = 100;
        return initialValue + (int) (Math.random() * endValue);
    }

    public static void initializationLoop(String conditionsOfTheGame, String[][] arrayOfEquationAndAnswer) {
        String playerName = toGreetAndGetPlayerName();
        System.out.println(conditionsOfTheGame + "\n");
        int counter = 0;
        while (counter <= Engine.MAX_ITERATION) {
            System.out.println("Question: " + arrayOfEquationAndAnswer[LINE_OF_EQUATION][counter]);
            String playerAnswer = getAnswer();
            if (!arrayOfEquationAndAnswer[LINE_OF_ANSWER][counter]
                    .equals(playerAnswer)) {
                printOutputWrong(playerName, playerAnswer, arrayOfEquationAndAnswer[LINE_OF_ANSWER][counter]);
                break;
            } else {
                counter++;
                System.out.println(OUTPUT_CORRECT);
            }
        }
        if (counter == LENGTH_OF_ARRAY_WHEN_WIN) {
            printCongratulations(playerName);
        }
    }

    private static final String OUTPUT_CORRECT = "Correct!\n";

    private static String getAnswer() {
        Scanner scAnswer = new Scanner(System.in);
        return scAnswer.nextLine().toLowerCase();
    }

    private static String toGreetAndGetPlayerName() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?\n");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
        System.out.println("\nHello, " + name + "!\n");
        return name;
    }

    private static void printOutputWrong(String playerName, String playerAnswer, String correctAnswer) {
        System.out.println(
                "\n" + "'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was" + " '"
                        + correctAnswer + "'." + "\nLet's try again, " + playerName + "!"
        );
    }

    private static void printCongratulations(String playerName) {
        System.out.println("Congratulations, " + playerName + "!");
    }

}
