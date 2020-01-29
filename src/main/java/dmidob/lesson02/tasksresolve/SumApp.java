package dmidob.lesson02.tasksresolve;
/*
Task 7 (SumApp)
Посчитать сумму целых чисел, которые пользователь вводит с консоли. Считывать числа, пока не будет введено 0.
Считать, что пользователь вводит только корректные числа типа int.
Ограничения: нет.
int clientElemsSum()
Входные аргументы: Чтение с консоли
Тип результата int
 */

import dmidob.utils.consolemanipulations.ConsoleInput;

public class SumApp {
    private static final String MESSAGE_FOR_INPUT = "Please input integer number: ";

    public static void main (String[] args) {
        clientElemsSum();
    }

    public static int clientElemsSum (){
        int inputNumber = 0;
        int sumOfInputNumbers = 0;
        do {
            inputNumber = ConsoleInput.inputNumberFromConsole(MESSAGE_FOR_INPUT);
            sumOfInputNumbers +=inputNumber;
        } while (inputNumber!=0);
        return sumOfInputNumbers;

    }
}
