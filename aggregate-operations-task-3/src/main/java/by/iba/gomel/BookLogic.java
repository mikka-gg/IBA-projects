package by.iba.gomel;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Has some methods to work with List of Book.
 */
public class BookLogic {
    private static final int MAX_YEAR            = 2000;
    private static final int MAX_NUMBER_OF_PAGES = 100;

    /**
     * Counts books before 2000 year with length more than 100 pages.
     *
     * @param listOfBooks
     *            - the List of Book objects.
     * @return the number of books.
     */
    public long countBooksBefore2000(final List<Book> listOfBooks) {
        return listOfBooks.stream().filter(book -> (book.getYear() < BookLogic.MAX_YEAR)
                && (book.getNumberOfPages() > BookLogic.MAX_NUMBER_OF_PAGES)).count();
    }

    /**
     * Finds a book with the most pages and returns its title.
     *
     * @param listOfBooks
     *            - the List of Book objects.
     * @return title of the book.
     */
    public String findTheLargestBook(final List<Book> listOfBooks) {
        final Optional<Book> maxNumberOfPages = listOfBooks.stream()
                .max(Comparator.comparingInt(Book::getNumberOfPages));
        if (maxNumberOfPages.isPresent()) {
            return maxNumberOfPages.get().getTitle();
        }
        return "There is no book";
    }

    /**
     * Calculates how many duplicates the list contains.
     *
     * @param listOfBooks
     *            - the List of Book objects.
     * @return number of duplicates.
     */
    public int numberOfTitleDublicates(final List<Book> listOfBooks) {
        final Set<String> notDuplicates = new HashSet<>();
        final Object[] arr = listOfBooks.stream()
                .filter(book -> !notDuplicates.add(book.getTitle())).toArray();
        return arr.length;
    }
}
