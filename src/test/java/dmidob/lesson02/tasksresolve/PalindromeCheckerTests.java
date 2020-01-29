package dmidob.lesson02.tasksresolve;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class PalindromeCheckerTests {

    @DataProvider
    public static Object[][] testDataSet() {
        return new Object[][] {
                { "aaa", true},
                { "1234321", true},
                { "1", true},
                { "abcdefgfedcba", true},
                { "ABCDEFG", false},
                { "1233221", false}
        };
    }

    @Test
    @UseDataProvider("testDataSet")
    public void isPalindromeTest(String inputString, boolean expectedResult) {
        boolean actualResult = PalindromeChecker.isPalindrome(inputString);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
