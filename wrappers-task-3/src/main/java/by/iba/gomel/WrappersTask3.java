package by.iba.gomel;

/**
 * This class contains a static numToDifNotations() method, that returns different notations of a
 * number.
 */
public final class WrappersTask3 {
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_TWO = 31;

    /**
     * Private constructor.
     */
    private WrappersTask3() {

    }

    /**
     * Takes an integer number from 1 to 31 inclusive and returns decimal, binary, octal and hex
     * notations of it.
     *
     * @param number
     *            - an integer number from 1 to 31
     * @return decimal, binary, octal and hex notations of the number. If number not in the range -
     *         returns an empty String.
     */
    public static String numToDifNotations(final int number) {
        if ((number >= WrappersTask3.NUMBER_ONE) && (number <= WrappersTask3.NUMBER_TWO)) {
            return number + " " + Integer.toBinaryString(number) + " "
                    + Integer.toOctalString(number) + " " + Integer.toHexString(number);
        }
        return "";
    }
}
