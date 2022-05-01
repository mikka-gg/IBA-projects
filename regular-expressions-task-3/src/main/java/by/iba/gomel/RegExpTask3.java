package by.iba.gomel;

import java.util.regex.Pattern;

/**
 * This class checks if the ISBN number is correct using the checkIsbn() method.
 */
public class RegExpTask3 {
    private static final int PART_2 = 2;
    private static final int PART_3 = 3;
    private static final int PART_4 = 4;

    /**
     * Checks if the registrant element, the publication element and the check digit are in the
     * correct format.
     *
     * @param isbnParts
     *            - the ISBN number split to parts.
     * @return true - if the all three parts are correct format.
     */
    private static boolean checkFromRegElem(final String[] isbnParts) {
        boolean isbnMatch = false;
        isbnMatch = isbnParts[RegExpTask3.PART_2].matches("[01]?[0-9]{0,3}")
                && isbnParts[RegExpTask3.PART_3].matches("[01]?[0-9]{0,5}")
                && isbnParts[RegExpTask3.PART_4].matches("[0-9]");
        return isbnMatch;
    }

    /**
     * Takes the ISBN number, splits it to 5 parts and checks if each part is in the correct format.
     * The registrant element, the publication element and the check digit are checked using the
     * checkFromRegElem() method.
     *
     * @param isbn
     *            - ISBN number.
     * @return true - if all the parts of the ISBN number are in the correct format, false - if one
     *         of the parts is incorrect.
     */
    public boolean checkIsbn(final String isbn) {
        final Pattern pattern = Pattern.compile("[\\s-]");
        final String[] isbnParts = pattern.split(isbn);
        boolean isbnMatch = false;
        if (isbnParts[0].matches("(978)")) {
            isbnMatch = isbnParts[1]
                    .matches("[0-5]|7|6[01][0-9]|62[01]|8[0-9]|9[0-4]|9[5-8][0-9]|992[6-9]")
                    || (isbnParts[1].matches("999[1-7][0-6]|9990[1-9]")
                            && RegExpTask3.checkFromRegElem(isbnParts));
        } else if (isbnParts[0].matches("(979)")) {
            isbnMatch = isbnParts[1].matches("(10|11|12)")
                    && RegExpTask3.checkFromRegElem(isbnParts);
        }
        return isbnMatch;
    }
}
