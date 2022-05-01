package by.iba.gomel;

import java.util.function.DoubleBinaryOperator;

/**
 * Uses a functional interface of java.util.function package to calculate the power of the first
 * argument raised to the second argument.
 */
public class LambdaTask3 {

    /**
     * Calculates the power of the first argument raised to the second argument by using the
     * DoubleBinaryOperator functional interface and a lambda expression.
     *
     * @param x
     *            - first argument.
     * @param y
     *            - second argument.
     * @return - the power of the first argument raised to the second argument.
     */
    public Double calcPow(final Double x, final Double y) {
        final DoubleBinaryOperator func = (t, u) -> {
            double power = 0;
            while (Double.compare(u, 1.0) == 1) {
                u = u / t;
                power++;
            }
            return power;
        };
        return func.applyAsDouble(x, y);
    }
}
