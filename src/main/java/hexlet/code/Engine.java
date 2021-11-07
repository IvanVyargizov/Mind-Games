package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int LINE_OF_QUESTIONS = 0;
    public static final int LINE_OF_ANSWERS = 1;
    public static final int ROUNDS = 3;

    public static void run(String rules, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?\n");
        Scanner scName = new Scanner(System.in);
        String playerName = scName.nextLine();
        System.out.println("\nHello, " + playerName + "!\n");
        System.out.println(rules + "\n");
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            String question = questionsAndAnswers[LINE_OF_QUESTIONS][i];
            String answer = questionsAndAnswers[LINE_OF_ANSWERS][i];
            System.out.println("Question: " + question);
            String playerAnswer = getAnswer();
            if (!answer.equals(playerAnswer)) {
                System.out.println(
                        "\n" + "'" + playerAnswer + "'" + " is wrong answer ;(. Correct answer was" + " '"
                        + answer + "'." + "\nLet's try again, " + playerName + "!"
                );
                return;
            }
            System.out.println("Correct!\n");
        }
        System.out.println("Congratulations, " + playerName + "!");
    }

    private static String getAnswer() {
        Scanner scAnswer = new Scanner(System.in);
        return scAnswer.nextLine().toLowerCase();
    }

}
