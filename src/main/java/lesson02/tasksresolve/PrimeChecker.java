package lesson02.tasksresolve;

import lesson02.utility.ConsoleInput;

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
    public static void main (String[] args) {
        if (isPrimeNumberChecking(ConsoleInput.inputNumberFromConsole("Please input " +
                "integer number that greater than 0: "))){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    private static boolean isPrimeNumberChecking (int n){
        boolean isPrime = true;
        if (n < 0 ){
            System.out.println("Invalid input. Number should be > 0");
            System.exit(-1);
        }
        if (n == 1){
            isPrime = false;
        }
        if (n > 1 ) {
            int divider = (int) Math.sqrt(n);
            for (int i = 2; i <= divider; i++) {
                if ((n % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
