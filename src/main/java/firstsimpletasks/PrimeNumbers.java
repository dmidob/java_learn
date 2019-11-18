package firstsimpletasks;/*
1.3. Поиск простых чисел

Задача:
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
 */


import java.util.ArrayList;

public class PrimeNumbers {

    public static void main (String[] args) {
        System.out.println("--------1.3 - Prime numbers identifying--------");
        System.out.println("List of prime numbers from 2 to 100 is " + PrimeNumbers.identifyPrimeNumbersArrayList());
    }

    static ArrayList identifyPrimeNumbersArrayList () {
        ArrayList primeNumbersList = new ArrayList();
        for (int i = 2; i <= 100; i++) {
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


