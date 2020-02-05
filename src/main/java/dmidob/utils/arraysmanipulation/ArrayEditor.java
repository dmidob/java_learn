package dmidob.utils.arraysmanipulation;
/*
1.4. Удаление из массива

        Задача:
        Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
*/

import java.util.Arrays;
import java.util.List;

public class ArrayEditor {

    public static void main (String[] args) {
        //ArrayList<Integer> createdArrayForEditing =  FirstSimpleJavaTasks.MaxMinAverage.generateRandomArray(20);
        int[] createdArrayForEdit = {4, 5, 0, 5, 6, 0, 8, 3, 3, 0, 2, 6, 5, 4, 3, 0, 4, 6, 6, 9};
        System.out.println("Initial array: " + Arrays.toString(createdArrayForEdit));
        System.out.println("Updated array: " + Arrays.toString(removeNumberFromArray(createdArrayForEdit,4)));
    }

    static int[] removeNumberFromArray (int[] inputArray, int numberForRemoval){
        int countOfNumbersToEditFromArray = 0;
        for (int value : inputArray) {
            if (value == numberForRemoval) {
                countOfNumbersToEditFromArray++;
            }
        }
        int[] editedArray = new int[inputArray.length-countOfNumbersToEditFromArray];
        int indexForNewArray = 0;

        for (int value : inputArray) {
            if (value != numberForRemoval) {
                editedArray[indexForNewArray] = value;
                indexForNewArray++;
            }
        }
        return editedArray;
    }

    //This method works perfect but uses stream
    public static List<Integer> removeNumberFromArrayStream(int arrayLength, int numberToRemove) {
        List<Integer> arrayForEditing = ArrayGenerator.generateRandomArrayList(arrayLength);
        System.out.println("Initial array: " + arrayForEditing.toString());
        arrayForEditing.removeIf(i -> (i == numberToRemove));
        System.out.println("Number to be removed from array is: " + numberToRemove);
        System.out.println("Updated array: " + arrayForEditing.toString());
        return arrayForEditing;
    }
}
