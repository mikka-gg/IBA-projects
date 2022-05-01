package by.iba.gomel;

import java.security.SecureRandom;

/**
 * Has a randomGenre() method to take a random genre of the given Enum.
 */
public final class GenericsTask3 {
    /**
     * Default constructor.
     */
    private GenericsTask3() {

    }

    /**
     * Takes any Enum that implements the Fiction interface and returns a random genre in the given
     * Enum.
     *
     * @param enumToSearchIn
     *            - Enum to get a genre from.
     * @return - a random genre in the Enum.
     */
    public static <T extends Enum<T> & Fiction> T randomGenre(final Class<T> enumToSearchIn) {
        final T[] genresArray = enumToSearchIn.getEnumConstants();
        return genresArray[new SecureRandom().nextInt(genresArray.length)];
    }
}
