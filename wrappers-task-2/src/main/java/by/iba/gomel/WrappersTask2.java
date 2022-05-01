package by.iba.gomel;

import java.text.DecimalFormat;

/**
 * This class contains a calcExpression() method which calculates (1-tg x)^ctg x + cos(x-y) and
 * returns a result.
 */
public class WrappersTask2 {
    /**
     * Calculates (1-tg x)^ctg x + cos(x-y) and returns in 0.000 format.
     *
     * @param x
     *            - x value, not zero
     * @param y
     *            - y value
     * @return a result of the (1-tg x)^ctg x + cos(x-y) expression
     */
    public final Double calcExpression(final Double x, final Double y) {
        final DecimalFormat df = new DecimalFormat("0.000");
        return Double.parseDouble(df.format(
                (Math.pow(1 - Math.tan(x), (Math.cos(x) / Math.sin(x)))) + (Math.cos(x - y))));
    }
}
