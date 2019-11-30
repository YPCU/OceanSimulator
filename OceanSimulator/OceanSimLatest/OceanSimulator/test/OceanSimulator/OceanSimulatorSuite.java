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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ypche
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({OceanSimulator.ModelConstantsTest.class, OceanSimulator.PlanktonTest.class, OceanSimulator.LabelledTextAreaTest.class, OceanSimulator.RandomGeneratorTest.class, OceanSimulator.FieldTest.class, OceanSimulator.FieldStatsTest.class, OceanSimulator.FishTest.class, OceanSimulator.LocationTest.class, OceanSimulator.CreatureTest.class, OceanSimulator.SardineTest.class, OceanSimulator.SharkTest.class, OceanSimulator.CounterTest.class, OceanSimulator.SimulatorTest.class, OceanSimulator.SimulatorViewTest.class})
public class OceanSimulatorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
