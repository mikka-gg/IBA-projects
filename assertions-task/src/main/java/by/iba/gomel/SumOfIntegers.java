package by.iba.gomel;

/**
 * Contains a sumInt() method to sum integers using a sumPosInt() method.
 */
public class SumOfIntegers {

    /**
     * Takes a number, checks if it's positive using an assertion. Sums all the positive integers up
     * to the number including the one.
     *
     * @param number
     *            - integer number.
     * @return a sum of integers up to the number including the one.
     */
    private static int sumPosInt(final int number) {
        assert number > 1 : "Negative number " + number;
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            answer += i;
        }
        return answer;
    }

    /**
     * Takes a number and returns a sum of all the positive integers up to the number including the
     * one.
     *
     * @param number
     *            - integer number.
     * @return a sum of positive integers including the number.
     */
    public int sumInt(final int number) {
        return SumOfIntegers.sumPosInt(number);
    }
}
