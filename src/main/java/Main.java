/*
1.1. Максимальное, минимальное и среднее значение

Задача:
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().

1.2. Реализуйте алгоритм сортировки пузырьком для сортировки массива

1.3. Поиск простых чисел

Задача:
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

1.4. Удаление из массива

Задача:
Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).

 */


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

     public static void main (String[] args) {

         //TODO add exception handling when arrayLength <=0
         System.out.println("\n");
         System.out.println("--------1.1 - Max, Min, Average values--------");
         ArrayList<Integer> createdArray =  MaxMinAverage.generateRandomArray(10);    //create array and fill it by 10 random int numbers from 0 to 10
         System.out.println("Max value of array " + createdArray + " is: " + MaxMinAverage.getMaxArrayValue(createdArray));
         System.out.println("Min value of array " + createdArray + " is: " + MaxMinAverage.getMinArrayValue(createdArray));
         System.out.println("Average value of array " + createdArray + " is: " + MaxMinAverage.getAverageArrayValue(createdArray));

         System.out.println("\n");
         System.out.println("--------1.2 - Bubble sorting algorithm--------");
         ArrayList<Integer> createdArrayForSorting =  MaxMinAverage.generateRandomArray(10);
         System.out.println("Initial array is " + createdArrayForSorting);
         System.out.println("Sorted array is " + BubbleSort.arrayBubbleSorting(createdArrayForSorting));
         //BubbleSort.arrayBubbleSorting(ArrayList<Integer> createdArray =  MaxMinAverage.generateRandomArray(10)); <<WHY THIS DOESN'T WORK?

         System.out.println("\n");
         System.out.println("--------1.3 - Prime numbers identifying--------");
         System.out.println("List of prime numbers from 2 to 100 is " + PrimeNumbers.identifyPrimeNumbers());

         System.out.println("\n");
         System.out.println("--------1.4 - Remove number from array--------");
         ArrayEditing.removeNumberFromArray(20,5);
     }

}
