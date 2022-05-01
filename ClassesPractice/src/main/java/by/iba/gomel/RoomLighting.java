package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RoomLighting
 */
public class RoomLighting {

    /**
     * Logger.
     */
    private static final Logger LOGGER      = LoggerFactory.getLogger(RoomLighting.class);

    private static String       balb1Status = "Off";
    private static String       balb2Status = "On";

    /**
     * balb1Switch
     *
     * @param balbSwitch
     *            doc
     * @return balb1Status
     */
    public static String balb1Switch(final String balbSwitch) {
        RoomLighting.balb1Status = balbSwitch;
        return RoomLighting.balb1Status;
    }

    /**
     * balb2Switch
     *
     * @param balbSwitch
     *            doc
     * @return balb2Status
     */
    public static String balb2Switch(final String balbSwitch) {
        RoomLighting.balb2Status = balbSwitch;
        return RoomLighting.balb2Status;
    }

    /**
     * balb1StatusOutput
     */
    public void balb1StatusOutput() {
        RoomLighting.LOGGER.info("\nBalb 1 status - {}", RoomLighting.balb1Status);
    }

    /**
     * balb2StatusOutput
     */
    public void balb2StatusOutput() {
        RoomLighting.LOGGER.info("\nBalb 2 status - {}", RoomLighting.balb2Status);
    }
}
