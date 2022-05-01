package by.iba.gomel;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;

/**
 * Repeatable annotation.
 */
@Documented
@Repeatable(Workarounds.class)
public @interface Workaround {
    /**
     * Author.
     *
     * @return Author.
     */
    String author();

    /**
     * Defect number.
     *
     * @return Defect number.
     */
    int defectNumber();

    /**
     * Release number.
     * 
     * @return Release number.
     */
    int releaseNumber();
}
