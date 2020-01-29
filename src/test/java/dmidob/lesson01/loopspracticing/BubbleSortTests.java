package dmidob.lesson01.loopspracticing;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTests {

    private final int[] newIntArray = {9,-5,32,-62,192,-225,9};
    private final int[] newIntArraySorted = {-225,-62,-5,9,9,32,192};
    private final int[] newIntSingleElementArray = {0};
    private final int[] newIntSingleElementArraySorted = {0};

    @Test
    public void testSimpleSorting() {
        assertArrayEquals(newIntArraySorted, new BubbleSort().arrayBubbleSortingIntArray(newIntArray));
    }

    @Test
    public void testSingleElementArraySorting() {
        assertArrayEquals(newIntSingleElementArraySorted, new BubbleSort().arrayBubbleSortingIntArray(newIntSingleElementArray));
    }
}
