/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.awt.Color;
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
public class SimulatorViewTest {
    
    public SimulatorViewTest() {
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
     * Test of setColor method, of class SimulatorView.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Class animalClass = null;
        Color color = null;
        SimulatorView instance = null;
        instance.setColor(animalClass, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showStatus method, of class SimulatorView.
     */
    @Test
    public void testShowStatus() {
        System.out.println("showStatus");
        int step = 0;
        Field field = null;
        SimulatorView instance = null;
        instance.showStatus(step, field);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isViable method, of class SimulatorView.
     */
    @Test
    public void testIsViable() {
        System.out.println("isViable");
        Field field = null;
        SimulatorView instance = null;
        boolean expResult = false;
        boolean result = instance.isViable(field);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
