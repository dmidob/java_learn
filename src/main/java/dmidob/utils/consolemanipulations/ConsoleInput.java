package dmidob.utils.consolemanipulations;
/*
Utility class for input capture from console
 */

import java.util.Scanner;

public class ConsoleInput {
    public static final String ILLEGAL_ARGUMENT_EXCEPTION_MESSAGE = "Someone has input not an integer number...";
    private static Scanner scanner;

    public static Scanner getScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static int inputNumberFromConsole (String textMessageForInput) {
        System.out.print(textMessageForInput);
        if (!getScanner().hasNextInt()) {
            throw new IllegalArgumentException(ILLEGAL_ARGUMENT_EXCEPTION_MESSAGE);
        }
        return getScanner().nextInt();
    }

    public static String inputStringFromConsole (String textMessageForInput) {
        System.out.print(textMessageForInput);
        return getScanner().next();
    }
}
