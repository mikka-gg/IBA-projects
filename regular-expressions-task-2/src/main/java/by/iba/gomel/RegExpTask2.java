package by.iba.gomel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Contains the checkCarNumber() method to check if a car number has a right pattern.
 */
public class RegExpTask2 {
    /**
     * Checks if the car number matches a 'nnnn AA-C' pattern.
     *
     * nnnn - four digits.
     *
     * AA - two capitalized letters from the following А, В, Е, І, К, М, Н, О, Р, С, Т, Х.
     *
     * C - region code, possible value is from 0 to 7.
     *
     * @param carNumber
     *            - a car number.
     * @return true - the car number matches the pattern, false otherwise.
     */
    public boolean checkCarNumber(final String carNumber) {
        final Pattern pattern = Pattern.compile("^\\d{4}\\s[ABEIKMHOPCTX]{2}-[0-7]{1}$");
        final Matcher matcher = pattern.matcher(carNumber);
        return matcher.matches();
    }
}
