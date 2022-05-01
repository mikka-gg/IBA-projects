package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SamsungMonitor
 */
public class SamsungMonitor implements Monitor {

    private static final Logger LOGGER     = LoggerFactory.getLogger(SamsungMonitor.class);

    private int                 resolution = 1080;
    private int                 brightness = 50;

    /**
     * brightnessDecrement
     *
     * @return brightness
     * @param decrement
     */
    @Override
    public int brightnessDecrement(final int decrement) {
        this.brightness = this.brightness - decrement;
        return this.brightness;
    }

    /**
     * brightnessIncrement
     *
     * @return brightness
     * @param increment
     */
    @Override
    public int brightnessIncrement(final int increment) {
        this.brightness = this.brightness + increment;
        return this.brightness;
    }

    /**
     * changeResolution
     *
     * @return resolution
     * @param newResolution
     */
    @Override
    public int changeResolution(final int newResolution) {
        this.resolution = newResolution;
        return this.resolution;
    }

    /**
     * monitorOutput
     */
    public void monitorOutput() {
        SamsungMonitor.LOGGER.info("Resolution: {}", this.resolution);
        SamsungMonitor.LOGGER.info(" Brightness: {} \n", this.brightness);
    }
}
