package by.iba.gomel;

/**
 * Added return to 'testStatic' and 'testDefault', and created a constant in order to return.
 */
public interface InterfA {

    /**
     * Original testStatic method of InterfA
     * 
     * @return returns 1
     */
    static int testStatic() {
        return ErrorFixer.CONST_NUMBER;
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
     * @return returns 1
     */
    default int testDefault() {
        return ErrorFixer.CONST_NUMBER;
    }
}
