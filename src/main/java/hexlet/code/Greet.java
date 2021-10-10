package hexlet.code;

import java.util.Scanner;

public class Greet {
    private static String name;
    public static void toGreet() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scName = new Scanner(System.in);
        name = scName.nextLine();
        System.out.println("Hello, " + name);
    }

    public static String getName() {
        return name;
    }
}
