package lesson01.loopspracticing;
/*
1.2. Реализуйте алгоритм сортировки пузырьком для сортировки массива
 */

import utils.arraysmanipulation.ArrayGenerator;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static void main (String[] args) {

        System.out.println("--------1.2 - Bubble sorting algorithm--------");
        List<Integer> createdArrayForSorting =  ArrayGenerator.generateRandomArrayList(20);
        System.out.println("Initial array is " + createdArrayForSorting);
        System.out.println("Sorted array with SWAP method is " + BubbleSort.arrayBubbleSorting(createdArrayForSorting));
        System.out.println("Sorted array without SWAP and without extra variable " +
                BubbleSort.arrayBubbleSortingNoSwapNoExtraVariable(createdArrayForSorting));
        System.out.println("Sorted array without SWAP with extra variable " +
                BubbleSort.arrayBubbleSortingNoSwap(createdArrayForSorting));
    }

    //method that swaps 2 particular elements in input array without any extra variable
    private static void swapTwoValuesNoExtraVariable (int firstIndexValue, int secondIndexValue, List<Integer> inputArray){
        inputArray.set(firstIndexValue, inputArray.get(secondIndexValue) - inputArray.get(firstIndexValue));
        inputArray.set(secondIndexValue, inputArray.get(secondIndexValue) - inputArray.get(firstIndexValue));
        inputArray.set(secondIndexValue, inputArray.get(secondIndexValue) + inputArray.get(firstIndexValue));
    }

    //method that swaps 2 particular elements in input List array with any extra variable
    private static void swapTwoValuesWithExtraVariable (int firstIndexValue, int secondIndexValue, List<Integer> inputArray){
        int tempValueForSwap = inputArray.get(firstIndexValue);
        inputArray.set(firstIndexValue, inputArray.get(secondIndexValue));
        inputArray.set(secondIndexValue, tempValueForSwap);
    }

    //method that swaps 2 particular elements in input List array with any extra variable
    private static void swapTwoValuesWithExtraVariableIntArray (int firstIndexValue, int secondIndexValue, int[] inputArray){
        int tempValueForSwap = inputArray[firstIndexValue];
        inputArray[firstIndexValue] = inputArray[secondIndexValue];
        inputArray[secondIndexValue] = tempValueForSwap;
    }

    //Method that sorts array with bubble algorithm using Collections.swap() method
    private static List<Integer> arrayBubbleSorting(List<Integer> inputArray) {
         for (int i = 0; i < inputArray.size(); i++) {
            for (int j = i + 1; j < inputArray.size(); j++) {
                if (inputArray.get(i) > inputArray.get(j)) {
                    Collections.swap(inputArray, i, j);
                }
            }
        }
        return inputArray;
    }


    //Method that sorts array with bubble algorithm using swapTwoValuesNoExtraVariable() method
    private static List<Integer> arrayBubbleSortingNoSwapNoExtraVariable(List<Integer> inputArray) {
        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = i + 1; j < inputArray.size(); j++) {
                if (inputArray.get(i) > inputArray.get(j)) {
                    swapTwoValuesNoExtraVariable(i,j, inputArray);
                }
            }
        }
        return inputArray;
    }

    //Method that sorts array with bubble algorithm using swapTwoValuesWithExtraVariable() method
    private static List<Integer> arrayBubbleSortingNoSwap(List<Integer> inputArray) {
        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = i + 1; j < inputArray.size(); j++) {
                if (inputArray.get(i) > inputArray.get(j)) {
                    swapTwoValuesWithExtraVariable(i,j, inputArray);
                }
            }
        }
        return inputArray;
    }

    int[] arrayBubbleSortingIntArray (int[] inputIntArray) {
        for (int i = 0; i < inputIntArray.length; i++) {
            for (int j = i + 1; j < inputIntArray.length; j++) {
                if (inputIntArray[i] > inputIntArray[j]) {
                    swapTwoValuesWithExtraVariableIntArray(i,j, inputIntArray);
                }
            }
        }
        return inputIntArray;
    }
}
