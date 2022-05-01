package by.iba.gomel;

/**
 * Bird class.
 */
public class Bird extends AbstractAnimal {

    /**
     * Default constructor.
     *
     * @param name
     *            - bird name.
     * @param size
     *            - bird size.
     *
     * @param colour
     *            - bird colour.
     */
    public Bird(final String name, final int size, final String colour) {
        super(name, size, colour);
    }

    @Override
    public String getInfo() {
        return this.getName() + " " + this.getSize() + " " + this.getColour();
    }
}
