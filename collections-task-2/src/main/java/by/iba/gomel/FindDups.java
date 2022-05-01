package by.iba.gomel;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Contains a setSortedSet() method to convert an array to a SortedSet and sort it case insensitive,
 * and getSetSize() method to get size of a Set.
 */
public class FindDups {

    /**
     * Returns Set size.
     *
     * @param set
     *            - Set.
     * @return Set size.
     */
    public int getSetSize(final Set<String> set) {
        return set.size();
    }

    /**
     * Takes an array and converts it into SortedSet with case insensitive Comparator.
     *
     * @param args
     *            - an array to convert.
     * @return SortedSet
     */
    public SortedSet<String> setSortedSet(final String[] args) {
        final Comparator<String> c = String.CASE_INSENSITIVE_ORDER;
        final SortedSet<String> s = new TreeSet<>(c);
        Collections.addAll(s, args);
        return s;
    }
}
