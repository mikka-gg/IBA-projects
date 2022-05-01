package by.iba.gomel;

import java.util.List;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Contains a theLargestNumber() method to find the largest number in a List of Strings.
 */
public class AggregateOperationstTask2 {

    /**
     * Takes a List of Strings, deletes all non digit elements and finds max. Then finds that max
     * value in the original List and returns it.
     *
     * @param list
     *            - the List of Strings.
     * @return the largest number or "No numbers".
     */
    public String theLargestNumber(final List<String> list) {
        final Pattern pattern = Pattern.compile("(\\d+)");
        final OptionalInt tempOpt = list.stream().map(pattern::matcher).filter(Matcher::find)
                .map(m -> Integer.valueOf(m.group(1))).mapToInt(x -> x).max();
        if (tempOpt.isPresent()) {
            final String numberToFind = String.valueOf(tempOpt.getAsInt());
            return list.stream().filter(str -> str.contains(numberToFind)).reduce("",
                    (s, c) -> s + c);
        }
        return "No numbers";
    }
}
