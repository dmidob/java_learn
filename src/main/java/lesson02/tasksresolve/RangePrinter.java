package lesson02.tasksresolve;
/*
Task 1 (RangePrinter)
Вывести на экран целые числа от first до last.
Ограничения: нет.
void printRange(int first, int last)
Входные аргументы - int first, int last
Тип результата - Вывод в консоль
 */

import lesson02.utility.ConsoleInput;

public class RangePrinter {

    public static void main (String[] args)  {
        try {
            printRange(ConsoleInput.inputNumberFromConsole("Please input first number: "),
                    ConsoleInput.inputNumberFromConsole("Please input last number: "));;
        } catch (Exception e) {
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
