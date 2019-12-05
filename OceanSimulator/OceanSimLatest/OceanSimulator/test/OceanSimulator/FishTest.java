/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import Ocean.Shark;
import Ocean.Sardine;
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
    public void testCreateFish() {
        System.out.println("testCreateFish");
        Shark shark = new Shark(1, 1, true);
        assertTrue("Dead Shark"+ shark.isAlive(), shark.isAlive());
        shark = new Shark(1, 1, false);
        assertTrue("Dead rand age Shark"+ shark.isAlive(), shark.isAlive());
        Sardine sardine = new Sardine(1, 1, true);
        assertTrue("Dead Sardine" + sardine.isAlive(), sardine.isAlive());
    }

    
    
    
}
