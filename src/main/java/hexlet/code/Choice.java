package hexlet.code;

import java.util.Scanner;

public class Choice {
    private static String choice;

    public static void toChoice() {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        Scanner scChoice = new Scanner(System.in);
        choice = scChoice.nextLine();
        System.out.println("Your choice: " + choice + "\n");
    }

    public static String getChoice() {
        return choice;
    }
}
