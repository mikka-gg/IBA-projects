package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.BookLc;

public class BookLcTest {

    /**
     * An instance of the Book class invokes the bookmark() method with page number and comment
     * arguments.
     */
    @Test
    public void testBookmark() {
        final BookLc book = new BookLc(100);
        Assert.assertEquals("Should return page = 10 and comment = Test comment",
                "The bookmark is set to page 10 with the comment - Test comment",
                book.bookmark(10, "Test comment"));
        Assert.assertEquals("Should return page = 55 and comment = Test comment 2",
                "The bookmark is set to page 55 with the comment - Test comment 2",
                book.bookmark(55, "Test comment 2"));
    }

}
