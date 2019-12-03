/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ypche
 */
public class SardineTest {
    
    public SardineTest() {
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
     * Test of act method, of class Sardine.
     */
    @Test
    public void testAct() {
        System.out.println("act");
        Field theField = null;
        Sardine instance = null;
        instance.act(theField);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFood method, of class Sardine.
     */
    @Test
    public void testFindFood() {
        System.out.println("findFood");
        Field field = null;
        Location location = null;
        Sardine instance = null;
        Location expResult = null;
        Location result = instance.findFood(field, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of breed method, of class Sardine.
     */
    @Test
    public void testBreed() {
        System.out.println("breed");
        Field field = null;
        Sardine instance = null;
        Location expResult = null;
        Location result = instance.breed(field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
