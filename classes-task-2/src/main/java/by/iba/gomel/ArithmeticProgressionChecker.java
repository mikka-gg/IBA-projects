package by.iba.gomel;

/**
 * This class has method 'checker' that checks if number sequences are arithmetic progression or
 * not.
 */
public class ArithmeticProgressionChecker {
    public static final int NUMBER_TWO = 2;

    /**
     * This method takes arbitrary number of integer numbers and checks if sequence an arithmetic
     * progression.
     *
     * @param sequence
     *            - is a variable number of integer arguments.
     * @return - boolean expression. True - sequence is an arithmetic progression, false - sequence
     *         is not an arithmetic progression.
     */
    public boolean checker(final int... sequence) {
        // Common difference.
        int d;
        // Checks if sequence is more than 2 or more arguments, if not returns false.
        if (sequence.length >= ArithmeticProgressionChecker.NUMBER_TWO) {
            d = sequence[1] - sequence[0];
        } else {
            return false;
        }
        // Checks if difference of 2 elements equals to common difference, if not returns false.
        // Also checks if common difference is not 0 or returns false.
        for (int i = 1; i < sequence.length; i++) {
            if ((((sequence[i] - sequence[i - 1]) != d) || (d == 0))) {
                return false;
            }
        }
        return true;
    }
}
