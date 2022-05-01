package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * This class determines how long a bank works at given date.
 */
public class DateTimeTask1 {
    private static final int FIVE_HOURS = 5;
    private static final int NINE_HOURS = 9;

    /**
     * Takes user date and depending on what day it is, returns how long the bank works at that day.
     *
     * @param userDate
     *            - user date (year, month, day)
     * @return - the duration of work of the bank in hours, -1 if the day is Sunday
     */
    public long isBankWorking(final LocalDate userDate) {
        Duration bankWorks;

        if ((userDate.getDayOfWeek() == DayOfWeek.SATURDAY)
                || (userDate.equals(userDate.with(TemporalAdjusters.lastDayOfMonth())))) {
            bankWorks = Duration.ofHours(DateTimeTask1.FIVE_HOURS);
        } else if ((userDate.getDayOfWeek().getValue() >= DayOfWeek.MONDAY.getValue())
                && (userDate.getDayOfWeek().getValue() <= DayOfWeek.FRIDAY.getValue())) {
            bankWorks = Duration.ofHours(DateTimeTask1.NINE_HOURS);
        } else {
            bankWorks = Duration.ofHours(-1);
        }
        return bankWorks.toHours();
    }
}
