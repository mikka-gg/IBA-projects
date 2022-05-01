package by.iba.gomel;

/**
 * This class checks if a sequence of chars contains only Latin letters. checkForLatinLetter()
 * method takes the sequence and checks if the letter is Latin using, if not - throws
 * NonLetterException with a problem letter.
 */
public class ExceptionsTask2 {

    /**
     * Takes a sequence of chars and checks if all the chars are Latin letters. If a non Latin
     * letter is found - throws NonLetterException.
     *
     * @param sequenceOfChars
     *            - a char sequence.
     * @return - a boolean expression is used for test only.
     * @throws NonLetterException
     *             - the expression is thrown, if the sequence contains a non Latin letter.
     */
    public boolean checkForLatinLetter(final char[] sequenceOfChars) {
        boolean allLatinLetters = false;
        for (final char charElement : sequenceOfChars) {
            if (((charElement >= 'a') && (charElement <= 'z'))
                    || ((charElement >= 'A') && (charElement <= 'Z'))) {
                allLatinLetters = true;
            } else {
                throw new NonLetterException(
                        "A non latin letter is in the sequence : " + charElement);
            }
        }
        return allLatinLetters;
    }
}
