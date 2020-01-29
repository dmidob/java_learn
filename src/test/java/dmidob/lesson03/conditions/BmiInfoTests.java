package dmidob.lesson03.conditions;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class BmiInfoTests {
    @DataProvider
    public static Object[][] positiveTestDataSet() {
        return new Object[][] {
                { 75.0, 1.80 ,"Underweight"},
                { 180, 1.20,"Overweight"},
                { 95, 1.95, "Normal"},
        };
    }

    @DataProvider
    public static Object[][] negativeTestDataSet() {
        return new Object[][] {
                { 0.00, 1.80},
                {95.0, 0.00},
                { -10.23, 1.80},
                { 89.0, -1.80},
        };
    }

    @Test
    @UseDataProvider("positiveTestDataSet")
    public void bmiInfoTest(double weight, double height, String expectedBmiInfoTextResult) {
        String calculatedBmiInfoTextResult = BmiInfo.bmiInfo(weight, height);
        Assert.assertEquals(expectedBmiInfoTextResult, expectedBmiInfoTextResult);
    }

    @Test(expected = IllegalArgumentException.class)
    @UseDataProvider("negativeTestDataSet")
    public void IllegalArgumentExceptionTest(double weight, double height) {
        BmiInfo.bmiInfo(weight, height);
    }

}
