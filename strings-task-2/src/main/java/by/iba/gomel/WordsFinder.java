package by.iba.gomel;

/**
 * This class checks if a sentence contains words that are in a given word using the findWords()
 * method.
 */
public class WordsFinder {
    /**
     * Forms an array of words from the sentence and checks if the given word has them, duplicate
     * equals as one match.
     *
     * @param sentence
     *            - a String variable, the sentence that will be checked for words
     * @param givenWord
     *            - a String variable, the word for check
     * @return returns all the words that are in the sentence and the given word. If no such words
     *         exist returns an empty String.
     */
    public String findWords(final String sentence, final String givenWord) {

        final StringBuilder foundWords = new StringBuilder();
        final String[] wordsOfSentence = sentence.split(" ");
        for (final String word : wordsOfSentence) {
            if (givenWord.contains(word) && !foundWords.toString().contains(word)) {
                foundWords.append(' ');
                foundWords.append(word);
            }
        }

        return foundWords.toString();
    }
}
