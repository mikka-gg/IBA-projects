package by.iba.gomel;

import java.time.LocalTime;

/**
 * This class takes a time and checks whether it is break or lesson.
 */
public class DateTimeTask3 {
    private static final int       NINE_HOURS          = 9;
    private static final int       FIVE_MINUTES        = 5;
    private static final LocalTime BREAK_DURATION      = LocalTime.of(0, 10);
    private static final LocalTime NEXT_BREAK          = LocalTime.of(0, 55);
    private static final LocalTime END_OF_A_SCHOOL_DAY = LocalTime.of(20, 0);
    private static final LocalTime LESSONS_START       = LocalTime.of(8, 20);
    private LocalTime              breakTime           = LocalTime.of(DateTimeTask3.NINE_HOURS,
            DateTimeTask3.FIVE_MINUTES);

    /**
     * If time to check is from 8:20 (start of a school day) and until 20:00 (end of the school
     * day), checks if it is a break or not.
     *
     * @param timeToCheck
     *            - time to check
     * @return true - if time is in range for a break, false - if it is not
     */
    public boolean isItBreak(final LocalTime timeToCheck) {
        boolean breakIsFound = false;
        while (!timeToCheck.isBefore(DateTimeTask3.LESSONS_START)
                && this.breakTime.isBefore(DateTimeTask3.END_OF_A_SCHOOL_DAY)) {
            if (timeToCheck.isAfter(this.breakTime) && timeToCheck.isBefore(
                    this.breakTime.plusMinutes(DateTimeTask3.BREAK_DURATION.getMinute()))) {
                breakIsFound = true;
                break;
            }
            this.breakTime = this.breakTime.plusMinutes(DateTimeTask3.NEXT_BREAK.getMinute());
        }
        this.breakTime = LocalTime.of(DateTimeTask3.NINE_HOURS, DateTimeTask3.FIVE_MINUTES);
        return breakIsFound;
    }
}
