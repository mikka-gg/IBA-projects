package by.iba.gomel;

/**
 * Dog
 */
public final class Dog {

    private static final Dog dogOne             = new Dog("spot", "Ruff!");
    private static final Dog dogTwo             = new Dog("scruffy", "Wurf!");
    private static final Dog aReferenceToDogOne = Dog.dogOne;

    private final String     name;
    private final String     says;

    /**
     * Constructor
     *
     * @param name
     *            dog name
     * @param says
     *            dog says
     */
    public Dog(final String name, final String says) {
        this.name = name;
        this.says = says;
    }

    /**
     * comparingObjectsUsingEqOperator
     *
     * @return dogOne == dogTwo
     */
    public static boolean comparingObjectsUsingEqOperator() {
        return Dog.dogOne == Dog.dogTwo;
    }

    /**
     * comparingObjectsUsingEquals
     *
     * @return dogOne.equals(dogTwo)
     */
    public static boolean comparingObjectsUsingEquals() {
        return Dog.dogOne.equals(Dog.dogTwo);
    }

    /**
     * comparingReferenceUsingEqOperator
     *
     * @return dogOne == aReferenceToDogOne
     */
    public static boolean comparingReferenceUsingEqOperator() {
        return Dog.dogOne == Dog.aReferenceToDogOne;
    }

    /**
     * comparingReferenceUsingEquals
     *
     * @return dogOne.equals(aReferenceToDogOne)
     */
    public static boolean comparingReferenceUsingEquals() {
        return Dog.dogOne.equals(Dog.aReferenceToDogOne);
    }

    /**
     * getName
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * getSays
     *
     * @return says
     */
    public String getSays() {
        return this.says;
    }

}
