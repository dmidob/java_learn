package lesson01.loopspracticing;/*
1.1. Максимальное, минимальное и среднее значение
Задача:
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
*/

import utils.arraysmanipulation.ArrayGenerator;

import java.util.Arrays;
import java.util.List;

public class MaxMinAverage {

    public static void main (String[] args) {
        System.out.println("--------1.1 - Max, Min, Average values--------");
        /*
        List<Integer> createdArrayList =  ArrayGenerating.generateRandomArrayList(20);    //create array and fill it by 10 random
        // int numbers from 0 to 10
        System.out.println("Max value of array " + createdArrayList + " is: "
                + MaxMinAverage.getMaxArrayListValue(createdArrayList));
        System.out.println("Min value of array " + createdArrayList + " is: "
                + MaxMinAverage.getMinArrayListValue(createdArrayList));
        System.out.println("Average value of array " + createdArrayList + " is: "
                + MaxMinAverage.getAverageArrayListValue(createdArrayList));
*/

        int[] createdIntArray =  ArrayGenerator.generateRandomIntArray(20);    //create array and fill it by 10 random
        // int numbers from 0 to 10
        System.out.println("Max value of array " + Arrays.toString(createdIntArray) + " is: "
                + MaxMinAverage.getMaxIntArrayValue(createdIntArray));
        System.out.println("Min value of array " + Arrays.toString(createdIntArray) + " is: "
                + MaxMinAverage.getMinIntArrayValue(createdIntArray));
        System.out.println("Average value of array " + Arrays.toString(createdIntArray) + " is: "
                + MaxMinAverage.getAverageIntArrayValue(createdIntArray));
    }

    //method for getting max value of input array
    public static int getMaxArrayListValue (List<Integer> inputArray) {
        int maxArrayListValue = inputArray.get(0);
        for (Integer integer : inputArray) {
            if (integer > maxArrayListValue) {
                maxArrayListValue = integer;
            }
        }
        return maxArrayListValue;
    }

    static int getMaxIntArrayValue (int[] inputArray) {
        int maxArrayIntValue = inputArray[0];
        for (Integer integer : inputArray) {
            if (integer > maxArrayIntValue) {
                maxArrayIntValue = integer;
            }
        }
        return maxArrayIntValue;
    }

    //method for getting min value of input array
    private static int getMinArrayListValue (List<Integer> inputArray) {
        int minArrayListValue = inputArray.get(0);
        for (Integer integer : inputArray) {
            if (integer < minArrayListValue)
                minArrayListValue = integer;
            }
        return minArrayListValue;
    }

    static int getMinIntArrayValue (int[] inputArray) {
        int minArrayIntValue = inputArray[0];
        for (Integer integer : inputArray) {
            if (integer < minArrayIntValue) {
                minArrayIntValue = integer;
            }
        }
        return minArrayIntValue;
    }

    //method for getting average value of input array
    private static int getAverageArrayListValue (List<Integer> inputArray) {
        int averageArrayListValue = 0;
        for (Integer integer : inputArray)  {
            averageArrayListValue += integer;
        }
        return averageArrayListValue/inputArray.size();
    }

    static int getAverageIntArrayValue (int[] inputArray) {
        int averageIntArrayListValue = 0;
        for (Integer integer : inputArray)  {
            averageIntArrayListValue += integer;
        }
        return averageIntArrayListValue/inputArray.length;
    }
}
