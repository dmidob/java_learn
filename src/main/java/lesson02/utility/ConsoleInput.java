package lesson02.utility;
/*
Utility class for input capture from console
 */

import java.util.Scanner;

public class ConsoleInput {
    public static int inputNumberFromConsole (String textMessageForInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textMessageForInput);
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Someone has input not an integer number...");
        }
        return scanner.nextInt();
    }

    public static String inputStringFromConsole (String textMessageForInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textMessageForInput);
        return scanner.next();
    }
}
