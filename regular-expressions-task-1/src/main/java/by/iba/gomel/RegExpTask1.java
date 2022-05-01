package by.iba.gomel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Contains the matchName() method to check for the right full name pattern and the
 * checkNamesLength() method to check if the length of the first name and last name is the same.
 */
public class RegExpTask1 {

    /**
     * Takes a full name, splits it by a whitespace and checks if the length of the first and last
     * name is the same.
     *
     * @param fullName
     *            - full name.
     * @return true - same length, false - the length differs.
     */
    private static boolean checkNamesLength(final String fullName) {
        final Pattern pattern = Pattern.compile("\\s");
        final String[] names = pattern.split(fullName);
        return names[0].length() == names[1].length();

    }

    /**
     * Takes a full name and checks if the full name matches a 'Aa Aa' pattern. Also checks if the
     * first and last names are the same length.
     *
     * @param fullName
     *            - full name.
     * @return true - the full name matches the pattern and the first and last names are the same
     *         length, false otherwise.
     */
    public boolean matchName(final String fullName) {
        final Pattern pattern = Pattern.compile("^[A-Z][a-z]+\\s[A-Z][a-z]+$");
        final Matcher matcher = pattern.matcher(fullName);
        return matcher.matches() && RegExpTask1.checkNamesLength(fullName);
    }
}
