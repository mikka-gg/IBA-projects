package by.iba.gomel;

import java.util.List;
import java.util.Optional;

/**
 * Contains a transformToNum() method to transform a list of digits to a number.
 */
public class AggregateOperationsTask1 {
    /**
     * Takes a List of Integers and using the Stream API converts digits to the number.
     *
     * @param integers
     *            - List of Integers.
     * @return the number
     */
    public Integer transformToNum(final List<Integer> integers) {
        final Optional<String> optValue = integers.stream().filter(x -> x > 0).map(String::valueOf)
                .reduce(String::concat);
        if (optValue.isPresent()) {
            return Integer.parseInt(optValue.get());
        }
        return null;
    }
}
