package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.Book;
import by.iba.gomel.Book.Contents;

public class BookTest {

    /**
     * Creates 2 book objects and a Page object. Checks if the navigateToPage() method returns
     * correct page number to navigate.
     */
    @Test
    public void testGetPage() {
        final Book book1 = new Book(100);
        final Book book2 = new Book(100);
        book1.new Page(44, "Volume 1");
        final Contents contents = new Contents();
        Assert.assertEquals("Should return page number 44", 44, contents.navigateToPage(book1, 44));
        Assert.assertEquals("Should return page number 43", 43, contents.navigateToPage(book2, 43));

    }

    /**
     * Creates 2 book objects and a Page objects. Tests if the content on the pages of 2 books is
     * the same or not.
     */
    @Test
    public void testGetPageContent() {
        final Book book1 = new Book(100);
        final Book book2 = new Book(100);
        final Contents contents = new Contents();
        // Shared content
        // First check
        book1.new Page(31, "Volume 2");
        book2.new Page(31, "Volume 2");
        Assert.assertEquals("Should be the same content",
                book1.getPageContent(book1, contents.navigateToPage(book1, 31)),
                book2.getPageContent(book2, contents.navigateToPage(book2, 31)));
        // Second check
        book1.new Page(31, "Volume 1");
        Assert.assertNotEquals("Should not be the same content",
                book1.getPageContent(book1, contents.navigateToPage(book1, 31)),
                book2.getPageContent(book2, contents.navigateToPage(book2, 31)));
    }
}
