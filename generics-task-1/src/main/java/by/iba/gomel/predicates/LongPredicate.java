package by.iba.gomel.predicates;

/**
 * Has the checkPredicate() method which checks if a t element of type Long is odd.
 */
public class LongPredicate implements UnaryPredicate<Long> {
    public static final int NUMBER_2 = 2;

    @Override
    public boolean checkPredicate(final Long t) {
        return (t % LongPredicate.NUMBER_2) != 0;
    }

}
