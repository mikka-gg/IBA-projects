package by.iba.gomel;

/**
 * Added return to 'testStatic' and 'testDefault', and created a constant in order to return.
 */
public interface InterfB {

    /**
     * Original testStatic method of InterfA
     *
     * @return returns 2
     */
    static int testStatic() {
        return ErrorFixer.CONST_NUMBER2;
    }

    /**
     * Test method.
     *
     * @return null
     */
    int test();

    /**
     * Original testDefault method of InterfA
     *
     * @return returns 2
     */
    default int testDefault() {
        return ErrorFixer.CONST_NUMBER2;
    }
}
