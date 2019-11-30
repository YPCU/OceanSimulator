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
public class CreatureTest {
    
    public CreatureTest() {
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
     * Test of act method, of class Creature.
     */
    @Test
    public void testAct() {
        System.out.println("act");
        Field theField = null;
        Creature instance = null;
        instance.act(theField);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Creature.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Creature instance = null;
        Location expResult = null;
        Location result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Creature.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Location location = null;
        Creature instance = null;
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlive method, of class Creature.
     */
    @Test
    public void testIsAlive() {
        System.out.println("isAlive");
        Creature instance = null;
        boolean expResult = false;
        boolean result = instance.isAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAlive method, of class Creature.
     */
    @Test
    public void testSetIsAlive() {
        System.out.println("setIsAlive");
        boolean isAlive = false;
        Creature instance = null;
        instance.setIsAlive(isAlive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Creature.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Creature instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Creature.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Creature instance = null;
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementAge method, of class Creature.
     */
    @Test
    public void testIncrementAge() {
        System.out.println("incrementAge");
        Creature instance = null;
        instance.incrementAge();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of killIfDead method, of class Creature.
     */
    @Test
    public void testKillIfDead() {
        System.out.println("killIfDead");
        Field field = null;
        Creature instance = null;
        boolean expResult = false;
        boolean result = instance.killIfDead(field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CreatureImpl extends Creature {

        public CreatureImpl() {
            super(0, 0, false);
        }

        public void act(Field theField) {
        }
    }
    
}
