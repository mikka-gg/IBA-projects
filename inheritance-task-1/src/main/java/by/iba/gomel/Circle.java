package by.iba.gomel;

/**
 * Implements the Shape interface. Calculates the area of the circle using radius.
 */
public class Circle implements Shape {
    private final int radius;

    /**
     * Default constructor
     */
    public Circle() {
        this.radius = 0;
    }

    /**
     * Takes the radius of the circle.
     *
     * @param radius
     *            - an integer variable, the radius of the circle.
     */
    public Circle(final int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.sqrt(this.getRadius());
    }

    public int getRadius() {
        return this.radius;
    }
}
