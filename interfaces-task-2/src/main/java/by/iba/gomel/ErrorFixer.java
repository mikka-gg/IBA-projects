package by.iba.gomel;

/**
 * Overrided InterfB.
 */
public class ErrorFixer implements InterfA, InterfB {
    public static final int CONST_NUMBER  = 1;
    public static final int CONST_NUMBER2 = 2;
    public static final int NUMBER_THREE  = 3;
    public static final int NUMBER_FOUR   = 4;

    /**
     * Test method of InterfA and InterfB interfaces
     *
     * @return returns 3, overrided value
     */
    @Override
    public int test() {
        return ErrorFixer.NUMBER_THREE;
    }

    /**
     * Test method of InterfA and InterfB interfaces
     *
     * @return returns 4, overrided value
     */
    @Override
    public int testDefault() {
        return ErrorFixer.NUMBER_FOUR;
    }

    /**
     * Test method of the static method in the InterfA
     *
     * @return returns 1, original value
     */
    public int testStaticA() {
        return InterfA.testStatic();
    }

    /**
     * Test method of the static method in the InterfB
     *
     * @return returns 2, original value
     */
    public int testStaticB() {
        return InterfB.testStatic();
    }
}
