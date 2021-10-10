package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void isEven() {
        final int initialValue = -500;
        final int endValue = 1000;
        final int breakNumber = 5;
        final int maxCounter = 3;
        Greet.toGreet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scAnswer = new Scanner(System.in);
        int counter = 0;
        while (counter < maxCounter) {
            int randomInt = initialValue + (int) (Math.random() * endValue);
            System.out.println(randomInt);
            String answer = scAnswer.nextLine();
            if ((randomInt % 2 == 0 && answer.equals("yes")) || (randomInt % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                counter += 1;
            } else {
                counter = breakNumber;
            }
        }
        System.out.println(counter == breakNumber ? "Your answer is wrong :(.\nLet's try again " + Greet.getName() + "!"
                : "Congratulations, " + Greet.getName() + "!");
    }
}
