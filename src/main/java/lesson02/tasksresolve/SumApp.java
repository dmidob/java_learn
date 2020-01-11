package lesson02.tasksresolve;
/*
Task 7 (SumApp)
Посчитать сумму целых чисел, которые пользователь вводит с консоли. Считывать числа, пока не будет введено 0.
Считать, что пользователь вводит только корректные числа типа int.
Ограничения: нет.
int clientElemsSum()
Входные аргументы: Чтение с консоли
Тип результата int
 */

import lesson02.utility.ConsoleInput;

public class SumApp {
    private static final String MESSAGE_FOR_INPUT = "Please input integer number: ";

    public static void main (String[] args) {
        clientElemsSum();
    }

    public static int clientElemsSum (){
        int sumOfInputNumbers = 0;
        for (int i = 1; i > 0; i++) {
            int inputNumber = ConsoleInput.inputNumberFromConsole(MESSAGE_FOR_INPUT);
            if (inputNumber != 0) {
                sumOfInputNumbers += inputNumber;
            } else {
                break;
            }
        }
        return sumOfInputNumbers;
    }
}
