package by.iba.gomel;

/**
 * "StatementsTaskFour" is a class contains "removeEvenDigits" which takes number, checks for even
 * digits and removes, and returns a number without even digits.
 */
public class StatementsTaskFour {
    private static final int TEN     = 10;
    private static final int TWO     = 2;
    private int              counter = 1;
    private int              finalNumber;
    private int              answer;

    /**
     * "StatementsTaskFour" is a constructor for "StatementsTaskFour" class.
     *
     * @param finalNumber
     *            - an integer variable
     * @param answer
     *            - an integer variable
     */
    public StatementsTaskFour(final int finalNumber, final int answer) {
        this.finalNumber = finalNumber;
        this.answer = answer;
    }

    /**
     * "removeEvenDigits" method takes a number, checks and removes even digits.
     *
     * @param number
     *            - an integer variable
     * @return finalNumber - an integer variable
     */
    public int removeEvenDigits(int number) {
        int digit;

        if (number > 0) {
            digit = number % StatementsTaskFour.TEN;
            number /= StatementsTaskFour.TEN;
            if ((digit % StatementsTaskFour.TWO) == 0) {
                this.removeEvenDigits(number);
            } else if ((digit % StatementsTaskFour.TWO) != 0) {
                this.finalNumber += (digit * this.counter);
                this.counter *= StatementsTaskFour.TEN;
                this.removeEvenDigits(number);
            }
        } else if (number <= 0) {
            this.counter = 1;
            this.answer = this.finalNumber;
            this.finalNumber = 0;
        }

        return this.answer;
    }
}
