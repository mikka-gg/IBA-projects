package by.iba.gomel;

/**
 * This class contains the static checkPasswordStrength() method to check if a password is strong
 * enough.
 */
public final class WrappersTask4 {
    private static final int ZERO  = 0;
    private static final int SEVEN = 7;

    /**
     * Private constructor.
     */
    private WrappersTask4() {

    }

    /**
     * Takes a password, counts how many digits, upper and lower case letters it contains. If the
     * password length is more than 7 and the password has at least 1 digit, upper and lower case
     * letters - the password is strong, returns true.
     *
     * @param password
     *            - a password to check
     * @return true - a password is more than 7 and the password has at least 1 digit, upper and
     *         lower case letters, false - otherwise.
     */
    public static boolean checkPasswordStrength(final String password) {
        int numberOfLC = 0;
        int numberOfUC = 0;
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            } else if (Character.isLowerCase(password.charAt(i))) {
                numberOfLC++;
            } else if (Character.isUpperCase(password.charAt(i))) {
                numberOfUC++;
            }
        }
        return ((password.length() > WrappersTask4.SEVEN) && (numberOfLC > WrappersTask4.ZERO)
                && (numberOfUC > WrappersTask4.ZERO) && (numberOfDigits > WrappersTask4.ZERO));
    }
}
