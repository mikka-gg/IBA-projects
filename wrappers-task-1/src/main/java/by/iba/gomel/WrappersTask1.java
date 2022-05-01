package by.iba.gomel;

import java.text.DecimalFormat;

/**
 * This class has a floatPointSum() method that sums elements from a floating-point sequence.
 */
public class WrappersTask1 {
    private static final int NUMBER_TWO = 2;

    /**
     * Takes a sequence of floating-point numbers and if number of arguments is more than 1 sums all
     * the elements. Otherwise throws IllegalArgumentException.
     *
     * @param doubleSequence
     *            - a sequence of floating-point values.
     * @return - a result of the sum in format 0.00
     */
    public final String floatPointSum(final double[] doubleSequence) {
        if (doubleSequence.length < WrappersTask1.NUMBER_TWO) {
            throw new IllegalArgumentException();
        }
        double answer = 0;
        final DecimalFormat df = new DecimalFormat("0.00");
        for (final double element : doubleSequence) {
            answer += element;
        }
        return df.format(answer);
    }
}
