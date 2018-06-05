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
public class TierTest {
    
    public TierTest() {

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
     * Test of getName method, of class Tier.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Tier instance = new Tier("Karl", "Katze", "Liesing", 12, true);
        String expResult = "Karl";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getArt method, of class Tier.
     */
    @Test
    public void testGetArt() {
        System.out.println("getArt");
        Tier instance = new Tier ("Karl", "Katze", "Liesing", 12, true);
        String expResult = "Katze";
        String result = instance.getArt();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setStandort method, of class Tier.
     */
    @Test
    public void testSetStandort() {
        System.out.println("Test Methode SetStandort");
        String standort = "Favoriten";
        Tier instance = new Tier("Karl", "Katze", "Liesing", 12, true);
        instance.setStandort(standort);
        String expResult = standort;
        String result = instance.getStandort();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStandort method, of class Tier.
     */
    @Test
    public void testGetStandort() {
        System.out.println("getStandort");
        Tier instance = new Tier("Karl", "Katze", "Liesing", 12, true);
        String expResult = "Liesing";
        String result = instance.getStandort();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAlter method, of class Tier.
     */
    @Test
    public void testGetAlter() {
        System.out.println("getAlter");
        Tier instance = null;
        int expResult = 0;
        int result = instance.getAlter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVerfuegbar method, of class Tier.
     */
    @Test
    public void testSetVerfuegbar() {
        System.out.println("setVerfuegbar");
        boolean verfuegbar = false;
        Tier instance = null;
        instance.setVerfuegbar(verfuegbar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerfuegbar method, of class Tier.
     */
    
    @Test
    public void testGetVerfuegbar() {
        System.out.println("getVerfuegbar");
        Tier instance = null;
        boolean expResult = false;
        boolean result = instance.getVerfuegbar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Tier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tier instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of umverteilen method, of class Tier.
     */
    @Test
    public void testUmverteilen() {
        System.out.println("umverteilen");
        Tier instance = null;
        instance.umverteilen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}