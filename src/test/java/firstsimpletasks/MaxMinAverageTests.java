package firstsimpletasks;

import org.junit.Assert;
import org.junit.Test;

public class MaxMinAverageTests {

    private int[] newArray = {0,1,2,3,4,5,6,7,8,9};
    private int[] zeroLengthArray = {};
    private int[] arrayWithNegativeValues = {-5,225,-1,0,25,-61};


    @Test
    public void testGettingMaxValue() {
        int n = MaxMinAverage.getMaxIntArrayValue(newArray);
        Assert.assertEquals(9, n);
    }

    @Test
    public void testGettingMaxValueArrayWithNegativeValues() {
        int n = MaxMinAverage.getMaxIntArrayValue(arrayWithNegativeValues);
        Assert.assertEquals(225, n);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGettingMaxValueZeroLengthArray() {
        MaxMinAverage.getMaxIntArrayValue(zeroLengthArray);
    }

    @Test
    public void testGettingMinValue() {
        int n = MaxMinAverage.getMinIntArrayValue(newArray);
        Assert.assertEquals(0, n);
    }

    @Test
    public void testGettingMinValueArrayWithNegativeValues() {
        int n = MaxMinAverage.getMinIntArrayValue(arrayWithNegativeValues);
        Assert.assertEquals(-61, n);
    }

    @Test
    public void testGettingAverageValue() {
        int n = MaxMinAverage.getAverageIntArrayValue(newArray);
        Assert.assertEquals(4, n);
    }

}
