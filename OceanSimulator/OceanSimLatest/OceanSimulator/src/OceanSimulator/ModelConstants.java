/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

/**
 *
 * @author 180127003
 */
public class ModelConstants {
     //declearing the default depth of the Ocean field.
    public static final int DEFAULT_DEPTH = 50; 
    //declearing the default width of the Ocean field.
    public static final int DEFAULT_WIDTH = 50;
    public static final double SIM_LENGTH = 1000;
    
       //declearing the plankton generating probability 
    public static final double PLANKTON_CREATE_PROB = 0.3;
    //declearing the sardine generating probability 
    public static final double SARDINE_CREATE_PROB = 0.4;
    //declearing the shark generating probability 
    public static final double SHARK_CREATE_PROB = 0.2;
    
    //declearing the max age that plankton can live up to.
    public static final int PLANKTON_MAX_AGE = 75;
    //declearing the max age that sardine can live up to.
    public static final int SARDINE_MAX_AGE = 50;
    //declearing the max age that shark can live up to.
    public static final int SHARK_MAX_AGE = 100;
    
    public static final int SARDINE_NUTRITIONAL_VALUE = 25;
    public static final int PLANKTON_NUTRITIONAL_VALUE = 25;
    
    //declaring the minimum breeding age
    public static final int SARDINE_BREEDING_AGE = 10;
    public static final int SHARK_BREEDING_AGE = 25;
    public static final int PLANKTON_BREEDING_AGE = 15;

    // defines probability of plankton breeding in each timestep
    public static final double PLANKTON_BREEDING_PROB = 0.8; 
    // defines probability of sardine breeding in each timestep    
    public static final double SARDINE_BREEDING_PROB = 0.5; 
    // defines probability of shark breeding in each timestep
    public static final double SHARK_BREEDING_PROB = 0.2; 
    
}
           
     
