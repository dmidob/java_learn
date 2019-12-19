package lesson02.tasksresolve;

import lesson01.loopspracticing.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeCheckerTests {

    @Test
    public void isPrimeTest() {
        assertTrue(PrimeChecker.isPrime(5));
        assertFalse(PrimeChecker.isPrime(6));
        assertFalse(PrimeChecker.isPrime(1));
    }
}



