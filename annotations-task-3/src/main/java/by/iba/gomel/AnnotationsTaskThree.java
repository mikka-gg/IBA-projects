package by.iba.gomel;

/**
 * Repeating annotations.
 */
@Workaround(author = "Doe", defectNumber = 2, releaseNumber = 1)
@Workaround(author = "Krotkov", defectNumber = 3, releaseNumber = 2)
@Workaround(author = "Smith", defectNumber = 5, releaseNumber = 4)
public class AnnotationsTaskThree {
    /**
     * Sonar fix.
     *
     * @param name
     *            - name.
     * @return name,
     */
    public String getName(final String name) {
        return name;
    }
}
