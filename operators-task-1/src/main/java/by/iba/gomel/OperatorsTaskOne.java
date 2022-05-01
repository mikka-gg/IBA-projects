/**
 *
 */
package by.iba.gomel;

/**
 * OperatorsTaskOne
 */
public final class OperatorsTaskOne {

    private static final int ONE   = 1;
    private static final int TWO   = 2;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;

    private OperatorsTaskOne() {

    }

    /**
     * arithmeticDemo
     *
     * @return doc
     */
    public static int arithmeticDemo() {
        int result = 1;
        result += OperatorsTaskOne.TWO;
        result -= OperatorsTaskOne.ONE;
        result *= OperatorsTaskOne.TWO;
        result /= OperatorsTaskOne.TWO;
        result += OperatorsTaskOne.EIGHT;
        result %= OperatorsTaskOne.SEVEN;
        return result;
    }
}
