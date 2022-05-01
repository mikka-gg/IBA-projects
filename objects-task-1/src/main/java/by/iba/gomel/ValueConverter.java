package by.iba.gomel;

/**
 * This class takes any integer or floating point value and returns its type.
 */
public class ValueConverter {
    public static final int NUMBER_ONE   = 1;
    public static final int NUMBER_TWO   = 2;
    public static final int NUMBER_THREE = 3;
    public static final int NUMBER_FOUR  = 4;
    public static final int NUMBER_FIVE  = 5;
    public static final int NUMBER_SIX   = 6;
    public static final int NUMBER_SEVEN = 7;
    private final int       constructorNumber;

    /**
     * This constructor takes byte value and assigns "constructorNumber" to 1.
     *
     * @param byteValue
     *            - a byte value
     */
    @SuppressWarnings(value = {"byteValue"})
    public ValueConverter(final byte byteValue) {
        this.constructorNumber = ValueConverter.NUMBER_ONE;
    }

    /**
     * This constructor takes char value and assigns "constructorNumber" to 2.
     *
     * @param charValue
     *            - a char value
     */
    @SuppressWarnings(value = {"charValue"})
    public ValueConverter(final char charValue) {
        this.constructorNumber = ValueConverter.NUMBER_TWO;
    }

    /**
     * This constructor takes double value and assigns "constructorNumber" to 3.
     *
     * @param doubleValue
     *            - a double value
     */
    @SuppressWarnings(value = {"doubleValue"})
    public ValueConverter(final double doubleValue) {
        this.constructorNumber = ValueConverter.NUMBER_THREE;
    }

    /**
     * This constructor takes float value and assigns "constructorNumber" to 4.
     *
     * @param floatValue
     *            - a float value
     */
    @SuppressWarnings(value = {"floatValue"})
    public ValueConverter(final float floatValue) {
        this.constructorNumber = ValueConverter.NUMBER_FOUR;
    }

    /**
     * This constructor takes integer value and assigns "constructorNumber" to 5.
     *
     * @param integerValue
     *            - a integer value
     */
    @SuppressWarnings(value = {"integerValue"})
    public ValueConverter(final int integerValue) {
        this.constructorNumber = ValueConverter.NUMBER_FIVE;
    }

    /**
     * This constructor takes long value and assigns "constructorNumber" to 6.
     *
     * @param longValue
     *            - a long value
     */
    @SuppressWarnings(value = {"longValue"})
    public ValueConverter(final long longValue) {
        this.constructorNumber = ValueConverter.NUMBER_SIX;
    }

    /**
     * This constructor takes short value and assigns "constructorNumber" to 7.
     *
     * @param shortValue
     *            - a short value
     */
    @SuppressWarnings(value = {"shortValue"})
    public ValueConverter(final short shortValue) {
        this.constructorNumber = ValueConverter.NUMBER_SEVEN;
    }

    /**
     * This method relates constructor number with its primitive type name.
     *
     * @return variableType - a String variable, primitive type name.
     */
    public String convertingValueToString() {
        String variableType;
        switch (this.constructorNumber) {
            case ValueConverter.NUMBER_ONE:
                variableType = "Byte";
                break;
            case ValueConverter.NUMBER_TWO:
                variableType = "Char";
                break;
            case ValueConverter.NUMBER_THREE:
                variableType = "Double";
                break;
            case ValueConverter.NUMBER_FOUR:
                variableType = "Float";
                break;
            case ValueConverter.NUMBER_FIVE:
                variableType = "Integer";
                break;
            case ValueConverter.NUMBER_SIX:
                variableType = "Long";
                break;
            case ValueConverter.NUMBER_SEVEN:
                variableType = "Short";
                break;
            default:
                variableType = "Wrong variable type";
                break;
        }
        return variableType;
    }
}
