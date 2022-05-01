package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Circle;
import by.iba.gomel.Rhombus;
import by.iba.gomel.Shape;
import by.iba.gomel.ShapeController;
import by.iba.gomel.Square;

/**
 * This test creates 1 circle, 2 squares and 2 rhombus. The testGetArea method checks returning
 * areas, the testSumAreas method checks, if the sum is calculated correctly, while one object is
 * empty.
 */
public class ShapeControllerTest {
    final ShapeController shape    = new ShapeController();
    final Shape           circle   = new Circle(1);
    final Shape           square1  = new Square(2, 2);
    final Shape           square2  = new Square(2, 2);
    final Shape           rhombus1 = new Rhombus(2, 2);
    final Shape           rhombus2 = new Rhombus(2, 2);

    /**
     * Adds the objects to the array and checks if the returning area is correct.
     */
    @Test
    public void testGetArea() {
        this.shape.addShape(this.square1);
        this.shape.addShape(this.circle);
        this.shape.addShape(this.square2);
        this.shape.addShape(this.rhombus1);
        this.shape.addShape(this.rhombus2);

        Assert.assertEquals("The returnig area should be 4", 4, this.shape.getArea(this.square2),
                0);
        Assert.assertEquals("The returnig area should be 3.14", 3.14,
                this.shape.getArea(this.circle), 0.01);
        Assert.assertEquals("The returnig area should be 4", 4, this.shape.getArea(this.rhombus1),
                0);
    }

    /**
     * Adds the objects to the array, one object is empty, and checks if the sum of the all areas is
     * correct.
     */
    @Test
    public void testSumAreas() {
        final Shape square1 = new Square();

        this.shape.addShape(square1);
        this.shape.addShape(this.circle);
        this.shape.addShape(this.square2);
        this.shape.addShape(this.rhombus1);
        this.shape.addShape(this.rhombus2);

        Assert.assertEquals("The returnig sum of the areas should be 15.14", 15.14,
                this.shape.sumAreas(), 0.01);
    }
}
