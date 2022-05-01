package by.iba.gomel;

/**
 * Signals that not expected letter is found.
 */
public class NonLetterException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Signals that not expected letter is found.
     *
     * @param errorMessage
     *            - a message to send.
     */
    public NonLetterException(final String errorMessage) {
        super(errorMessage);
    }

}
