package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printGames();
        Scanner scChoice = new Scanner(System.in);
        String choice = scChoice.nextLine();
        System.out.println("\nYour choice: " + choice + "\n");
        switch (choice) {
            case "1" -> Cli.greeting();
            case "2" -> Even.run();
            case "3" -> Calc.run();
            case "4" -> GCD.run();
            case "5" -> Progression.run();
            case "6" -> Prime.run();
            case "0" -> System.out.println("See you again!");
            default -> System.out.println("Your choice is incorrect, please try again ;)");
        }
    }

    private static void printGames() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
    }
}
