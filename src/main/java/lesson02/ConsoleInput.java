package lesson02;

import java.util.Scanner;

public class ConsoleInput {
    static int inputNumberFromConsole (String textMessageForInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textMessageForInput);
        if (!scanner.hasNextInt()) {
            System.out.println("Someone has input not an integer number...");
            System.exit(-1);
        }
        return scanner.nextInt();
    }

    static String inputStringFromConsole (String textMessageForInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(textMessageForInput);
        return scanner.next();
    }
}
