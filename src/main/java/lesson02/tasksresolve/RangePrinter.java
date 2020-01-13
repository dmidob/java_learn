package lesson02.tasksresolve;
/*
Task 1 (RangePrinter)
Вывести на экран целые числа от first до last.
Ограничения: нет.
void printRange(int first, int last)
Входные аргументы - int first, int last
Тип результата - Вывод в консоль
 */

import utils.consolemanipulations.ConsoleInput;

public class RangePrinter {
    private static final String MESSAGE_FOR_FIRST_NUMBER_INPUT = "Please input first number: ";
    private static final String MESSAGE_FOR_LAST_NUMBER_INPUT = "Please input last number: ";

    public static void main (String[] args)  {
        try {
            printRange(
                    ConsoleInput.inputNumberFromConsole(MESSAGE_FOR_FIRST_NUMBER_INPUT),
                    ConsoleInput.inputNumberFromConsole(MESSAGE_FOR_LAST_NUMBER_INPUT)
            );
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private static void printRange (int firstNumber, int lastNumber){
        if (firstNumber <= lastNumber) {
            for (int i = firstNumber; i <= lastNumber ; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = firstNumber; i >= lastNumber ; i--) {
                System.out.print(i + " ");
            }
        }
    }

}
