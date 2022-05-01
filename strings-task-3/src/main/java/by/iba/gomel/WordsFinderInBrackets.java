package by.iba.gomel;

/**
 * This class finds text between [] {} () brackets until there is no text in the brackets, using the
 * findWords() method.
 */
public class WordsFinderInBrackets {
    public static final int NUMBER_ZERO = 0;

    /**
     * Returns true if a character is the closing bracket
     *
     * @param character
     *            - a char variable, the character to check
     * @return - true if the character is the closing bracket, false otherwise
     */
    private static boolean closingBracketsingBrackets(final char character) {
        return (character == '}') || (character == ')') || (character == ']');
    }

    /**
     * Finds a number of the brackets of the sequence of words.
     *
     * @param sequenceOfWords
     *            - a String variable, the sequence of words.
     * @return an integer variable, number of the brackets in the sequence
     */
    private static int countBrackets(final String sequenceOfWords) {
        int bracketsCounter = 0;

        final String[] openBracketsArray = {"(", "{", "["};
        for (final String openBracket : openBracketsArray) {
            if (sequenceOfWords.contains(openBracket)) {
                bracketsCounter++;
                break;
            }
        }

        final String[] closeBracketsArray = {")", "}", "]"};
        for (final String closeBracket : closeBracketsArray) {
            if (sequenceOfWords.contains(closeBracket)) {
                bracketsCounter++;
                break;
            }
        }
        return bracketsCounter;
    }

    /**
     * Finds a closing bracket in the sequence. First iteration starts from the last symbol, then
     * from the last found bracket.
     *
     * @param sequenceOfWords
     *            - a String variable, the sequence of words.
     * @param openBracketIndex
     *            - an integer variable, the index of the opening bracket (0 by default)
     * @param closeBracketIndex-
     *            an integer variable, the index of the closing bracket (a length of the sequence by
     *            default)
     * @param start
     *            - a boolean variable, true - first iteration
     * @return an index of the first found closing bracket.
     */
    private static int findClosingBracketIndex(final String sequenceOfWords,
            final int openBracketIndex, int closeBracketIndex, final boolean start) {
        if (start) {
            for (int i = sequenceOfWords.length(); i > openBracketIndex; i--) {
                final char character = sequenceOfWords.charAt(i - 1);
                if (WordsFinderInBrackets.closingBracketsingBrackets(character)) {
                    closeBracketIndex = i;
                    break;
                }
            }
        } else {
            for (int i = closeBracketIndex; i > openBracketIndex; i--) {
                final char character = sequenceOfWords.charAt(i - 1);
                if ((i != closeBracketIndex)
                        && WordsFinderInBrackets.closingBracketsingBrackets(character)) {
                    closeBracketIndex = i;
                    break;
                }
            }
        }

        return closeBracketIndex;
    }

    /**
     * Finds an opening bracket in the sequence. First iteration starts from the 0 index, then from
     * the last found bracket.
     *
     * @param sequenceOfWords
     *            - a String variable, the sequence of words.
     * @param openBracketIndex
     *            - an integer variable, the index of the opening bracket (0 by default)
     * @param closeBracketIndex-
     *            an integer variable, the index of the closing bracket (a length of the sequence by
     *            default)
     * @param start
     *            - a boolean variable, true - first iteration
     * @return an index of the first found opening bracket
     */
    private static int findOpeningBracketIndex(final String sequenceOfWords, int openBracketIndex,
            final int closeBracketIndex, final boolean start) {
        if (start) {
            for (int i = 0; i < closeBracketIndex; i++) {
                final char character = sequenceOfWords.charAt(i);
                if (WordsFinderInBrackets.openingBracketsingBrackets(character)) {
                    openBracketIndex = i;
                    break;
                }
            }
        } else {
            for (int i = openBracketIndex + 1; i < closeBracketIndex; i++) {
                final char character = sequenceOfWords.charAt(i);
                if ((i != WordsFinderInBrackets.NUMBER_ZERO)
                        && WordsFinderInBrackets.openingBracketsingBrackets(character)) {
                    openBracketIndex = i;
                    break;
                }
            }
        }
        return openBracketIndex;
    }

    /**
     * Returns true if a character is the opening bracket
     *
     * @param character
     *            - a char variable, the character to check
     * @return - true if the character is the opening bracket, false otherwise
     */
    private static boolean openingBracketsingBrackets(final char character) {
        return (character == '(') || (character == '{') || (character == '[');
    }

    /**
     * Takes the sequence of words and checks if the sequence has the brackets by counting them. If
     * the number of brackets is higher than 0 - finds indexes of the first opening and the first
     * closing brackets and then using the StringBuilder forms a new subString with the indexes.
     * After the first iteration start variable become false. When all the content between the
     * brackets is found - the method returns a String value.
     *
     * @param sequenceOfWords
     *            - a String variable, the sequence of words.
     * @return a String variable, all the content between the brackets
     */
    public String findWords(final String sequenceOfWords) {
        boolean start = true;
        int numberOfBrackets = WordsFinderInBrackets.countBrackets(sequenceOfWords);
        int openBracketIndex = 0;
        int closeBracketIndex = sequenceOfWords.length();

        final StringBuilder sb = new StringBuilder();
        while (numberOfBrackets > WordsFinderInBrackets.NUMBER_ZERO) {
            openBracketIndex = WordsFinderInBrackets.findOpeningBracketIndex(sequenceOfWords,
                    openBracketIndex, closeBracketIndex, start);
            closeBracketIndex = WordsFinderInBrackets.findClosingBracketIndex(sequenceOfWords,
                    openBracketIndex, closeBracketIndex, start);

            sb.append(sequenceOfWords.substring(openBracketIndex + 1, closeBracketIndex - 1));
            sb.append("; ");
            numberOfBrackets--;
            start = false;
        }
        return sb.toString();
    }
}
