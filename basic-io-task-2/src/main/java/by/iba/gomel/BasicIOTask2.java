package by.iba.gomel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Has a readMsg() method to read int with offset from line 0.
 */
public class BasicIOTask2 {
    private final RandomAccessFile raf;

    /**
     * Default constructor.
     *
     * @param file
     *            - file to read from.
     * @throws FileNotFoundException
     *             - file not found.
     */
    public BasicIOTask2(final File file) throws FileNotFoundException {
        this.raf = new RandomAccessFile(file, "r");
    }

    /**
     * Finds offset at 0 line and reads line with the offset.
     *
     * @return - int in the line.
     * @throws IOException
     *             - io exception.
     */
    public int readMsg() throws IOException {
        this.raf.seek(this.raf.readLong());
        return this.raf.readInt();
    }
}
