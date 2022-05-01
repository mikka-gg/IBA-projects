package by.iba.gomel;

/**
 * The abstract class that implements the Shape and CLoneable interfaces. Contains the getHeight
 * method, that returns the height of the rectangle, and the abstract method getWidth.
 */
public abstract class AbstractRectangle implements Shape, Cloneable {
    private final int height;

    /**
     * Default constructor
     */
    AbstractRectangle() {
        this.height = 0;
    }

    /**
     * Takes the height of the rectangle
     *
     * @param height
     *            - an integer variable, the height of the rectangle
     */
    AbstractRectangle(final int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public abstract int getWidth();
}
