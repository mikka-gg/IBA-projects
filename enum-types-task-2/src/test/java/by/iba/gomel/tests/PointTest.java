package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Movement;
import by.iba.gomel.Point;

public class PointTest {

    @Test
    public void testMovePoint() {
        final Point point = new Point(0, 0);

        Movement.RIGHT.move(point, 4);
        Assert.assertEquals("The point should be moved by 4 to the right on the x ordinate",
                "[4, 0]", point.toString());

        Movement.DOWN.move(point, 13);
        Movement.LEFT.move(point, 5);
        Assert.assertEquals(
                "The point should be moved by 5 to the left on the x ordinate and by 13 down on the y ordinate",
                "[-1, -13]", point.toString());

        Movement.UP.move(point, 3);
        Assert.assertEquals("The point should be moved by 3 up on the y ordinate", "[-1, -10]",
                point.toString());
    }

}
