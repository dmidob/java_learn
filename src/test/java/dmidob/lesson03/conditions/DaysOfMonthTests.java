package dmidob.lesson03.conditions;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DaysOfMonthTests {
    @DataProvider
    public static Object[][] positiveTestDataSet() {
        return new Object[][] {
                {1,31},
                {2,28},
                {4,30},
                {7,31},
                {11,30},
        };
    }

    @DataProvider
    public static Object[][] negativeTestDataSet() {
        return new Object[][] {
                {0},
                {15},
                {-9},
        };
    }

    @Test
    @UseDataProvider("positiveTestDataSet")
    public void daysOfMonthsTest(int month, int expectedNumberOfDaysInMonth) {
        int actualNumberOfDaysInMonth = DaysOfMonth.daysOfMonth(month);
        Assert.assertEquals(expectedNumberOfDaysInMonth, actualNumberOfDaysInMonth);
    }

    @Test(expected = IllegalArgumentException.class)
    @UseDataProvider("negativeTestDataSet")
    public void IllegalArgumentExceptionTest(int month) {
        DaysOfMonth.daysOfMonth(month);
    }
}

