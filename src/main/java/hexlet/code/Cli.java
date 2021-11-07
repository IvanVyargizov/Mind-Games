package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?\n");
        String name = sc.nextLine();
        System.out.println("\nHello, " + name + "!");
    }
}

