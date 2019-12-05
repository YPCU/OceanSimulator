/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import Ocean.Simulator;
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
    public void testFieldBuild() {
        System.out.println("Field Build");
        Simulator instance = new Simulator(50,50);
        assertNotNull("Field not initialised", instance);
    }
    
    
}
