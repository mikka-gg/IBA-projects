package by.iba.gomel;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * This class has the timezone() method, that takes date and time, and returns a List with the date
 * and time in the cities Washington, London, Paris, and Berlin.
 */
public final class InternationalizationTask1App {

    private static final String EUROPEAN_DATE_TIME_PATTERN  = "dd-MM-yyyy HH:mm:ss";
    private static final String AMERICAN_DATE_TIME_PATTERN = "MM-dd-yyyy hh:mm:ss a";

    /**
     * Default constructor.
     */
    private InternationalizationTask1App() {

    }

    /**
     * Takes a ZonedDateTime object and returns a List of Strings with the dates and times in the
     * cities Washington, London, Paris, and Berlin.
     *
     * @param currentTime
     *            - the ZonedDateTime object, some date and time with a time zone.
     * @return the List of Strings with the dates and times.
     */
    public static List<String> timezone(final ZonedDateTime currentTime) {

        final List<String> multicityDateTimeClock = new ArrayList<>();
        final List<ZoneIDs> zoneIDs = new ArrayList<>();

        zoneIDs.add(new ZoneIDs("America/New_York",
                InternationalizationTask1App.AMERICAN_DATE_TIME_PATTERN));
        zoneIDs.add(new ZoneIDs("Europe/London",
                InternationalizationTask1App.EUROPEAN_DATE_TIME_PATTERN));
        zoneIDs.add(
                new ZoneIDs("Europe/Paris", InternationalizationTask1App.EUROPEAN_DATE_TIME_PATTERN));
        zoneIDs.add(new ZoneIDs("Europe/Berlin",
                InternationalizationTask1App.EUROPEAN_DATE_TIME_PATTERN));

        for (final ZoneIDs zone : zoneIDs) {
            multicityDateTimeClock.add(DateTimeFormatter.ofPattern(zone.getZonePattern())
                    .format(currentTime.withZoneSameInstant(ZoneId.of(zone.getZoneId())))
                    .concat(" - " + zone.getZoneId()));
        }

        return multicityDateTimeClock;
    }
}
