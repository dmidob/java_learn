/*
1.3. Поиск простых чисел

Задача:
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */


import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {
    public static ArrayList identifyPrimeNumbers() {
        ArrayList primeNumbersList = new ArrayList();
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            int divider = (int) Math.sqrt(i);
            for (int j = 2; j <= divider; j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbersList.add(i);
            }
        }
        return primeNumbersList;
    }
}


