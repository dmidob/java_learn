package firstsimpletasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PrimeNumbersTests {

    private int[] primeNumbersFrom2To100IntArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};





    @Test
    public void testSimpleSorting() {
        int[] primeNumbersFrom2To100ArrayList= ArrayTypesConvertor.arrayListToIntArrayConversion(PrimeNumbers.identifyPrimeNumbersArrayList());
        Assert.assertArrayEquals(primeNumbersFrom2To100IntArray, primeNumbersFrom2To100ArrayList);
    }
}
