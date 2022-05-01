package by.iba.gomel;

/**
 * This class represents a point with x and y coordinates.
 */
public class Point {
    private int x;
    private int y;

    /**
     * Default constructor to set a point.
     *
     * @param x
     *            - x.
     * @param y
     *            - y.
     */
    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return this.x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return this.y;
    }

    /**
     * @param x
     *            the x to set
     */
    public void setX(final int x) {
        this.x = x;
    }

    /**
     * @param y
     *            the y to set
     */
    public void setY(final int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + this.x + ", " + this.y + "]";
    }
}
