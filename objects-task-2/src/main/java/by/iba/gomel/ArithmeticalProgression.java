package by.iba.gomel;

/**
 * This class creates an arithmetic progression(AP) with given number of elements, step and first
 * element. Each object of AP contains total number created elements, its own value, first element,
 * last element, step, total sum of elements.
 */
public class ArithmeticalProgression {
    private ArithmeticalProgression[] array;
    private int                       numberOfElements;
    private int                       step;
    private int                       firstElement;
    private int                       lastElement;
    private int                       sumOfElements;
    private int                       value;

    /**
     * This is a constructor with default values.
     */
    public ArithmeticalProgression() {
        this.numberOfElements = 0;
        this.array = new ArithmeticalProgression[this.numberOfElements];
        this.step = 0;
        this.firstElement = 0;
        this.lastElement = 0;
        this.sumOfElements = 0;
        this.value = 0;

    }

    /**
     * This method takes values to store them in the object and return the object.
     *
     * @param numberOfElements
     *            - the total number of terms in the AP
     * @param step
     *            - the step between terms in the AP
     * @param firstElement
     *            - the first term in the AP
     * @param value
     *            - the value of the term in the AP
     * @param sumOfElements
     *            - the total sum of the terms in the AP
     * @param lastElement
     *            - the last term in the AP
     * @return an object with all values stored
     */
    private static ArithmeticalProgression setFields(final int numberOfElements, final int step,
            final int firstElement, final int value, final int sumOfElements,
            final int lastElement) {
        final ArithmeticalProgression nTerm = new ArithmeticalProgression();
        nTerm.setNumberOfElements(numberOfElements);
        nTerm.setStep(step);
        nTerm.setFirstElement(firstElement);
        nTerm.setSumOfElements(sumOfElements);
        nTerm.setValue(value);
        nTerm.setLastElement(lastElement);
        return nTerm;
    }

    /**
     * This method takes number of elements, step and first element in order to create an AP. Also
     * it counts the total sum of elements, n-th element and last element. In order to create an
     * array of objects, it gives to the 'setFields' method all values and set returned object in
     * array.
     *
     * @param numberOfElements
     *            - total number of terms in the AP
     * @param step
     *            - step between terms in the AP
     * @param firstElement
     *            - first term in the AP
     */
    public void calculatingAP(final int numberOfElements, final int step, final int firstElement) {
        this.array = new ArithmeticalProgression[numberOfElements];
        int lastTerm;
        // Sum of all elements in the AP
        final int sumOfTerms = (numberOfElements / 2)
                * ((2 * firstElement) + ((numberOfElements - 1) * step));

        for (int termPosition = 1; termPosition <= numberOfElements; termPosition++) {
            // Element in the AP
            final int term = firstElement + ((termPosition - 1) * step);
            // Last element
            lastTerm = term;
            this.array[termPosition - 1] = ArithmeticalProgression.setFields(numberOfElements, step,
                    firstElement, term, sumOfTerms, lastTerm);

        }
    }

    /**
     * This is a getter for the first term in the AP
     *
     * @param givenPosition
     *            - position of a term
     * @return the first term in the AP
     */
    public int getObjectsFirstElement(final int givenPosition) {
        return this.array[givenPosition - 1].getFirstElement();
    }

    /**
     * This is a getter for the last term in the AP
     *
     * @param givenPosition
     *            - position of a term
     * @return the last term in the AP
     */
    public int getObjectsLastElement(final int givenPosition) {
        return this.array[givenPosition - 1].getLastElement();
    }

    /**
     * This is a getter for the total number of terms in the AP
     *
     * @param givenPosition
     *            - position of a term
     * @return the total number of term in the AP
     */
    public int getObjectsNumberOfElements(final int givenPosition) {
        return this.array[givenPosition - 1].getNumberOfElements();
    }

    /**
     * This is a getter for the step in the AP
     *
     * @param givenPosition
     *            - position of a term
     * @return step in the AP
     */
    public int getObjectsStep(final int givenPosition) {
        return this.array[givenPosition - 1].getStep();
    }

    /**
     * This is a getter for the total sum of terms in the AP
     *
     * @param givenPosition
     *            - position of a term
     * @return the total sum of term in the AP
     */
    public int getObjectsSumOfElements(final int givenPosition) {
        return this.array[givenPosition - 1].getSumOfElements();
    }

    /**
     * This is a getter for the value of the term in the AP
     *
     * @param givenPosition
     *            - position of a term
     * @return the value of the term in the AP
     */
    public int getObjectsValue(final int givenPosition) {
        return this.array[givenPosition - 1].getValue();
    }

    /**
     * This is a getter for 'firstElement'
     *
     * @return the firstElement
     */
    private int getFirstElement() {
        return this.firstElement;
    }

    /**
     * This is a getter for 'lastElement'
     *
     * @return the lastElement
     */
    private int getLastElement() {
        return this.lastElement;
    }

    /**
     * This is a getter for 'numberOfElements'
     *
     * @return the numberOfElements
     */
    private int getNumberOfElements() {
        return this.numberOfElements;
    }

    /**
     * This is a getter for 'step'
     *
     * @return the step
     */
    private int getStep() {
        return this.step;
    }

    /**
     * This is a getter for 'sumOfElements'
     *
     * @return the sumOfElements
     */
    private int getSumOfElements() {
        return this.sumOfElements;
    }

    /**
     * This is a getter for 'value'
     *
     * @return the value
     */
    private int getValue() {
        return this.value;
    }

    /**
     * This is a setter for 'firstElement'
     *
     * @param firstElement
     *            - the firstElement to set
     */
    private void setFirstElement(final int firstElement) {
        this.firstElement = firstElement;
    }

    /**
     * This is a setter for 'lastElement'
     *
     * @param lastElement
     *            - the lastElement to set
     */
    private void setLastElement(final int lastElement) {
        this.lastElement = lastElement;
    }

    /**
     * This is a setter for 'numberOfElements'
     *
     * @param numberOfElements
     *            - the numberOfElements to set
     */
    private void setNumberOfElements(final int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    /**
     * This is a setter for 'step'
     *
     * @param step
     *            - the step to set
     */
    private void setStep(final int step) {
        this.step = step;
    }

    /**
     * This is a setter for 'sumOfElements'
     *
     * @param sumOfElements
     *            - the sumOfElements to set
     */
    private void setSumOfElements(final int sumOfElements) {
        this.sumOfElements = sumOfElements;
    }

    /**
     * This is a setter for 'value'
     *
     * @param value
     *            - the value to set
     */
    private void setValue(final int value) {
        this.value = value;
    }
}
