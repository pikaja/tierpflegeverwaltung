package Tierbetreuung;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pp
 */
public class HundTest {
    
    public HundTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMagKinder method, of class Hund.
     */
    @Test
    public void testGetMagKinder() {
        System.out.println("getMagKinder");
        Hund instance = null;
        boolean expResult = true;
        boolean result = instance.getMagKinder();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMagLeine method, of class Hund.
     */
    @Test
    public void testGetMagLeine() {
        System.out.println("getMagLeine");
        Hund instance = null;
        boolean expResult = false;
        boolean result = instance.getMagLeine();
        assertEquals(expResult, result);
    }
    
}
