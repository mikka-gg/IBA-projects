package by.iba.gomel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Has a randomizeArr() method to randomize elements in an array.
 */
public final class CollectionsTask1 {
    /**
     * Default constructor.
     */
    private CollectionsTask1() {

    }

    /**
     * Takes an array, converts it to List, shuffles and returns the shuffled array.
     *
     * @param args
     *            - an array to shuffle.
     * @return the shuffled array.
     */
    public static <T> Object[] randomizeArr(final T[] args) {
        final List<T> list = Arrays.asList(args);
        Collections.shuffle(list);
        return list.toArray();
    }
}
