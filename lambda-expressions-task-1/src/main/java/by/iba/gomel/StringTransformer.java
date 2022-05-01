package by.iba.gomel;

/**
 * Transforms a String object using the ToLowerCaseTransformer, ToUpperCaseTransformer, SpaceRemover
 * interfaces.
 */
@FunctionalInterface
public interface StringTransformer
        extends ToLowerCaseTransformer, ToUpperCaseTransformer, SpaceRemover {
    /**
     * Transform to upper or lower case, or remove spaces in a String object.
     *
     * @param string
     *            - string.
     * @return transformed string.
     */
    String operateOnString(final String string);
}
