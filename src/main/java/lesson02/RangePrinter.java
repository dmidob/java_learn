package lesson02;
/*
Task 1 (RangePrinter)
Вывести на экран целые числа от first до last.
Ограничения: нет.
void printRange(int first, int last)
Входные аргументы - int first, int last
Тип результата - Вывод в консоль
 */

public class RangePrinter {

    public static void main (String[] args)  {
        printRange(ConsoleInput.inputNumberFromConsole("Please input first number: "),
                ConsoleInput.inputNumberFromConsole("Please input last number: "));
    }



    private static void printRange (int firstNumber, int lastNumber){
        if (firstNumber <= lastNumber) {
            for (int i = firstNumber; i <= lastNumber ; i++) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = firstNumber; i >= lastNumber ; i--) {
                System.out.print(i + " ");
            }
        }
    }

}
