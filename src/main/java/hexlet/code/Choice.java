package hexlet.code;

import java.util.Scanner;

public class Choice {
    private static String choice;

    public static void toChoice() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                0 - Exit""");
        Scanner scChoice = new Scanner(System.in);
        choice = scChoice.nextLine();
        System.out.println("Your choice: " + choice + "\n");
    }

    public static String getChoice() {
        return choice;
    }
}
