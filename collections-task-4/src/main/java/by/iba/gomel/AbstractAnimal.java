package by.iba.gomel;

/**
 * Superclass for Cat, Bird, Fish classes.
 */
public abstract class AbstractAnimal {
    private final String name;
    private final int    size;
    private final String colour;

    /**
     * Default constructor.
     */
    protected AbstractAnimal() {
        this.name = "undefined";
        this.size = 0;
        this.colour = "undefined";
    }

    /**
     * Default constructor.
     */
    protected AbstractAnimal(final String name, final int size, final String colour) {
        this.name = name;
        this.size = size;
        this.colour = colour;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return this.colour;
    }

    public abstract String getInfo();

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSize() + " " + this.getColour();
    }
}
