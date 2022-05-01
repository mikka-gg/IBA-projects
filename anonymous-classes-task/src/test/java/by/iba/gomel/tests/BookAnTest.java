package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.BookAn;
import by.iba.gomel.BookAn.Contents;
import by.iba.gomel.BookAn.Translatable;

public class BookAnTest {
    /**
     * Creates a Book object and checks if a page has a correct translation.
     */
    @Test
    public void testGetPageContent() {
        final BookAn book = new BookAn(100);
        final Contents contents = new Contents();

        // Default translation to an empty page
        Assert.assertEquals("Should be [EN] No content", "[EN] No content",
                book.getPageContent(book, contents.navigateToPage(book, 31)));

        // Default translation to the page with some content
        book.new Page(31, "Hello");
        Assert.assertEquals("Should be [EN] Hello", "[EN] Hello",
                book.getPageContent(book, contents.navigateToPage(book, 31)));

        // French translation to the page with some content
        book.new Page(31, "Hello", new Translatable() {

            @Override
            public void print() {
                // Do nothing
            }

            @Override
            public String translate(final String content) {
                return "[FR] " + content;
            }
        });
        Assert.assertEquals("Should be [FR] Hello", "[FR] Hello",
                book.getPageContent(book, contents.navigateToPage(book, 31)));

        // Russian translation to the page with some content
        book.new Page(31, "Hello", new Translatable() {

            @Override
            public void print() {
                // Do nothing
            }

            @Override
            public String translate(final String content) {
                return "[RU] " + content;
            }
        });
        Assert.assertEquals("Should be [RU] Hello", "[RU] Hello",
                book.getPageContent(book, contents.navigateToPage(book, 31)));
    }
}
