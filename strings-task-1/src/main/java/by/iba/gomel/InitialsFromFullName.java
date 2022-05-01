package by.iba.gomel;

/**
 * This class computes initials from any full name that consists of 2 words (i.e. Adam Sendler).
 * Names should start with an upper case letters, there must be a space between names.
 */
public class InitialsFromFullName {
    public static final int MINUS_ONE = -1;
    public static final int TWO       = 2;

    /**
     * Takes the first name to find an upper case letter and assign it to the initials variable
     * using the append() method.
     *
     * @param firtsName
     *            - a String variable, the first name of the full name.
     * @param initials
     *            - a StringBuilder variable, where to put a first initial.
     */
    private static void getInitialsFirstName(final String firtsName, final StringBuilder initials) {
        for (int i = 0; i < firtsName.length(); i++) {
            final char character = firtsName.charAt(i);
            if (Character.isUpperCase(character)) {
                initials.append(character);
                initials.append('.');
            }
        }
    }

    /**
     * Takes the last name to find an upper case letter and assign it to the initials variable using
     * the append() method.
     *
     * @param firtsName
     *            - a String variable, the last name of the full name.
     * @param initials
     *            - a StringBuilder variable, where to put a second initial.
     */
    private static void getInitialsLastName(final String lastName, final StringBuilder initials) {
        for (int i = 0; i < lastName.length(); i++) {
            final char character = lastName.charAt(i);
            if (Character.isUpperCase(character)) {
                initials.append(character);
                initials.append('.');
            }
        }
    }

    /**
     * This method sums a number of upper case letters.
     *
     * @param fullName
     *            - a String variable, first and last name.
     * @return an integer variable, number of the upper case letters.
     */
    private static int numberOfCapitalizeChars(final String fullName) {
        int numOfCapChars = 0;
        for (int i = 0; i < fullName.length(); i++) {
            final char character = fullName.charAt(i);
            if (Character.isUpperCase(character)) {
                numOfCapChars++;
            }
        }
        return numOfCapChars;
    }

    /**
     * Takes a full name and finds an index of space. If space is found, substrings of the first and
     * last names are created using the substring() method. If number of the upper-case letters
     * equals 2, get initials from the first and last name using the getInitialsFirstName() and
     * getInitialsFirstName() methods. Using the toString() method returns the initials.
     *
     * @param fullName
     *            - a String variable, first and last name.
     * @return by default returns an empty String, if initials were computed - returns the initials.
     */
    public String computeInitials(final String fullName) {
        final StringBuilder initials = new StringBuilder();
        final int indexOfSpace = fullName.indexOf(' ');
        String firstName = "undefined";
        String lastName = "undefined";

        if (indexOfSpace != InitialsFromFullName.MINUS_ONE) {
            firstName = fullName.substring(0, indexOfSpace);
            lastName = fullName.substring(indexOfSpace, fullName.length());
        }

        if (InitialsFromFullName.numberOfCapitalizeChars(fullName) == InitialsFromFullName.TWO) {
            InitialsFromFullName.getInitialsFirstName(firstName, initials);
            InitialsFromFullName.getInitialsLastName(lastName, initials);
        }

        return initials.toString();
    }
}
