package lesson01.arraysmanipulation;

import java.util.ArrayList;
import java.util.List;

public class ArrayTypesConvertor {

    static int[] arrayListToIntArrayConversion (List<Integer> inputArray){
        int[] convertedArray = new int[inputArray.size()];
        for (int i = 0; i < inputArray.size(); i++){
            convertedArray[i] = inputArray.get(i);
        }
        return convertedArray;
    }

    public static List<Integer> intArrayToArrayListConversion (int[] inputArray){
        List<Integer> convertedArray = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++){
            convertedArray.add(i, inputArray[i]);
        }
        return convertedArray;
    }
}
