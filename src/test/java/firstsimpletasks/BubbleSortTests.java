package firstsimpletasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTests {

    private int[] newIntArray = {9,-5,32,-62,192,-225,9};
    private int[] newIntArraySorted = {-225,-62,-5,9,9,32,192};
    private int[] newIntSingleElementArray = {0};
    private int[] newIntSingleElementArraySorted = {0};


    @Test
    public void testSimpleSorting() {
        assertArrayEquals(newIntArraySorted, BubbleSort.arrayBubbleSortingIntArray(newIntArray));
    }

    @Test
    public void testSingleElementArraySorting() {
        assertArrayEquals(newIntSingleElementArraySorted, BubbleSort.arrayBubbleSortingIntArray(newIntSingleElementArray));
    }

}
