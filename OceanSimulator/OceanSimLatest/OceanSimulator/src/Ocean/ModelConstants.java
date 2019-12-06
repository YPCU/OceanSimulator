/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ocean;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 180127003
 */
public class ModelConstants {

    
    //declearing the default depth of the Ocean field.
    public static final int DEFAULT_DEPTH = 100;
    //declearing the default width of the Ocean field.
    public static final int DEFAULT_WIDTH = 100;
    public static final int SIM_LENGTH = 1000;

    //declearing the plankton generating probability 
    public static final double PLANKTON_CREATE_PROB = GUI.setPLANKTON_CREATE_PROB();
    //declearing the sardine generating probability 
    public static final double SARDINE_CREATE_PROB = GUI.setSARDINE_CREATE_PROB();
    //declearing the shark generating probability 
    public static final double SHARK_CREATE_PROB = GUI.setSHARK_CREATE_PROB();

    //declearing the max age that plankton can live up to.
    public static final int PLANKTON_MAX_AGE = GUI.setPLANKTON_MAX_AGE();
    //declearing the max age that sardine can live up to.
    public static final int SARDINE_MAX_AGE = GUI.setSARDINE_MAX_AGE();
    //declearing the max age that shark can live up to.
    public static final int SHARK_MAX_AGE = GUI.setSHARK_MAX_AGE();

    public static final int SARDINE_NUTRITIONAL_VALUE = 14;
    public static final int PLANKTON_NUTRITIONAL_VALUE = 4;

    //declaring the minimum breeding age
    public static final int SARDINE_BREEDING_AGE = GUI.setSARDINE_BREEDING_AGE();
    public static final int SHARK_BREEDING_AGE = GUI.setSHARK_BREEDING_AGE();
    public static final int PLANKTON_BREEDING_AGE = 0;

    // defines probability of plankton breeding in each timestep
    public static final double PLANKTON_BREEDING_PROB = GUI.setPLANKTON_BREEDING_PROB();
    // defines probability of sardine breeding in each timestep    
    public static final double SARDINE_BREEDING_PROB = GUI.setSARDINE_BREEDING_PROB();
    // defines probability of shark breeding in each timestep
    public static final double SHARK_BREEDING_PROB = GUI.setSHARK_BREEDING_PROB();

    
    
   
    
    
}
