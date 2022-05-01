package by.iba.gomel;

/**
 * interface Monitor
 */
public interface Monitor {

    /**
     * brightnessDecrement
     *
     * @param decrement
     *            doc
     * @return decrement
     */
    int brightnessDecrement(final int decrement);

    /**
     * brightnessIncrement
     *
     * @param increment
     *            doc
     * @return decrement
     */
    int brightnessIncrement(final int increment);

    /**
     * changeResolution
     *
     * @param newResolution
     *            doc
     * @return decrement
     */
    int changeResolution(final int newResolution);
}
