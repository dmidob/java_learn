package firstsimpletasks;

import java.util.ArrayList;
import java.util.List;

class ArrayGenerator {

    private static final int LIMIT_FOR_RIGHT_ARRAY_BOUND = 300;

    //method for array generating and filling it by random int numbers from 0 to 300 using List array.
    static List<Integer> generateRandomArrayList (int arrayLength) {
        List<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            newArrayList.add(i, (int) (Math.random() * LIMIT_FOR_RIGHT_ARRAY_BOUND));
        }
        return newArrayList;
    }

    //method for array generating and filling it by random int numbers from 0 to 300 using primitive array.
    static int[] generateRandomIntArray (int arrayLength) {
        int[] newIntArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newIntArray[i] = (int) (Math.random() * LIMIT_FOR_RIGHT_ARRAY_BOUND);
        }
        return newIntArray;
    }

}
