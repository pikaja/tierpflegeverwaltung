package Tierbetreuung;

import java.util.ArrayList;
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
public class ReadwriteTest {
    
    public ReadwriteTest() {
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
     * Test of writeToFile method, of class Readwrite.
     */
    @Test
    public void testWriteToFile() {
        System.out.println("writeToFile");
        ArrayList<Tier> listeTiere = null;
        Readwrite instance = new Readwrite();
        instance.writeToFile(listeTiere);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFromFile method, of class Readwrite.
     */
    @Test
    public void testReadFromFile() {
        System.out.println("readFromFile");
        ArrayList<Tier> listeTiere = null;
        Readwrite instance = new Readwrite();
        instance.readFromFile(listeTiere);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
