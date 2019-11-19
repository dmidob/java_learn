package firstsimpletasks;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class PrimeNumbersTests {

    private final List<Integer> primeNumbersFrom2To100ArrayExpected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

    @Test
    public void testSimpleSorting() {
        List<Integer> primeNumbersFrom2To100ArrayActual = PrimeNumbers.identifyPrimeNumbersArrayList();
        Assert.assertEquals(primeNumbersFrom2To100ArrayExpected , primeNumbersFrom2To100ArrayActual);
    }
}
