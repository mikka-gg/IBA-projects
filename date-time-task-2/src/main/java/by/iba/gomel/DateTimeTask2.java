package by.iba.gomel;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * This class takes a tourist departure time and calculates if the tourist has time to visit a
 * museum. Computes time for the tourists from Minsk, Moscow, New-York plus extra time to get from
 * any airport of London to the museum.
 */
public class DateTimeTask2 {
    private static final LocalTime OPEN_TIME                 = LocalTime.of(10, 0);
    private static final LocalTime DAILY_CLOSE_TIME          = LocalTime.of(17, 30);
    private static final LocalTime FRIDAY_CLOSE_TIME         = LocalTime.of(20, 30);
    private static final LocalTime TIME_TO_GET_FROM_MINSK    = LocalTime.of(3, 0);
    private static final LocalTime TIME_TO_GET_FROM_MOSCOW   = LocalTime.of(4, 5);
    private static final LocalTime TIME_TO_GET_FROM_NEW_YORK = LocalTime.of(7, 35);
    private static final LocalTime TIME_FROM_AIRPORT         = LocalTime.of(1, 30);

    /**
     * Checks whether arrival time is Friday or not, and invokes the hoursCheck() method with the
     * museumArrival and closingTime arguments.
     *
     * @param museumArrival
     *            - tourist departure time
     * @return result of the hoursCheck() method, whether he can get in time or not
     */
    private static String dayCheck(final ZonedDateTime museumArrival) {
        LocalTime closingTime;
        if (museumArrival.getDayOfWeek().getValue() == DayOfWeek.FRIDAY.getValue()) {
            closingTime = DateTimeTask2.FRIDAY_CLOSE_TIME;
            return DateTimeTask2.hoursCheck(museumArrival, closingTime);

        } else {
            closingTime = DateTimeTask2.DAILY_CLOSE_TIME;
            return DateTimeTask2.hoursCheck(museumArrival, closingTime);
        }
    }

    /**
     * Checks if arrival time is between opening and closing hours
     *
     * @param museumArrival
     *            - tourist departure time
     * @param closingTime
     *            - closing time of the museum
     * @return if he is in time - returns how many minutes left until closing, or that museum is
     *         closed
     */
    private static String hoursCheck(final ZonedDateTime museumArrival,
            final LocalTime closingTime) {
        if (museumArrival.toLocalTime().isAfter(DateTimeTask2.OPEN_TIME)
                && museumArrival.toLocalTime().isBefore(closingTime)) {
            final Duration diff = Duration.between(museumArrival.toLocalTime(), closingTime);
            return String.format("Museum closes in %d minutes", diff.toMinutes());
        } else {
            return "Museum is closed";
        }
    }

    /**
     * The method takes a tourist departure time, finds his time zone and computes his arrival time
     * to the museum and whether he can get there in time using the dayCheck() and hoursCheck()
     * method.
     *
     * @param departureTime
     *            - tourist departure time
     * @return result of the dayCheck() method. If the time zone is wrong - returns Wrong time zone.
     */
    public String inTime(final ZonedDateTime departureTime) {
        final ZoneId currentZone = ZoneId.of("Europe/London");
        ZonedDateTime museumArrival;
        String returnValue = null;

        switch (departureTime.getZone().toString()) {
            case "Europe/Minsk":
                museumArrival = departureTime.withZoneSameInstant(currentZone)
                        .plusSeconds(DateTimeTask2.TIME_TO_GET_FROM_MINSK.toSecondOfDay())
                        .plusSeconds(DateTimeTask2.TIME_FROM_AIRPORT.toSecondOfDay());
                returnValue = DateTimeTask2.dayCheck(museumArrival);
                break;
            case "Europe/Moscow":
                museumArrival = departureTime.withZoneSameInstant(currentZone)
                        .plusSeconds(DateTimeTask2.TIME_TO_GET_FROM_MOSCOW.toSecondOfDay())
                        .plusSeconds(DateTimeTask2.TIME_FROM_AIRPORT.toSecondOfDay());
                returnValue = DateTimeTask2.dayCheck(museumArrival);
                break;
            case "America/New_York":
                museumArrival = departureTime.withZoneSameInstant(currentZone)
                        .plusSeconds(DateTimeTask2.TIME_TO_GET_FROM_NEW_YORK.toSecondOfDay())
                        .plusSeconds(DateTimeTask2.TIME_FROM_AIRPORT.toSecondOfDay());
                returnValue = DateTimeTask2.dayCheck(museumArrival);
                break;
            default:
                returnValue = "Wrong time zone";
                break;
        }
        return returnValue;
    }
}
