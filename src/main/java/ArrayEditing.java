/*
1.4. Удаление из массива

        Задача:
        Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEditing {

    public static void main (String[] args) {
        //ArrayList<Integer> createdArrayForEditing =  MaxMinAverage.generateRandomArray(20);
        int[] createdArrayForEditing = {4, 5, 0, 5, 6, 0, 8, 3, 3, 0, 2, 6, 5, 4, 3, 0, 4, 6, 6, 9};
        System.out.println("Initial array: " + Arrays.toString(createdArrayForEditing));
        System.out.println("Updated array: " + Arrays.toString(removeNumberFromArray(createdArrayForEditing,4)));
    }


    //This method removes element that should be removed AND THE NEXT ONE FOR SOME REASON. Investigating it.
    private static int[] removeNumberFromArray(int[] inputArray, int numberToEdit){
        int countOfNumbersToEditFromArray = 0;
        for (int value : inputArray) {
            if (value == numberToEdit) {
                countOfNumbersToEditFromArray++;
            }
        }
        int[] editedArray = new int[inputArray.length-countOfNumbersToEditFromArray];
        int indexForNewArray = 0;

        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] != numberToEdit){
                editedArray[indexForNewArray] = inputArray[i];
                indexForNewArray++;
            }
            else {i++;}
        }
        return editedArray;
    }

    //This method works perfect but uses stream
    public static ArrayList<Integer> removeNumberFromArrayStream(int arrayLength, int numberToRemove) {
        ArrayList<Integer> arrayForEditing = MaxMinAverage.generateRandomArray(arrayLength);
        System.out.println("Initial array: " + arrayForEditing.toString());
        arrayForEditing.removeIf(i -> (i == numberToRemove));
        System.out.println("Number to be removed from array is: " + numberToRemove);
        System.out.println("Updated array: " + arrayForEditing.toString());
        return arrayForEditing;
    }




}
