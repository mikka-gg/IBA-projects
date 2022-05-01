package by.iba.gomel.predicates;

/**
 * Has the checkPredicate() method which checks if a t element of type Integer is odd.
 */
public class IntegerPredicate implements UnaryPredicate<Integer> {
    public static final int NUMBER_2 = 2;

    @Override
    public boolean checkPredicate(final Integer t) {
        return (t % IntegerPredicate.NUMBER_2) != 0;
    }

}
