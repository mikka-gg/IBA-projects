package by.iba.gomel;

/**
 * Deprecated annotation.
 */
public final class AnnotationsTaskTwo {
    /**
     * @deprecated deprecated value.
     */
    @Deprecated
    public static final int CONST = 2;

    /**
     * Sonar fix for test coverage.
     *
     * @deprecated deprecated value.
     */
    @Deprecated
    public int getConst() {
        return AnnotationsTaskTwo.CONST;
    }
}
