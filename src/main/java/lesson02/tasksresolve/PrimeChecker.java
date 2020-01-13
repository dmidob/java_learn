package lesson02.tasksresolve;

import utils.consolemanipulations.ConsoleInput;

/*
Task 5 (PrimeChecker)
Определить, является ли число простым. Простое число - это натуральное число (больше нуля), которое делится нацело
только на себя и на 1.
Ограничения: n > 0.
boolean isPrime(int n)
Входные аргументы: int n
Тип результата: boolean
 */
public class PrimeChecker {
    private static final String MESSAGE_FOR_NUMBER_INPUT = "Please input integer number that greater than 0: ";
    private static final String MESSAGE_FOR_IS_A_PRIME = "Input number is prime";
    private static final String MESSAGE_FOR_IS_NOT_A_PRIME = "Input number is not a prime";
    private static final String MESSAGE_FOR_NUMBER_IS_LESS_THAN_ZERO = "Number should be > 0";

    public static void main (String[] args) {
        int inputNumber = ConsoleInput.inputNumberFromConsole(MESSAGE_FOR_NUMBER_INPUT);
        if (isPrime(inputNumber)){
            System.out.println(MESSAGE_FOR_IS_A_PRIME);
        } else {
            System.out.println(MESSAGE_FOR_IS_NOT_A_PRIME);
        }
    }

    public static void checkForNegativeInput(int numberForPrimeChecking){
        if (numberForPrimeChecking <= 0){
            System.out.println(MESSAGE_FOR_NUMBER_IS_LESS_THAN_ZERO);
            System.exit(-1);
        }
    }

    static boolean isPrime (int numberForPrimeChecking){
        checkForNegativeInput(numberForPrimeChecking);
        if (numberForPrimeChecking == 1){
            return false;
        }
        if (numberForPrimeChecking > 1 ) {
            int divider = (int) Math.sqrt(numberForPrimeChecking);
            for (int i = 2; i <= divider; i++) {
                if ((numberForPrimeChecking % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
