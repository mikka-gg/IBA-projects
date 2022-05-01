package by.iba.gomel;

/**
 * Stores the shapes in the objects array. Access to the objects in the array provides the getArea
 * method. Also calculates sum of the all shapes in the sumArea method.
 */
public class ShapeController {
    public static final int SHAPES_NUMBER = 5;
    private int             shapesCount;

    private final Shape[]   shapes        = new Shape[ShapeController.SHAPES_NUMBER];

    /**
     * Default constructor
     */
    public ShapeController() {
        this.shapesCount = 0;
    }

    /**
     * Takes the shape and stores it in the array;
     *
     * @param shape
     *            - an object, the shape
     */
    public void addShape(final Shape shape) {
        if (this.shapesCount < this.shapes.length) {
            this.shapes[this.shapesCount] = shape;
            this.shapesCount++;
        }
    }

    /**
     * Takes the shape and using the equals method checks, if there is a similar shape in the array.
     *
     * @param thatShape
     *            - object, shape
     * @return - if true, returns the area of the given shape. If false returns 0.
     */
    public double getArea(final Shape thatShape) {
        for (final Shape shape : this.shapes) {
            if (thatShape.equals(shape)) {
                return thatShape.getArea();
            }
        }
        return 0;
    }

    /**
     * Calculates the sum of the areas of the all objects in the array.
     *
     * @return double, sum of the areas.
     */
    public double sumAreas() {
        double sumOfAreas = 0;
        for (final Shape shape : this.shapes) {
            sumOfAreas += shape.getArea();
        }
        return sumOfAreas;
    }
}
