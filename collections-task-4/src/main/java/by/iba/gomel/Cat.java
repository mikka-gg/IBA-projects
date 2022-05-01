package by.iba.gomel;

/**
 * Cat class.
 */
public class Cat extends AbstractAnimal {

    /**
     * Default constructor.
     *
     * @param name
     *            - cat name.
     * @param size
     *            - cat size.
     *
     * @param colour
     *            - cat colour.
     */
    public Cat(final String name, final int size, final String colour) {
        super(name, size, colour);
    }

    @Override
    public String getInfo() {
        return this.getName() + " " + this.getSize() + " " + this.getColour();
    }
}
