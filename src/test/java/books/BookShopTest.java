package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */
	
	private static BookShop mybookshop;
	
	@BeforeAll
	public static void setUp() {
		mybookshop = new BookShop("Bookshop de Nick Roeser");
	}
	
	@Test
    public void zeroBookTest(){
    	int[] books = {0,0,0,0,0};
        assertEquals(mybookshop.cost(books), 0);
    }
	
    @Test
    public void oneDifferentBookTest(){
    	int[] books = {0,2,0,0,0};
        assertEquals(mybookshop.cost(books), 16);
    }
    
    @Test
    public void twoDifferentBookTest(){
    	int[] books = {1,2,0,0,0};
        assertEquals(mybookshop.cost(books), 22.88);
    }
    
    @Test
    public void threeDifferentBookTest(){
    	int[] books = {1,3,2,0,0};
        assertEquals(mybookshop.cost(books), 44.64);
    }
    
    @Test
    public void fourDifferentBookTest(){
    	int[] books = {1,2,3,4,0};
        assertEquals(mybookshop.cost(books), 71.04);
    }
    
    @Test
    public void fiveDifferentBookTest(){
    	int[] books = {1,1,1,1,1};
        assertEquals(mybookshop.cost(books), 26);
    }
    
    @Test
    public void notEnoughBooksTest(){
    	int[] books = {1,1,1,1};
        assertThrows(IndexOutOfBoundsException.class, () -> {mybookshop.cost(books);});
    }
    
    @Test
    public void tooManyBooksTest(){
    	int[] books = {1,1,1,1,1,1}; //ignores the later entries
    	assertEquals(mybookshop.cost(books), 26);
    }
}

