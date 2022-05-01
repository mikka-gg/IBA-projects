package by.iba.gomel.tests;

import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.DateTimeTask3;

/**
 * Test for the DateTimeTask3 class that checks if a returned value is correct.
 */
public class DateTimeTask3Test {
    /**
     * Using an instance of the DateTimeTask3 class sends to the isItBreak() method as parameter
     * some time. If the time is in a break range - expects true, otherwise - false .
     *
     * 8:20 break ends
     *
     * 9:05 break starts
     *
     * 9:15 break ends
     *
     * 10:00 break starts
     *
     * 10:10 break ends
     *
     * 10:55 break starts
     *
     * 11:05 break ends
     *
     * 11:50 break starts
     *
     * 12:00 break ends
     *
     * 12:45 break starts
     *
     * 12:55 break ends
     *
     * 13:40 break starts
     *
     * 13:50 break ends
     *
     * 14:35 break starts
     *
     */
    @Test
    public void testIsItBreak() {
        final DateTimeTask3 dts = new DateTimeTask3();
        // BREAKS
        Assert.assertTrue("A break should be from 9:05 to 9:15",
                dts.isItBreak(LocalTime.of(9, 14)));
        Assert.assertTrue("A break should be from 11:50 to 12:00",
                dts.isItBreak(LocalTime.of(11, 53)));
        Assert.assertTrue("A break should be from 14:35 to 14:45",
                dts.isItBreak(LocalTime.of(14, 40)));
        // NOT BREAKS
        Assert.assertFalse("A lesson should be from 8:20 to 9:05",
                dts.isItBreak(LocalTime.of(8, 50)));
        Assert.assertFalse("A lesson should be from 11:05 to 11:50",
                dts.isItBreak(LocalTime.of(11, 50)));
        Assert.assertFalse("A lesson should be from 14:45 to 15:30",
                dts.isItBreak(LocalTime.of(14, 50)));
        Assert.assertFalse("School is closed", dts.isItBreak(LocalTime.of(1, 50)));
    }
}
