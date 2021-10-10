package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        Scanner scChoice = new Scanner(System.in);
        String choice = scChoice.nextLine();
        System.out.println("Your choice: " + choice + "\n");
        switch (choice) {
            case "1" -> Greet.toGreet();
            case "2" -> Even.isEven();
            case "0" -> System.out.println("See you again!");
            default -> System.out.println("Your choice is incorrect, please try again ;)");
        }
        scChoice.close();
    }
}
