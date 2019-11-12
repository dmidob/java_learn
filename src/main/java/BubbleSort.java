/*
1.2. Реализуйте алгоритм сортировки пузырьком для сортировки массива
 */


import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public static ArrayList<Integer> arrayBubbleSorting(ArrayList<Integer> inputArray) {
        if (inputArray.size() > 0) {
            for (int i = 0; i < inputArray.size(); i++) {
                for (int j = i + 1; j < inputArray.size(); j++) {
                    if (inputArray.get(i) > inputArray.get(j)) {
                        Collections.swap(inputArray, i, j);
                    }
                }
            }
            return inputArray;
        }
        return null;
    }
}
