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
public class LabelledTextAreaTest {
    
    public LabelledTextAreaTest() {
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
     * Test of setMajorTickSpacing method, of class LabelledTextArea.
     */
    @Test
    public void testSetMajorTickSpacing() {
        System.out.println("setMajorTickSpacing");
        int spacing = 0;
        LabelledTextArea instance = null;
        instance.setMajorTickSpacing(spacing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class LabelledTextArea.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        LabelledTextArea instance = null;
        double expResult = 0.0;
        double result = instance.getValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
