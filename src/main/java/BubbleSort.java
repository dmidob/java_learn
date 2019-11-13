/*
1.2. Реализуйте алгоритм сортировки пузырьком для сортировки массива
 */


import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    public static void main (String[] args) {
        System.out.println("--------1.2 - Bubble sorting algorithm--------");
        ArrayList<Integer> createdArrayForSorting =  MaxMinAverage.generateRandomArray(20);
        System.out.println("Initial array is " + createdArrayForSorting);
        System.out.println("Sorted array is " + BubbleSort.arrayBubbleSorting(createdArrayForSorting));
    }

    private static ArrayList<Integer> arrayBubbleSorting(ArrayList<Integer> inputArray) {
        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = i + 1; j < inputArray.size(); j++) {
                if (inputArray.get(i) > inputArray.get(j)) {
                    Collections.swap(inputArray, i, j);
                }
            }
        }
        return inputArray;
    }
}
