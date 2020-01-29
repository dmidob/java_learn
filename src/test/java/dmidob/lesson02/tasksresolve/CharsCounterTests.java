package dmidob.lesson02.tasksresolve;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class CharsCounterTests {

    @DataProvider
    public static Object[][] testDataSet() {
        return new Object[][] {
                { "aaa", 'a' , 3},
                { "Some text here", 'x' , 1},
                { "01234567890123456789", '9' , 2},
                { " ", ' ' , 1},
                { "ABCDEFG", 'a' , 0}
        };
    }

    @Test
    @UseDataProvider("testDataSet")
    public void countCharsTest(String inputString, char charToFind, int resultCount) {
        int charsCount = CharsCounter.countChars(inputString, charToFind);
        Assert.assertEquals(resultCount, charsCount);
    }

}
