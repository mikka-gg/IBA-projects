package by.iba.gomel.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import by.iba.gomel.Book;
import by.iba.gomel.BookLogic;

public class BookLogicTest {
    private static final List<Book> listOfBooks = new ArrayList<>();
    private final BookLogic         bookLogic   = new BookLogic();

    @BeforeClass
    public static void fillList() {
        BookLogicTest.listOfBooks
                .add(new Book(900, "Harry Potter and the Order of the Phoenix", 2003));
        BookLogicTest.listOfBooks.add(new Book(1100, "It", 1986));
        BookLogicTest.listOfBooks.add(new Book(1500, "Clarissa", 1739));
        BookLogicTest.listOfBooks.add(new Book(1079, "Infinite Jest", 1996));
        BookLogicTest.listOfBooks
                .add(new Book(900, "Harry Potter and the Order of the Phoenix", 2003));
    }

    @Test
    public void testCountBooksBefore2000() {
        Assert.assertEquals("The number of books should equal 3", 3,
                this.bookLogic.countBooksBefore2000(BookLogicTest.listOfBooks));
    }

    @Test
    public void testCountDuplicates() {
        Assert.assertEquals("The number of books should equal 1", 1,
                this.bookLogic.numberOfTitleDublicates(BookLogicTest.listOfBooks));
    }

    @Test
    public void testFindTheLargestBook() {
        Assert.assertEquals("The title should be Clarissa", "Clarissa",
                this.bookLogic.findTheLargestBook(BookLogicTest.listOfBooks));
    }
}
