package dmidob.utils.arraysmanipulation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArrayEditorParametrizedTests {

    private int[] inputArray;
    private int[] resultedArray;
    private int numberForRemoval;

    public ArrayEditorParametrizedTests (int[] inputArray, int[] resultedArray, int numberForRemoval) {
        this.inputArray = inputArray;
        this.resultedArray = resultedArray;
        this.numberForRemoval = numberForRemoval;
    }

    @Parameterized.Parameters(name = "{index}:{0}")
    public static Object[][] dataForTest () {
        return new Object[][] {
                { new int[] {1,2,3,5,5}, new int[] {1,2,3} , 5},
                { new int[] {0,1,2,2,2,5}, new int[] {0,1,5} , 2},
                { new int[] {1,1,1,1,1}, new int[] {} , 1},
        };
    }

    @Test
    public void removeNumberFromArrayTest() {
        int[] editedArray = ArrayEditor.removeNumberFromArray(inputArray,numberForRemoval);
        Assert.assertArrayEquals(resultedArray, editedArray);
    }
}
