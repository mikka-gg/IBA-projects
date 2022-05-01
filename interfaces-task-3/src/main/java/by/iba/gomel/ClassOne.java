package by.iba.gomel;

/**
 * This class implements the Log interface, and overrides its default method and hides a static one.
 */
public class ClassOne implements Log {

    /**
     * Overrides the default method log of interface Log, takes a string variable and returns it
     * with a class marker.
     *
     * @param message
     *            - a string variable
     * @return message + class marker
     */
    @Override
    public String log(final String message) {
        return message + " ClassOne";
    }

    /**
     * Hides the static method log of the interface Log.
     *
     * @param level
     *            - a string variable
     * @param message
     *            - a string variable
     * @return string variable, different from the interface method.
     */
    public String log(final String level, final String message) {
        return "HIDES STATIC " + level + " " + message;

    }
}
