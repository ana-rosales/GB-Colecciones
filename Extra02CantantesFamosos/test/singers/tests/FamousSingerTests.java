
package singers.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import singers.entities.FamousSinger;
import singers.services.SingerService;

/**
 *
 * @author paula
 */
public class FamousSingerTests {
    private static SingerService ss;
    private static FamousSinger s1;
    
    public FamousSingerTests() {
    }
    
    @Before
    public void setUp() {
        s1 = new FamousSinger("Selena Gomez", "Revival");
        ss = new SingerService();
    }
    
    @After
    public void tearDown() {
        s1 = null;
        ss = null;
    }
    
    @Test
    public void shouldOrShouldNotRemove(){
        //Existing singer
        assertTrue(ss.contains("Kanye West"));
        ss.removeSinger("Kanye West");
        assertFalse(ss.contains("Kanye West"));
        //Non existing singer
        assertFalse(ss.contains(s1.getName()));
        ss.removeSinger(s1.getName());
        assertFalse(ss.contains(s1.getName()));
    }
    
    @Test
    public void shouldCreateSinger(){
        FamousSinger fs = ss.createSinger("Selena Gomez", "Revival");
        assertEquals(s1.getName(),fs.getName());
        assertEquals(s1.getHighestSellingAlbum(),fs.getHighestSellingAlbum());
    }
    
    @Test
    public void shouldAddSinger(){
        ss.addSinger(s1);
        assertTrue(ss.getSingers().contains(s1));
    }

    
}
