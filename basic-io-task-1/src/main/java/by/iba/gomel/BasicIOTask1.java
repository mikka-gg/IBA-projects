package by.iba.gomel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Has a countChar() method to count a character in a file.
 */
public class BasicIOTask1 {

    private static final Logger LOG = LoggerFactory.getLogger(BasicIOTask1.class);

    /**
     * Takes a file and character to find, returns number of characters.
     *
     * @param file
     *            - file to find in.
     * @param charToCount
     *            - character to find.
     * @return number of characters.
     */
    public int countChar(final File file, final char charToCount) {
        try (final RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            int character = 0;
            int charCounter = 0;
            while ((character = raf.read()) != -1) {
                if (character == charToCount) {
                    charCounter++;
                }
            }
            return charCounter;
        } catch (final FileNotFoundException e) {
            BasicIOTask1.LOG.error("File: {} not found.", file.getName(), e);
        } catch (final IOException e) {
            BasicIOTask1.LOG.error(e.getMessage(), e);
        }
        return -1;
    }
}
