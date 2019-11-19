package firstsimpletasks;

import org.junit.Assert;
import org.junit.Test;

public class MaxMinAverageTests {

    private final int[] arrayFrom0To9 = {0,1,2,3,4,5,6,7,8,9};
    private final int[] arrayZeroLength = {};
    private final int[] arrayWithNegativeValues = {-5,225,-1,0,25,-61};


    @Test
    public void testGettingMaxValue() {
        int n = MaxMinAverage.getMaxIntArrayValue(arrayFrom0To9);
        Assert.assertEquals(9, n);
    }

    @Test
    public void testGettingMaxValueArrayWithNegativeValues() {
        Assert.assertEquals(225, MaxMinAverage.getMaxIntArrayValue(arrayWithNegativeValues));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGettingMaxValueZeroLengthArray() {
        MaxMinAverage.getMaxIntArrayValue(arrayZeroLength);
    }

    @Test
    public void testGettingMinValue() {
        int n = MaxMinAverage.getMinIntArrayValue(arrayFrom0To9);
        Assert.assertEquals(0, n);
    }

    @Test
    public void testGettingMinValueArrayWithNegativeValues() {
        int n = MaxMinAverage.getMinIntArrayValue(arrayWithNegativeValues);
        Assert.assertEquals(-61, n);
    }

    @Test
    public void testGettingAverageValue() {
        int n = MaxMinAverage.getAverageIntArrayValue(arrayFrom0To9);
        Assert.assertEquals(4, n);
    }

}
