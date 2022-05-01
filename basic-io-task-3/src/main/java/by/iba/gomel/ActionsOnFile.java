package by.iba.gomel;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Some logic on the file.
 */
public class ActionsOnFile {

    private static final String      FILE_NAME = "File.txt";
    private final UserInputContoller uic       = new UserInputContoller();

    /**
     * Simulates user input. The input is - 1, File.txt, Hello World, 3 File.txt, 2, File.txt, y, 1,
     * File.txt, Abracadabra, 4.
     *
     * Creates file with File.txt name and Hello World content, views its content, then deletes it
     * with confirmation, then creates new file File.txt with Abracadabra content and exits.
     *
     * @throws IOException
     *             - IOException.
     */
    public void createViewExit() throws IOException {

        final String data = "1" + System.lineSeparator() + ActionsOnFile.FILE_NAME
                + System.lineSeparator() + "Hello World" + System.lineSeparator() + "3"
                + System.lineSeparator() + ActionsOnFile.FILE_NAME + System.lineSeparator() + "2"
                + System.lineSeparator() + ActionsOnFile.FILE_NAME + System.lineSeparator() + "y"
                + System.lineSeparator() + "1" + System.lineSeparator() + ActionsOnFile.FILE_NAME
                + System.lineSeparator() + "Abracadabra" + System.lineSeparator() + "4";
        System.setIn(new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8)));
        this.uic.userInputContoller();
    }
}
