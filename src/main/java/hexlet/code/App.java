package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        toChoice();
        switch (choice) {
            case "1" -> Cli.toGreet();
            case "2" -> Even.isEven();
            case "3" -> Calc.toCalc();
            case "4" -> GCD.isGCD();
            case "5" -> Progression.findProgression();
            case "6" -> Prime.isPrime();
            case "0" -> System.out.println("See you again!");
            default -> System.out.println("Your choice is incorrect, please try again ;)");
        }
    }

    private static String choice;
    private static void toChoice() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner scChoice = new Scanner(System.in);
        choice = scChoice.nextLine();
        System.out.println("Your choice: " + choice + "\n");
    }
}
