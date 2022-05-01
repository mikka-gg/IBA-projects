/*
 * Локальную переменную нельзя не иициализироввать, иначе ошибка компиляции. Не инициализированная
 * переменная класса хранит дефольное значение.
 */

package by.iba.gomel;

/**
 * Practicing variables initialization
 */
public class VariablesPractice {

    private static final int    INT_VARIABLE_0  = 83647;

    private static final float  $FLOAT_VARIABLE = 30.210F;

    private static short        _shortVariable;

    private static boolean      defaultFalse;

    private static final char   charVariable1   = 'P';

    private static final byte   $byteVariable   = 127;

    private static final long   longVariable    = 941_230_854_775_807L;

    private static final double doubleVariable  = 301.210;

    private static final String text            = "String Variable";

    VariablesPractice() {

    }

    /**
     * returnsBoolean
     *
     * @return doc
     */
    public static boolean returnsBoolean() {
        return VariablesPractice.defaultFalse;
    }

    /**
     * returnsByte
     *
     * @return doc
     */
    public static byte returnsByte() {
        return VariablesPractice.$byteVariable;
    }

    /**
     * returnsChar
     *
     * @return doc
     */
    public static char returnsChar() {
        return VariablesPractice.charVariable1;
    }

    /**
     * returnsDouble
     *
     * @return doc
     */
    public static double returnsDouble() {
        return VariablesPractice.doubleVariable;
    }

    /**
     * returnsFloatFinal
     *
     * @return doc
     */
    public static float returnsFloatFinal() {
        return VariablesPractice.$FLOAT_VARIABLE;
    }

    /**
     * returnsInt
     *
     * @return doc
     */
    public static int returnsInt() {
        final int intVar = 0;
        return intVar;
    }

    /**
     * returnsIntFinal
     *
     * @return doc
     */
    public static int returnsIntFinal() {
        return VariablesPractice.INT_VARIABLE_0;
    }

    /**
     * returnsLong
     *
     * @return doc
     */
    public static long returnsLong() {
        return VariablesPractice.longVariable;
    }

    /**
     * returnsShort
     *
     * @return doc
     */
    public static short returnsShort() {
        return VariablesPractice._shortVariable;
    }

    /**
     * returnsString
     *
     * @return doc
     */
    public static String returnsString() {
        return VariablesPractice.text;
    }
}
