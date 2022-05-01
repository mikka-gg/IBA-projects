package by.iba.gomel;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Container annotation, that contains a value element with repeating annotation type Workaround.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Workarounds {
    /**
     * Repeating annotation.
     *
     * @return Workaround annotation.
     */
    Workaround[] value();
}
