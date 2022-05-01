package by.iba.gomel;

/**
 * Fish class.
 */
public class Fish extends AbstractAnimal {
    /**
     * Default constructor.
     *
     * @param name
     *            - fish name.
     * @param size
     *            - fish size.
     *
     * @param colour
     *            - fish colour.
     */
    public Fish(final String name, final int size, final String colour) {
        super(name, size, colour);
    }

    @Override
    public String getInfo() {
        return this.getName() + " " + this.getSize() + " " + this.getColour();
    }

}
