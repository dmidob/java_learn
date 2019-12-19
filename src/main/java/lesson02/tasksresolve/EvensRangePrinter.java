package lesson02.tasksresolve;
/*
https://docs.google.com/document/d/1WHxKj738p9XRGQbF1huwgnaavW1QgBZjkf0u_SmrkIg/edit
Task 2 (EvensRangePrinter)
Вывести на экран чётные числа от first до last. Если first > last, ничего не выводить.
Ограничения: нет.
void printEvensRange(int first, int last)
Входные аргументы int first, int last
Тип результата Вывод в консоль
 */

import lesson02.utility.ConsoleInput;

public class EvensRangePrinter {
    private static final String MESSAGE_FOR_FIRST_NUMBER_INPUT = "Please input first number: ";
    private static final String MESSAGE_FOR_LAST_NUMBER_INPUT = "Please input last number: ";

    public static void main (String[] args)  {
        printEvensRange(
                ConsoleInput.inputNumberFromConsole(MESSAGE_FOR_FIRST_NUMBER_INPUT),
                ConsoleInput.inputNumberFromConsole(MESSAGE_FOR_LAST_NUMBER_INPUT)
        );
    }

    private static void printEvensRange (int firstNumber, int lastNumber){
        if (isInputEligible(firstNumber, lastNumber)){
            for (int i = firstNumber; i <= lastNumber; i++) {
                printEvenNumber(i);
            }
        }
    }

    private static boolean isInputEligible(int num1, int num2){
        return num1 < num2;
    }

    private static void printEvenNumber(int numberToPrint) {
        if (numberToPrint % 2 == 0) {
            System.out.print(numberToPrint + " ");
        }
    }
}
