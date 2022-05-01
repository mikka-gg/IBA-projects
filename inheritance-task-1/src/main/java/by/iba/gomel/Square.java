package by.iba.gomel;

/**
 * Extends the AbstractRectangle class. Calculates the area of the square using the height and
 * width, and can check if two squares are equal.
 */
public class Square extends AbstractRectangle {
    public static final int PRIME_SQUARE = 31;
    private final int       width;

    /**
     * Default constructor
     */
    public Square() {
        super(0);
        this.width = 0;
    }

    /**
     * Takes the height and width of the square.
     *
     * @param height
     *            - an integer variable, the height of the square
     * @param width
     *            - an integer variable, the width of the square
     */
    public Square(final int height, final int width) {
        super(height);
        this.width = width;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Square other = (Square) obj;
        return (this.getHeight() == other.getHeight()) && (this.getWidth() == other.getWidth());
    }

    @Override
    public double getArea() {
        return (double) this.getWidth() * this.getHeight();
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = (Square.PRIME_SQUARE * result) + this.getHeight();
        result = (Square.PRIME_SQUARE * result) + this.getWidth();
        return result;
    }

    @Override
    public String toString() {
        return "Area of the square = " + this.getArea();
    }
}
