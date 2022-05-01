package by.iba.gomel.predicates;

/**
 * Has the checkPredicate() method.
 *
 * @param <T>
 *            - should be a subclass of the Number.
 */
public interface UnaryPredicate<T> {

    /**
     * Checks a t element to match some condition, returns a boolean result.
     *
     * @param t
     *            - element to check.
     * @return boolean result of check.
     */
    boolean checkPredicate(T t);
}
