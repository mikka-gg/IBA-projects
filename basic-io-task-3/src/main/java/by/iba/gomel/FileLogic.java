package by.iba.gomel;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides methods to work with files.
 */
public final class FileLogic {
    private static final Logger LOG     = LoggerFactory.getLogger(FileLogic.class);
    public static final Scanner SCANNER = new Scanner(System.in, "UTF-8");

    /**
     * Default constructor.
     */
    private FileLogic() {

    }

    /**
     * Creates a file with a typed in name, if the file creation was successful - invokes a
     * fillFile() method.
     *
     * @throws IOException
     *             - IOException.
     */
    public static void createFile() throws IOException {
        FileLogic.LOG.info("Type in file name to create:");
        final String fileName = FileLogic.SCANNER.next();
        FileLogic.LOG.info("{}", fileName);
        final File file = new File(fileName);
        if (file.createNewFile()) {
            FileLogic.LOG.info("{} is created.", fileName);
            FileLogic.fillFile(file);
        } else {
            FileLogic.LOG.info("{} is not created.", fileName);
        }
    }

    /**
     * Deletes a file with a typed in name, asks user if he is sure, if yes - deletes file.
     *
     * @throws IOException
     *             - IOException.
     */
    public static void deleteFile() throws IOException {
        FileLogic.LOG.info("Type in file name to delete:");
        final String fileName = FileLogic.SCANNER.next();
        final Path file = Paths.get(fileName);
        FileLogic.LOG.info("{}", fileName);
        FileLogic.LOG.info("Are you sure? [y/n]");
        final String answer = FileLogic.SCANNER.next();
        FileLogic.LOG.info("{}", answer);
        if ("y".equals(answer)) {
            if (Files.deleteIfExists(file)) {
                FileLogic.LOG.info("{} is deleted.", fileName);
            } else {
                FileLogic.LOG.info("{} is not deleted.", fileName);
            }
        }
    }

    /**
     * Views a content of a file with a typed in name line by line.
     */
    public static void viewFile() {
        FileLogic.LOG.info("Type in file name to view:");
        final String fileName = FileLogic.SCANNER.next();
        FileLogic.LOG.info("{}", fileName);
        String line = null;
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            FileLogic.LOG.info("The content of the {} is:", fileName);
            while ((line = raf.readLine()) != null) {
                FileLogic.LOG.info(line);
            }
        } catch (final IOException e) {
            FileLogic.LOG.error(e.getMessage(), e);
        }
    }

    /**
     * Fills the file with a content.
     *
     * @param file
     *            - the file to fill.
     */
    private static void fillFile(final File file) {
        FileLogic.LOG.info("Type in content:");
        FileLogic.SCANNER.nextLine();
        final String line = FileLogic.SCANNER.nextLine();
        FileLogic.LOG.info("{}", line);
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.writeUTF(line);
        } catch (final IOException e) {
            FileLogic.LOG.error(e.getMessage(), e);
        }
    }
}
