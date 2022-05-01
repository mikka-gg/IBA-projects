package by.iba.gomel;

import java.io.Serializable;

/**
 * Represents a display with resolution, brightness, model.
 */
public class Display implements Serializable {
    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    private final String      resolution;
    private final int         brightness;
    private final String      model;

    /**
     * Default constructor.
     *
     * @param resolution
     *            - resolution.
     * @param brightness
     *            - brightness.
     * @param model
     *            - model.
     */
    public Display(final String resolution, final int brightness, final String model) {
        this.resolution = resolution;
        this.brightness = brightness;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Resolution:" + this.resolution + " Brightness:" + this.brightness + " Model:"
                + this.model;
    }

}
