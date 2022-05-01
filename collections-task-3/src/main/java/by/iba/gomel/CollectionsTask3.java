package by.iba.gomel;

import java.util.List;

/**
 * Contains a trimElements() method to trim elements in a List.
 */
public class CollectionsTask3 {

    /**
     * Takes a List of String and trims its elements.
     *
     * @param list
     *            - a List of String.
     * @return a List with the trimmed elements.
     */
    public List<String> trimElements(final List<String> list) {
        for (final String el : list) {
            list.set(list.indexOf(el), el.trim());
        }
        return list;
    }
}
