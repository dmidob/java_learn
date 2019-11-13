/*
1.1. Максимальное, минимальное и среднее значение
Задача:
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
*/


import java.util.ArrayList;

public class MaxMinAverage {

    public static void main (String[] args) {
        System.out.println("--------1.1 - Max, Min, Average values--------");
        ArrayList<Integer> createdArray =  generateRandomArray(20);    //create array and fill it by 10 random
        // int numbers from 0 to 10
        System.out.println("Max value of array " + createdArray + " is: " + MaxMinAverage.getMaxArrayValue(createdArray));
        System.out.println("Min value of array " + createdArray + " is: " + MaxMinAverage.getMinArrayValue(createdArray));
        System.out.println("Average value of array " + createdArray + " is: " + MaxMinAverage.getAverageArrayValue(createdArray));
    }

    //method for array generating and filling it by random int numbers from 0 to 10
    static ArrayList<Integer> generateRandomArray (int arrayLength) {
        ArrayList<Integer> newArray = new ArrayList<>();
           for (int i = 0; i < arrayLength; i++) {
                newArray.add(i, (int) (Math.random() * 10));
            }
            return newArray;
    }

    //method for getting max value of input array
    private static int getMaxArrayValue (ArrayList<Integer> inputArray) {
         int maxArrayValue = inputArray.get(0);
         for (Integer integer : inputArray) {
             if (integer > maxArrayValue)
             maxArrayValue = integer;
         }
         return maxArrayValue;
    }

    //method for getting min value of input array
    private static int getMinArrayValue (ArrayList<Integer> inputArray) {
        int maxArrayValue = inputArray.get(0);
        for (Integer integer : inputArray) {
            if (integer < maxArrayValue)
                maxArrayValue = integer;
            }
        return maxArrayValue;
    }

    //method for getting average value of input array
    private static int getAverageArrayValue (ArrayList<Integer> inputArray) {
        int averageArrayValue = 0;
        for (Integer integer : inputArray)  {
            averageArrayValue += integer;
        }
        return averageArrayValue/inputArray.size();
    }

}
