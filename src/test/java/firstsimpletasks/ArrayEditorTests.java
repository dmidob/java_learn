package firstsimpletasks;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArrayEditorTests {

    private int[] inputArray;
    private int[] editedArray;
    private int[] numberForRemoval;

    public ArrayEditorTests (int[] inputArray, int[] editedArray, int[] numberForRemoval) {
        this.inputArray = inputArray;
        this.editedArray = editedArray;
        this.numberForRemoval = numberForRemoval;
    }

//name = "{index}:{inputArray}, {editedArray}, {numberForRemoval}"
    @Parameterized.Parameters()
    public static Collection dataForTest() {
        return Arrays.asList(new Integer[][][] {
                {{1,2,3,4,5}, {1,2,3,4},{5}},
                {{1,2,2,2,3}, {1,3},{2}}
        });
    }

    @Test
    public void paramTest() {
        Assert.assertArrayEquals(editedArray, ArrayEditor.removeNumberFromArray(inputArray,numberForRemoval[0]));
    }
}
