package by.iba.gomel;

/**
 * PrimitiveConversions
 */
public class PrimitiveConversions {

    private static final long   BYTE_X = 122L;
    private static final short  BYTE_Y = 2;

    private static final byte   INT_X  = 5;
    private static final double INT_Y  = 15.3;

    private static final int    LONG_X = 34012;
    private static final double LONG_Y = 10.1;

    PrimitiveConversions() {

    }

    /**
     * primConvertToByte
     *
     * @param b
     *            doc
     * @return byteResult
     */
    public static final byte primConvertToByte(final byte b) {
        byte byteResult = 0;
        byteResult = (byte) ((b + PrimitiveConversions.BYTE_X) / PrimitiveConversions.BYTE_Y);
        return byteResult;
    }

    /**
     * primConvertToInt
     *
     * @param i
     *            doc
     * @return intResult
     */
    public static final int primConvertToInt(final int i) {
        int intResult = 0;
        intResult = (int) ((i + PrimitiveConversions.INT_X) / PrimitiveConversions.INT_Y);
        return intResult;
    }

    /**
     * primConvertToLong
     *
     * @param l
     *            doc
     * @return longResult
     */
    public static final long primConvertToLong(final long l) {
        long longResult = 0;
        longResult = (long) ((l * PrimitiveConversions.LONG_X) - PrimitiveConversions.LONG_Y);
        return longResult;
    }
}
