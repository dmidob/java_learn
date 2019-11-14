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
        System.out.println("Sorted array with SWAP method is " + BubbleSort.arrayBubbleSorting(createdArrayForSorting));
        System.out.println("Sorted array without SWAP and without extra variable " +
                BubbleSort.arrayBubbleSortingNoSwapNoExtraVariable(createdArrayForSorting));
        System.out.println("Sorted array without SWAP with extra variable " +
                BubbleSort.arrayBubbleSortingNoSwap(createdArrayForSorting));

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

    private static ArrayList<Integer> arrayBubbleSortingNoSwapNoExtraVariable(ArrayList<Integer> inputArray) {
        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = i + 1; j < inputArray.size(); j++) {
                if (inputArray.get(i) > inputArray.get(j)) {
                    inputArray.set(i, inputArray.get(j) - inputArray.get(i));
                    inputArray.set(j, inputArray.get(j) - inputArray.get(i));
                    inputArray.set(i, inputArray.get(j) + inputArray.get(i));
                }
            }
        }
        return inputArray;
    }

    private static ArrayList<Integer> arrayBubbleSortingNoSwap(ArrayList<Integer> inputArray) {
        int tempValueForSwap = 0;
        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = i + 1; j < inputArray.size(); j++) {
                if (inputArray.get(i) > inputArray.get(j)) {
                    tempValueForSwap = inputArray.get(i);
                    inputArray.set(i, inputArray.get(j));
                    inputArray.set(j, tempValueForSwap);
                }
            }
        }
        return inputArray;
    }
}
