/*
1.1. Максимальное, минимальное и среднее значение
Задача:
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
*/


import java.util.ArrayList;

public class MaxMinAverage {

    public static ArrayList<Integer> generateRandomArray(int arrayLength) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
           for (int i = 0; i < arrayLength; i++) {
                newArray.add(i, (int) (Math.random() * 10));

                //newArray.set(i, (int) (Math.random() * 10));
            }
            return newArray;

    }

    public static int getMaxArrayValue(ArrayList<Integer> inputArray) {
        if (inputArray.size()>0){
            int maxArrayValue = inputArray.get(0);
            for (int i = 1; i < inputArray.size(); i++) {
                if (inputArray.get(i) > maxArrayValue)
                    maxArrayValue = inputArray.get(i);
            }
            return maxArrayValue;
        }
        return Integer.parseInt(null);
    }

    public static int getMinArrayValue(ArrayList<Integer> inputArray) {
        if (inputArray.size()>0){
            int maxArrayValue = inputArray.get(0);
            for (int i = 1; i < inputArray.size(); i++) {
                if (inputArray.get(i) < maxArrayValue)
                    maxArrayValue = inputArray.get(i);
            }
            return maxArrayValue;
        }
        return Integer.parseInt(null);
    }

    public static int getAverageArrayValue(ArrayList<Integer> inputArray) {
        if (inputArray.size()>0){
            int averageArrayValue = 0;
            for (int i = 1; i < inputArray.size(); i++) {
                averageArrayValue += inputArray.get(i);
                return averageArrayValue;
            }
        }
        return Integer.parseInt(null);
    }

}
