package by.iba.gomel;

import java.util.Collection;

/**
 * Has the firstLastEq() method which checks if the first and last element of the collection is the
 * same.
 */
public final class IntegerFirstLastEq {

    /**
     * Default constructor.
     */
    private IntegerFirstLastEq() {

    }

    /**
     * Takes a collection and checks if the collection is of Integer type - checks first and last
     * element of the collection is the same.
     *
     * @param elements
     *            - a collection to check.
     * @return true - the first and last element is the same, false otherwise.
     */
    public static <T> boolean firstLastEq(final Collection<T> elements) {
        if (elements.iterator().next().getClass() == Integer.class) {
            final Integer[] arr = elements.toArray(new Integer[elements.size()]);
            return arr[0].equals(arr[arr.length - 1]);
        }
        return false;
    }
}
