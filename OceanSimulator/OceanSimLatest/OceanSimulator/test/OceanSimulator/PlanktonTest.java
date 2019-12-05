/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import Ocean.Plankton;
import Ocean.Field;
import Ocean.Location;
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
public class PlanktonTest {
    
    public PlanktonTest() {
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
     * Test of act method, of class Plankton.
     */
    @Test
    public void testAct() {
        System.out.println("act");
        Field field = null;
        Plankton instance = null;
        instance.act(field);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of breed method, of class Plankton.
     */
    @Test
    public void testBreed() {
        System.out.println("breed");
        Field field = null;
        Plankton instance = null;
        Location expResult = null;
        Location result = instance.breed(field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
