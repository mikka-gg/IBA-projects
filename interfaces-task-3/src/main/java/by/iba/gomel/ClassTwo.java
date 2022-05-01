package by.iba.gomel;

/**
 * This class implements the Log interface, and overrides its default method and uses the static
 * method of interface, WITHOUT hiding it.
 */
public class ClassTwo implements Log {

    /**
     * Overrides the default method log of the interface Log, takes a string variable and returns it
     * with a class marker.
     *
     * @param message
     *            - a string variable
     * @return message + class marker
     */
    @Override
    public String log(final String message) {
        return message + " ClassTwo";

    }

    /**
     * Uses the static method of the interface.
     *
     * @param level
     *            - a string variable
     * @param message
     *            - a string variable
     * @return default return of the static log method of the interface Log.
     */
    public String log(final String level, final String message) {
        return Log.log(level, message);

    }
}
