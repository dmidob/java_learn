package lesson02;

import java.util.Scanner;

public class ConsoleInput {
    static int inputNumberFromConsole (String textMessageForInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textMessageForInput);
        if (!scanner.hasNextInt()) {
            throw new IllegalArgumentException("Someone has input not an integer number...");
        }
        return scanner.nextInt();
    }

    static String inputStringFromConsole (String textMessageForInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textMessageForInput);
        return scanner.next();
    }
}
