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
public class FishTest {
    
    public FishTest() {
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
     * Test of getFoodLevel method, of class Fish.
     */
    @Test
    public void testGetFoodLevel() {
        System.out.println("getFoodLevel");
        Fish instance = null;
        int expResult = 0;
        int result = instance.getFoodLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoodLevel method, of class Fish.
     */
    @Test
    public void testSetFoodLevel() {
        System.out.println("setFoodLevel");
        int foodLevel = 0;
        Fish instance = null;
        instance.setFoodLevel(foodLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeHungry method, of class Fish.
     */
    @Test
    public void testMakeHungry() {
        System.out.println("makeHungry");
        Fish instance = null;
        instance.makeHungry();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFood method, of class Fish.
     */
    @Test
    public void testFindFood() {
        System.out.println("findFood");
        Field theField = null;
        Location location = null;
        Fish instance = null;
        Location expResult = null;
        Location result = instance.findFood(theField, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FishImpl extends Fish {

        public FishImpl() {
            super(0, 0, false);
        }

        public Location findFood(Field theField, Location location) {
            return null;
        }
    }
    
}
