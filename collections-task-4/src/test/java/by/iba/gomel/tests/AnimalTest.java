package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.iba.gomel.AbstractAnimal;
import by.iba.gomel.AnimalLogic;
import by.iba.gomel.Bird;
import by.iba.gomel.Cat;
import by.iba.gomel.Fish;

public class AnimalTest {
    private final static List<AbstractAnimal> animals = new ArrayList<>();

    @Before
    public void fillList() {
        final Cat cat = new Cat("Barsik", 10, "Red");
        final Fish fish = new Fish("Guppi", 1, "Yellow");
        final Bird bird = new Bird("Kesha", 2, "Green");

        AnimalTest.animals.clear();
        AnimalTest.animals.add(cat);
        AnimalTest.animals.add(fish);
        AnimalTest.animals.add(bird);
    }

    @Test
    public void testBinarySearchBySize() {
        Assert.assertEquals("Should return Kesha 2 Green", "Kesha 2 Green",
                AnimalTest.animals.get(
                        AnimalLogic.binarySearchBySize(AnimalTest.animals, new Bird(null, 2, null)))
                        .toString());
    }

    @Test
    public void testRemoveByColour() {
        Assert.assertEquals("Should remove an yellow animal", "[Barsik 10 Red, Kesha 2 Green]",
                AnimalLogic.removeByColour(AnimalTest.animals, "Yellow").toString());
    }

    @Test
    public void testSortBySize() {
        Assert.assertEquals("Should sort by ascending size",
                "[Guppi 1 Yellow, Kesha 2 Green, Barsik 10 Red]",
                AnimalLogic.sortBySizeAscending(AnimalTest.animals).toString());
    }
}
