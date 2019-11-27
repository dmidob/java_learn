package lesson02;
/*
https://docs.google.com/document/d/1WHxKj738p9XRGQbF1huwgnaavW1QgBZjkf0u_SmrkIg/edit
Task 2 (EvensRangePrinter)
Вывести на экран чётные числа от first до last. Если first > last, ничего не выводить.
Ограничения: нет.
void printEvensRange(int first, int last)
Входные аргументы int first, int last
Тип результата Вывод в консоль
 */

public class EvensRangePrinter {

    public static void main (String[] args)  {
        printEvensRange(ConsoleInput.inputNumberFromConsole("Please input first number: "),
                ConsoleInput.inputNumberFromConsole("Please input last number: "));
    }

    private static void printEvensRange (int firstNumber, int lastNumber){
        if (firstNumber < lastNumber){
            for (int i = firstNumber; i <= lastNumber; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
