/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.util.Iterator;
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
public class FieldTest {
    
    public FieldTest() {
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
     * Test of clear method, of class Field.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Field instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of place method, of class Field.
     */
    @Test
    public void testPlace_3args() {
        System.out.println("place");
        Creature creature = null;
        int row = 0;
        int col = 0;
        Field instance = null;
        instance.place(creature, row, col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of place method, of class Field.
     */
    @Test
    public void testPlace_Creature_Location() {
        System.out.println("place");
        Creature creature = null;
        Location location = null;
        Field instance = null;
        instance.place(creature, location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectAt method, of class Field.
     */
    @Test
    public void testGetObjectAt_Location() {
        System.out.println("getObjectAt");
        Location location = null;
        Field instance = null;
        Creature expResult = null;
        Creature result = instance.getObjectAt(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectAt method, of class Field.
     */
    @Test
    public void testGetObjectAt_int_int() {
        System.out.println("getObjectAt");
        int row = 0;
        int col = 0;
        Field instance = null;
        Creature expResult = null;
        Creature result = instance.getObjectAt(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of freeAdjacentLocation method, of class Field.
     */
    @Test
    public void testFreeAdjacentLocation() {
        System.out.println("freeAdjacentLocation");
        Location location = null;
        Field instance = null;
        Location expResult = null;
        Location result = instance.freeAdjacentLocation(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adjacentLocations method, of class Field.
     */
    @Test
    public void testAdjacentLocations() {
        System.out.println("adjacentLocations");
        Location location = null;
        Field instance = null;
        Iterator expResult = null;
        Iterator result = instance.adjacentLocations(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepth method, of class Field.
     */
    @Test
    public void testGetDepth() {
        System.out.println("getDepth");
        Field instance = null;
        int expResult = 0;
        int result = instance.getDepth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class Field.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Field instance = null;
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
