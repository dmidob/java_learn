/*
1.4. Удаление из массива

        Задача:
        Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
*/

import java.util.ArrayList;

public class ArrayEditing {

    public static ArrayList<Integer> removeNumberFromArray(int arrayLength, int numberToRemove) {
        ArrayList<Integer> arrayForEditing = MaxMinAverage.generateRandomArray(arrayLength);
        System.out.println("Initial array: " + arrayForEditing.toString());
        arrayForEditing.removeIf(i -> (i == numberToRemove));
        System.out.println("Number to be removed from array is: " + numberToRemove);
        System.out.println("Updated array: " + arrayForEditing.toString());
        return arrayForEditing;
    }

    /*public static ArrayList<Integer> removeNumberFromArray1(int arrayLength, int numberToEdit) {
        ArrayList<Integer> arrayForEditing = MaxMinAverage.generateRandomArray(arrayLength);
        System.out.println("Initial array: " + arrayForEditing.toString());
        for (int i:arrayForEditing) {
            if (arrayForEditing.get(i) == numberToEdit){
                arrayForEditing.remove(i);
            }

        }
        System.out.println("Updated array: " + arrayForEditing.toString());

        return arrayForEditing;
    }

     */
}
