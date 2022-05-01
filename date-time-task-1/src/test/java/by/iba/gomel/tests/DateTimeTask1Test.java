package by.iba.gomel.tests;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.DateTimeTask1;

/**
 * The test for the DateTimeTask1 class.
 */
public class DateTimeTask1Test {
    /**
     * Using an instance of the DateTimeTask1 class checks if the isBankWorking() method returns the
     * correct duration of work of the bank.
     */
    @Test
    public void testIsBankWorking() {
        final DateTimeTask1 date = new DateTimeTask1();

        // User time is 11.12.2021, Friday
        Assert.assertEquals("The bank should work 9 hours on Friday", 9,
                date.isBankWorking(LocalDate.of(2021, 11, 12)));
        // User time is 11.13.2021, Saturday
        Assert.assertEquals("The bank should work 5 hours on Saturday", 5,
                date.isBankWorking(LocalDate.of(2021, 11, 13)));
        // User time is 11.30.2021, Tuesday, the last day of the month
        Assert.assertEquals("The bank should work 5 hours at the last day of the month", 5,
                date.isBankWorking(LocalDate.of(2021, 11, 30)));
        // User time is 11.14.2021, Sunday
        Assert.assertEquals("The bank does not work on Sunday", -1,
                date.isBankWorking(LocalDate.of(2021, 11, 14)));
    }

}
