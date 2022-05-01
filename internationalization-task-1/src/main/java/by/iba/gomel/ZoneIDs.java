package by.iba.gomel;

/**
 * Contains time zone and its pattern for date and time.
 */
public class ZoneIDs {

    private final String zoneId;
    private final String zonePattern;

    /**
     * This constructor takes a time zone and pattern for date and time.
     *
     * @param zoneId
     *            - String, time zone.
     * @param zonePattern
     *            - String, date and time pattern.
     */
    public ZoneIDs(final String zoneId, final String zonePattern) {
        this.zoneId = zoneId;
        this.zonePattern = zonePattern;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public String getZonePattern() {
        return this.zonePattern;
    }

}
