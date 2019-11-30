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
public class SimulatorTest {
    
    public SimulatorTest() {
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
     * Test of populate method, of class Simulator.
     */
    @Test
    public void testPopulate() {
        System.out.println("populate");
        Simulator instance = null;
        instance.populate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startSimulation method, of class Simulator.
     */
    @Test
    public void testStartSimulation() {
        System.out.println("startSimulation");
        Simulator instance = null;
        instance.startSimulation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simulateOneStep method, of class Simulator.
     */
    @Test
    public void testSimulateOneStep() {
        System.out.println("simulateOneStep");
        Simulator instance = null;
        instance.simulateOneStep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Simulator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Simulator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
