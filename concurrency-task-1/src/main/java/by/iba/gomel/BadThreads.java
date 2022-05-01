package by.iba.gomel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class always should print "Mares do eat oats.".
 */
public class BadThreads {
    private static String       message;
    private static final Logger LOG   = LoggerFactory.getLogger(BadThreads.class);
    private static final int    SEC_1 = 1000;
    private static final int    SEC_2 = 2000;

    /**
     * Main method, calls the run() method of Thread class, and changes variable message to "Mares
     * do not eat oats.".
     *
     * @param args
     *            - args.
     * @throws InterruptedException
     *             - InterruptedException.
     */
    public static void main(final String[] args) {
        (new CorrectorThread()).start();
        BadThreads.changeMessage("Mares do not eat oats.");
        try {
            Thread.sleep(BadThreads.SEC_2);
        } catch (final InterruptedException e) {
            BadThreads.LOG.error("{}", e.getMessage(), e);
            Thread.currentThread().interrupt();
        }
        // Key statement 2:
        BadThreads.LOG.info(BadThreads.message);
    }

    /**
     * The synchronized method to change the message variable.
     *
     * @param message
     *            - new String for the message variable.
     */
    private static void changeMessage(final String message) {
        synchronized (BadThreads.class) {
            BadThreads.message = message;
        }
    }

    /**
     * Changes the message variable.
     */
    private static class CorrectorThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(BadThreads.SEC_1);
            } catch (final InterruptedException e) {
                BadThreads.LOG.error("{}", e.getMessage(), e);
                Thread.currentThread().interrupt();
            }
            // Key statement 1:
            BadThreads.changeMessage("Mares do eat oats.");
        }
    }
}
