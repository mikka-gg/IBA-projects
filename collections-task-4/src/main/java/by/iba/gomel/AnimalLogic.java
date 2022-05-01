package by.iba.gomel;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * The class with the binarySearchBySize(), removeByColour(), sortBySizeAscending() methods for the
 * AbstractAnimal class.
 */
public final class AnimalLogic {

    /**
     * Default constructor.
     */
    private AnimalLogic() {

    }

    /**
     * Takes list of animals and an animal to find using its size. Sorts array in size ascending
     * order, sorts and finds element.
     *
     * @param animals
     *            - the list of animals.
     * @param animalToFind
     *            - object of type AbstractAnimal.
     * @return index of the animal or -1, if not found.
     */
    public static int binarySearchBySize(final List<AbstractAnimal> animals,
            final AbstractAnimal animalToFind) {
        final Comparator<AbstractAnimal> compareSize = (o1, o2) -> o1.getSize() - o2.getSize();
        animals.sort(compareSize);
        return Collections.binarySearch(animals, animalToFind, compareSize);
    }

    /**
     * Takes list of animals and a colour. Goes through the list and checks if a colour of the
     * animal is the colour and removes it.
     *
     * @param animals
     *            - the list of animals.
     * @param colour
     *            - colour to find.
     * @return list without animal with the searched colour.
     */
    public static List<AbstractAnimal> removeByColour(final List<AbstractAnimal> animals,
            final String colour) {
        final Iterator<AbstractAnimal> it = animals.iterator();
        while (it.hasNext()) {
            final String animalColour = it.next().getColour();
            if (animalColour.equals(colour)) {
                it.remove();
            }
        }
        return animals;
    }

    /**
     * * Takes list of animals and sorts it by size ascending order.
     *
     * @param animals
     *            - the list of animals.
     * @return the sorted list.
     */
    public static List<AbstractAnimal> sortBySizeAscending(final List<AbstractAnimal> animals) {
        final Comparator<AbstractAnimal> compareSize = (o1, o2) -> o1.getSize() - o2.getSize();
        animals.sort(compareSize);
        return animals;
    }
}
