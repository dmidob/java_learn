package dmidob.lesson03.conditions;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class LuckyTicketTests {
    @DataProvider
    public static Object[][] testDataSet() {
        return new Object[][] {
                {111111,true},
                {123213,true},
                {205016,true},
                {427355,true},
                {554236,false},
                {80080,true},
                {1,false},
                {1001,true},
                {11110,true},
        };
    }

    @Test
    @UseDataProvider("testDataSet")
    public void positiveLuckyTicketTest(int ticket, boolean expectedIsTicketLucky) {
        boolean actualIsTicketLucky = LuckyTicket.isLuckyTicket(ticket);
        Assert.assertEquals(expectedIsTicketLucky, actualIsTicketLucky);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IllegalArgumentExceptionTest() {
        LuckyTicket.isLuckyTicket(-5);
    }

}

