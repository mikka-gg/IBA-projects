package by.iba.gomel;

/**
 * OperatorsTaskTwo
 */
public final class OperatorsTaskTwo {

    private static final int  POS_X = 0b00001010; // 10
    private static final int  NEG_X = 0b111111111111111111111111_11110110; // -10

    private static final byte TWO   = 2;

    private OperatorsTaskTwo() {

    }

    /**
     * negLeftShift
     *
     * @return doc
     */
    public static int negLeftShift() {
        return OperatorsTaskTwo.NEG_X << OperatorsTaskTwo.TWO;
    }

    /**
     * negRightShift
     *
     * @return doc
     */
    public static int negRightShift() {
        return OperatorsTaskTwo.NEG_X >> OperatorsTaskTwo.TWO;
    }

    /**
     * negUnRightShift
     *
     * @return doc
     */
    public static int negUnRightShift() {
        return OperatorsTaskTwo.NEG_X >>> OperatorsTaskTwo.TWO;
    }

    /**
     * posLeftShift
     *
     * @return doc
     */
    public static int posLeftShift() {
        return OperatorsTaskTwo.POS_X << OperatorsTaskTwo.TWO;
    }

    /**
     * posRightShift
     *
     * @return doc
     */
    public static int posRightShift() {
        return OperatorsTaskTwo.POS_X >> OperatorsTaskTwo.TWO;
    }

    /**
     * posUnRightShift
     *
     * @return doc
     */
    public static int posUnRightShift() {
        return OperatorsTaskTwo.POS_X >>> OperatorsTaskTwo.TWO;
    }
}
