package by.iba.gomel.tests;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.DateTimeTask2;

/**
 * Tests the DateTimeTask2 class by sending to the inTime() method some dates.
 */
public class DateTimeTask2Test {

    /**
     * Using an instance of the DateTimeTask2 class invokes the inTime() method with some arguments.
     * If tourist will get in time - expects how many minutes the museum will work, if not - expects
     * message that the museum is closed.
     */
    @Test
    public void testInTime() {
        final DateTimeTask2 dts = new DateTimeTask2();
        // MOSCOW
        Assert.assertEquals("Moscow tourist should arrive at 20:29 on Friday",
                "Museum closes in 1 minutes",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 12, 17, 54),
                        ZoneId.of("Europe/Moscow"))));
        Assert.assertEquals("Moscow tourist should arrive at 10:01 on Thuesday",
                "Museum closes in 449 minutes",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 11, 7, 26),
                        ZoneId.of("Europe/Moscow"))));
        Assert.assertEquals("Moscow tourist is late on Friday", "Museum is closed",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 12, 17, 55),
                        ZoneId.of("Europe/Moscow"))));
        // MINSK
        Assert.assertEquals("Minsk tourist should arrive at 20:24 on Friday",
                "Museum closes in 6 minutes",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 12, 18, 54),
                        ZoneId.of("Europe/Minsk"))));
        Assert.assertEquals("Minsk tourist should arrive at 20:29 on Thuesday",
                "Museum closes in 449 minutes",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 11, 8, 31),
                        ZoneId.of("Europe/Minsk"))));
        Assert.assertEquals("Minsk tourist should arrive at 20:25 on Friday",
                "Museum closes in 5 minutes",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 12, 18, 55),
                        ZoneId.of("Europe/Minsk"))));
        // NEW-YORK
        // Will arrive on 13, at 01:04
        Assert.assertEquals("New-York tourist is late on Friday", "Museum is closed",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 12, 10, 59),
                        ZoneId.of("America/New_York"))));
        // Will arrive on 11, at 22:00
        Assert.assertEquals("New-York tourist is late on Saturday", "Museum is closed",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 11, 7, 55),
                        ZoneId.of("America/New_York"))));
        // Will arrive on 12, at 10:01
        Assert.assertEquals("New-York tourist should arrive at 10:01 on Friday",
                "Museum closes in 629 minutes",
                dts.inTime(ZonedDateTime.of(LocalDateTime.of(2021, Month.NOVEMBER, 11, 19, 56),
                        ZoneId.of("America/New_York"))));
    }

}
