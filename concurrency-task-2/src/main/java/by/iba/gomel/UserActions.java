package by.iba.gomel;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/**
 * Imitates user input.
 */
public class UserActions {

    /**
     * This method sends data in bytes to the console, thus imitating user input.
     *
     * @param args
     *            - input parameters;
     */
    public static void main(final String[] args) {
        System.setIn(new ByteArrayInputStream("3".getBytes(StandardCharsets.UTF_8)));
        ConcurrencyTask2App.main(new String[] {});
    }
}
