package lesson02.utility;
/*
Utility class for generating random data
 */

import java.util.Random;


public class Randomize {

    public static final String MESSAGE_FOR_INVALID_BOUNDS_INPUT= "Right range bound must be greater than left bound";

    public static int generateRandomNumberInRange (int leftRangeBound, int rightRangeBound){
        if (leftRangeBound >= rightRangeBound) {
            throw new IllegalArgumentException(MESSAGE_FOR_INVALID_BOUNDS_INPUT);
        }
        Random randomNumberInRange = new Random();
        return randomNumberInRange.nextInt((rightRangeBound - leftRangeBound) + 1) + leftRangeBound;
    }
}
