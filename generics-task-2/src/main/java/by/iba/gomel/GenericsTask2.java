package by.iba.gomel;

import java.util.Collection;

/**
 * Contains the copyCollection() method to copy from one collection to another.
 */
public final class GenericsTask2 {
    /**
     * Default constructor.
     */
    private GenericsTask2() {

    }

    /**
     * Adds all elements from one collection to another.
     *
     * @param copyFrom
     *            - collection to copy from.
     * @param copyTo
     *            - collection to copy to.
     * @return collections with all the elements from the copyFrom collection.
     */
    public static <T extends V, V> Collection<V> copyCollection(final Collection<T> copyFrom,
            final Collection<V> copyTo) {
        copyTo.addAll(copyFrom);
        return copyTo;
    }
}
