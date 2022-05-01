package by.iba.gomel;

import java.util.Collection;

import by.iba.gomel.predicates.UnaryPredicate;

/**
 * Contains the countElements() method to count odd elements.
 */
public final class GenericsTask1 {

    /**
     * Default constructor.
     */
    private GenericsTask1() {

    }

    /**
     * Checks if the element of the collection is odd, if true - increments the count.
     *
     * @param elements
     *            - collection to check.
     * @param checkPredicate
     *            - implementation of the UnaryPredicate<T> interface.
     * @return number of odd elements.
     */
    public static <T extends Number> int countElements(final Collection<T> elements,
            final UnaryPredicate<T> checkPredicate) {
        int count = 0;
        for (final T element : elements) {
            if (checkPredicate.checkPredicate(element)) {
                count++;
            }
        }
        return count;
    }
}
