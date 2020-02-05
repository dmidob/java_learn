package dmidob.lesson03.conditions;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class BlackJackTests {
    @DataProvider
    public static Object[][] positiveTestDataSet() {
        return new Object[][] {
                { 12, 20 , 20},
                { 19, 12, 19},
                { 22, 7, 7},
                { 23, 25, 0},
        };
    }

    @DataProvider
    public static Object[][] negativeTestDataSet() {
        return new Object[][] {
                { -1, 20},
                { 23, -5},
                { -1, 0},
                { 0, 45},
        };
    }

    @Test
    @UseDataProvider("positiveTestDataSet")
    public void blackJackTest(int cardA, int cardB, int expectedScoreResult) {
        int winningScoreResult = BlackJack.blackjackScore(cardA, cardB);
        Assert.assertEquals(winningScoreResult, expectedScoreResult);
    }

    @Test(expected = IllegalArgumentException.class)
    @UseDataProvider("negativeTestDataSet")
    public void IllegalArgumentExceptionTest(int cardA, int cardB) {
        BlackJack.blackjackScore(cardA, cardB);
    }
}
