package by.iba.gomel;

import java.lang.annotation.Documented;

/**
 * The annotation type for an enhancement request.
 */
@Documented
public @interface ClassPreamble {

    /**
     * Enhancement request date.
     *
     * @return date, default value - unknown
     */
    String date() default "unknown";

    /**
     * Engineer name.
     *
     * @return - name, default value - unassigned
     */
    String engineer() default "unassigned";

    /**
     * Enhancement request ID.
     *
     * @return id.
     */
    int id();

    /**
     * Enhancement request message.
     *
     * @return - message.
     */
    String synopsis();
}
