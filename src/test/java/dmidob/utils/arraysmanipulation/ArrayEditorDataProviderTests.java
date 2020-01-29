package dmidob.utils.arraysmanipulation;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class ArrayEditorDataProviderTests {

    @DataProvider
    public static Object[][] numbersRemovingFromArrayTest() {
        return new Object[][] {
            { new int[] {1,2,3,5,5}, new int[] {1,2,3} , 5},
            { new int[] {0,1,2,2,2,5}, new int[] {0,1,5} , 2},
            { new int[] {1,1,1,1,1}, new int[] {} , 1},
        };
    }

    @Test
    @UseDataProvider("numbersRemovingFromArrayTest")
    public void removeNumberFromArrayTest(int[] inputArray, int[] resultedArray, int numberForRemoval) {
        int[] editedArray = ArrayEditor.removeNumberFromArray(inputArray,numberForRemoval);
        Assert.assertArrayEquals(resultedArray, editedArray);
    }
}


