package by.iba.gomel;

/**
 * Contains a static and a default method, which take string values and return it with an interface
 * marker, if not overridden or hidden.
 */
public interface Log {
    /**
     * Takes 2 strings and returns it with an interface marker.
     *
     * @param level
     *            - a string variable
     * @param message
     *            - a string variable
     * @return level + " INTERFACE " + message
     */
    static String log(final String level, final String message) {
        return level + " INTERFACE " + message;
    }

    /**
     * Takes string and returns it with an interface marker.
     *
     * @param message
     *            - a string variable
     * @return message + " Default method"
     */
    default String log(final String message) {
        return message + " Default method";
    }
}
