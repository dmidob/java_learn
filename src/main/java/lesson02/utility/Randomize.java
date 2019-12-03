package lesson02.utility;
/*
Utility class for generating random data
 */

import java.util.Random;

public class Randomize {

    public static int generateRandomNumberInRange (int leftRangeBound, int rightRangeBound){
        if (leftRangeBound >= rightRangeBound) {
            throw new IllegalArgumentException("Right range bound must be greater than left range bound");
        }
        Random randomNumberInRange = new Random();
        return randomNumberInRange.nextInt((rightRangeBound - leftRangeBound) + 1) + leftRangeBound;
    }
}