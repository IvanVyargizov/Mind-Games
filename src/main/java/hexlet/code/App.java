package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        Choice.toChoice();
        switch (Choice.getChoice()) {
            case "1" -> Greet.toGreet();
            case "2" -> Even.isEven();
            case "3" -> Calc.toCalc();
            case "0" -> System.out.println("See you again!");
            default -> System.out.println("Your choice is incorrect, please try again ;)");
        }
    }
}
