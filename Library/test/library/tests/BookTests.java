
package library.tests;

import java.util.Arrays;
import java.util.HashSet;
import library.entities.Book;
import library.services.BookService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 */
public class BookTests {
    
    Book b1;
    Book b2;
    HashSet<Book> books;
    BookService bs;
    
    public BookTests() {
    }
    
    @Before
    public void setUp() {
        b1 = new Book("Memoirs of a Geisha", "Arthur Golden", 43, 17);
        b2 = new Book("Almond", "Won-pyung Sohn", 24, 16);
        books = new HashSet<>(Arrays.asList(b1,b2));
        bs = new BookService(books);
    }
    
    @After
    public void tearDown() {
        b1 = b2 = null;
        books = null;
        bs = null;
    }

    @Test
    public void shouldNotDuplicate(){
        //if a product that was already added is added again the size won't change
        int products = bs.getBookSet().size();
        bs.addBook(b1);
        assertEquals(products, bs.getBookSet().size());
    }
}
