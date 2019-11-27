package lesson02;

import java.util.Random;

public class Randomize {

    static int generateRandomNumberInRange(int leftRangeBound, int rightRangeBound){
        if (leftRangeBound >= rightRangeBound) {
            throw new IllegalArgumentException("Right range bound must be greater than left range bound");
        }
        Random randomNumberInRange = new Random();
        return randomNumberInRange.nextInt((rightRangeBound - leftRangeBound) + 1) + leftRangeBound;
    }
}
