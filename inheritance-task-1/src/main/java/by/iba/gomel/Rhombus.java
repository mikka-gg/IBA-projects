package by.iba.gomel;

/**
 * Extends the AbstractRectangle class. Calculates the area of a rhombus using height and width, and
 * can checks if two rhombus are equal.
 */
public class Rhombus extends AbstractRectangle {
    public static final int PRIME_RHOMBUS = 7;
    private final int       width;

    /**
     * Default constructor
     */
    public Rhombus() {
        super(0);
        this.width = 0;
    }

    /**
     * Takes height and width of the rhombus.
     *
     * @param height
     *            - integer variable, height of the rhombus
     * @param width
     *            - integer variable, width of the rhombus
     */
    public Rhombus(final int height, final int width) {
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
        final Rhombus other = (Rhombus) obj;
        return (this.getHeight() == other.getHeight()) && (this.getWidth() == other.getWidth());
    }

    @Override
    public double getArea() {
        return (double) this.getHeight() * this.getWidth();
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = (Rhombus.PRIME_RHOMBUS * result) + this.getHeight();
        result = (Rhombus.PRIME_RHOMBUS * result) + this.getWidth();
        return result;

    }

    @Override
    public String toString() {
        return "Area of the rhombus = " + this.getArea();

    }
}
