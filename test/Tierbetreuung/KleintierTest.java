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
public class KleintierTest {
    
    public KleintierTest() {
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
     * Test of getKaefig method, of class Kleintier.
     */
    @Test
    public void testGetKaefig() {
        System.out.println("getKaefig");
        Kleintier instance = null;
        boolean expResult = false;
        boolean result = instance.getKaefig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFreilauf method, of class Kleintier.
     */
    @Test
    public void testGetFreilauf() {
        System.out.println("getFreilauf");
        Kleintier instance = null;
        boolean expResult = false;
        boolean result = instance.getFreilauf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
