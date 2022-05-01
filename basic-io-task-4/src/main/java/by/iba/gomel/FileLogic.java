package by.iba.gomel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Has methods to create file, fill it with objects and get them.
 */
public final class FileLogic {
    private static final Logger LOG = LoggerFactory.getLogger(FileLogic.class);

    /**
     * Default constructor.
     */
    private FileLogic() {

    }

    /**
     * Creates a file with a given name, returns result.
     *
     * @param fileName
     *            - file name.
     * @return true - file was created.
     * @throws IOException
     *             - IOException.
     */
    public static boolean createFile(final String fileName) throws IOException {
        final File file = new File(fileName);
        return file.createNewFile();
    }

    /**
     * Gets objects from a file to a List and returns it.
     *
     * @param fileName
     *            - file to get objects from.
     * @return - the List of Objects from the file.
     * @throws FileNotFoundException
     *             - FileNotFoundException.
     */
    public static List<Object> getObjectFromFile(final String fileName)
            throws FileNotFoundException {
        final ArrayList<Object> objectsList = new ArrayList<>();
        try (final FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = null;
            while ((obj = ois.readObject()) != null) {
                objectsList.add(obj);
            }
        } catch (final IOException | ClassNotFoundException e) {
            FileLogic.LOG.error("{}", e.getMessage(), e);
        }
        return objectsList;
    }

    /**
     * Stores given List to a given file object by object.
     *
     * @param fileName
     *            - file to store.
     * @param listOfObjects
     *            - the List to store.
     */
    public static <T> void storeObjectToFile(final String fileName, final List<T> listOfObjects) {
        try (final FileOutputStream fos = new FileOutputStream(fileName);
                final ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (int i = 0; i < listOfObjects.size(); i++) {
                oos.writeObject(listOfObjects.get(i));
            }
        } catch (final IOException e) {
            FileLogic.LOG.error("{}", e.getMessage(), e);
        }
    }
}
