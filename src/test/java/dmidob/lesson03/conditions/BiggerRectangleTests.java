package dmidob.lesson03.conditions;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class BiggerRectangleTests {

    @DataProvider
    public static Object[][] positiveTestDataSet() {
        return new Object[][] {
                { 10, 20 , 30, 40, 2},
                { 20, 40, 5, 10, 1},
        };
    }

    @DataProvider
    public static Object[][] negativeTestDataSet() {
        return new Object[][] {
                { -10, 20, 30, 40},
                { 10, -20, 30, 40},
                { 10, 20, -30, 40},
                { 10, 20, 30, -40},
                { 0, 20, 30, 40},
                { 10, 0, 30, 40},
                { 10, 20, 0, 40},
                { 10, 20, 30, 0},
        };
    }

    @Test
    @UseDataProvider("positiveTestDataSet")
    public void biggerRectangleTest(int width1, int height1, int width2, int height2, int numberOfBiggerRectangle) {
        int resultOfRectanglesComparison = BiggerRectangle.biggerRectangle(width1,height1,width2,height2);
        Assert.assertEquals(numberOfBiggerRectangle, resultOfRectanglesComparison);
    }

    @Test(expected = IllegalArgumentException.class)
    @UseDataProvider("negativeTestDataSet")
    public void IllegalArgumentExceptionTest(int width1, int height1, int width2, int height2) {
        BiggerRectangle.biggerRectangle(width1,height1,width2,height2);
    }
}
