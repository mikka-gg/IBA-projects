package by.iba.gomel;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class has a userInput() method to interact with a user, menuOptions() method to relate user
 * choice with the file logic, printMenu() method to print the menu options.
 */
public class UserInputContoller {
    private static final Logger LOG          = LoggerFactory.getLogger(UserInputContoller.class);
    private static final int    NUMBER_ONE   = 1;
    private static final int    NUMBER_TWO   = 2;
    private static final int    NUMBER_THREE = 3;
    private static final int    NUMBER_FOUR  = 4;

    /**
     * Relates user choice with the FileLogic methods.
     *
     * @param option
     *            - number of option to invoke.
     * @throws IOException
     *             - IOException.
     */
    private static int menuOptions(final int option) throws IOException {
        switch (option) {
            case NUMBER_ONE:
                UserInputContoller.LOG.info("1 - Create file");
                FileLogic.createFile();
                break;
            case NUMBER_TWO:
                UserInputContoller.LOG.info("2 - Delete file");
                FileLogic.deleteFile();
                break;
            case NUMBER_THREE:
                UserInputContoller.LOG.info("3 - View file");
                FileLogic.viewFile();
                break;
            case NUMBER_FOUR:
                UserInputContoller.LOG.info("4 - Exit.");
                return UserInputContoller.NUMBER_FOUR;
            default:
                UserInputContoller.LOG.info("Wrong number, try 1 to 4");
                return 0;
        }
        return 0;
    }

    /**
     * Prints to console the menu.
     *
     * @param options
     *            - an array with options.
     */
    private static void printMenu(final String[] options) {
        UserInputContoller.LOG.info("---------MENU---------");
        for (final String option : options) {
            UserInputContoller.LOG.info(option);
        }
        UserInputContoller.LOG.info("Choose your option : ");
    }

    /**
     * Shows to a user menu, waits for info from the user, sends user choice to the menuOptions()
     * method.
     *
     * @throws IOException
     *             - IOException.
     */
    public void userInputContoller() throws IOException {
        final String[] options = {"1 - Create file", "2 - Delete file", "3 - View file",
                "4 - Exit"};

        int option = 0;
        while (option != UserInputContoller.NUMBER_FOUR) {
            UserInputContoller.printMenu(options);
            option = FileLogic.SCANNER.nextInt();
            option = UserInputContoller.menuOptions(option);
        }
    }
}
