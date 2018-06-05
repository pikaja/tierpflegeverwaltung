package Tierbetreuung;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author pp
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TierTest.class, KleintierTest.class, KatzeTest.class, TierbetreuungTest.class, HundTest.class, stringTest.class, ReadwriteTest.class})
public class TierbetreuungSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
