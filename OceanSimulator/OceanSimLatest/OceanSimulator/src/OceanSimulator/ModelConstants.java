/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 180127003
 */
public class ModelConstants {
    
    //declearing the default depth of the Ocean field.

    public static  int DEFAULT_DEPTH = 50;
    //declearing the default width of the Ocean field.
    public static  int DEFAULT_WIDTH = 50;
    public static  int SIM_LENGTH = 1000;

    //declearing the plankton generating probability 
    public static  double PLANKTON_CREATE_PROB = 0.7;
    //declearing the sardine generating probability 
    public static  double SARDINE_CREATE_PROB = 0.1;
    //declearing the shark generating probability 
    public static  double SHARK_CREATE_PROB = 0.05;

    //declearing the max age that plankton can live up to.
    public static  int PLANKTON_MAX_AGE = 100;
    //declearing the max age that sardine can live up to.
    public static  int SARDINE_MAX_AGE = 75;
    //declearing the max age that shark can live up to.
    public static  int SHARK_MAX_AGE = 150;

    public static  int SARDINE_NUTRITIONAL_VALUE = 14;
    public static  int PLANKTON_NUTRITIONAL_VALUE = 4;

    //declaring the minimum breeding age
    public static  int SARDINE_BREEDING_AGE = 12;
    public static  int SHARK_BREEDING_AGE = 25;
    public static  int PLANKTON_BREEDING_AGE = 0;

    // defines probability of plankton breeding in each timestep
    public static  double PLANKTON_BREEDING_PROB = 0.8;
    // defines probability of sardine breeding in each timestep    
    public static  double SARDINE_BREEDING_PROB = 0.5;
    // defines probability of shark breeding in each timestep
    public static  double SHARK_BREEDING_PROB = 0.2;
    
//    public static void call(int value, String fieldName){
//        java.lang.reflect.Field field = null;
//        try {
//            field = ModelConstants.class.getField(fieldName);
//        } catch (NoSuchFieldException ex) {
//            Logger.getLogger(ModelConstants.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SecurityException ex) {
//            Logger.getLogger(ModelConstants.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        if (field != null){
//            Object p = null;
//            //field.set(ModelConstants.this, value);
//        }
//        PLANKTON_MAX_AGE = value;
//    }

    public static void setDEFAULT_DEPTH(int DEFAULT_DEPTH) {
        ModelConstants.DEFAULT_DEPTH = DEFAULT_DEPTH;
    }

    public static void setDEFAULT_WIDTH(int DEFAULT_WIDTH) {
        ModelConstants.DEFAULT_WIDTH = DEFAULT_WIDTH;
    }

    public static void setSIM_LENGTH(int SIM_LENGTH) {
        ModelConstants.SIM_LENGTH = SIM_LENGTH;
    }

    public static void setPLANKTON_CREATE_PROB(double PLANKTON_CREATE_PROB) {
        ModelConstants.PLANKTON_CREATE_PROB = PLANKTON_CREATE_PROB;
    }

    public static void setSARDINE_CREATE_PROB(double SARDINE_CREATE_PROB) {
        ModelConstants.SARDINE_CREATE_PROB = SARDINE_CREATE_PROB;
    }

    public static void setSHARK_CREATE_PROB(double SHARK_CREATE_PROB) {
        ModelConstants.SHARK_CREATE_PROB = SHARK_CREATE_PROB;
    }

    public static void setPLANKTON_MAX_AGE(int PLANKTON_MAX_AGE) {
        ModelConstants.PLANKTON_MAX_AGE = PLANKTON_MAX_AGE;
    }

    public static void setSARDINE_MAX_AGE(int SARDINE_MAX_AGE) {
        ModelConstants.SARDINE_MAX_AGE = SARDINE_MAX_AGE;
    }

    public static void setSHARK_MAX_AGE(int SHARK_MAX_AGE) {
        ModelConstants.SHARK_MAX_AGE = SHARK_MAX_AGE;
    }

    public static void setSARDINE_NUTRITIONAL_VALUE(int SARDINE_NUTRITIONAL_VALUE) {
        ModelConstants.SARDINE_NUTRITIONAL_VALUE = SARDINE_NUTRITIONAL_VALUE;
    }

    public static void setPLANKTON_NUTRITIONAL_VALUE(int PLANKTON_NUTRITIONAL_VALUE) {
        ModelConstants.PLANKTON_NUTRITIONAL_VALUE = PLANKTON_NUTRITIONAL_VALUE;
    }

    public static void setSARDINE_BREEDING_AGE(int SARDINE_BREEDING_AGE) {
        ModelConstants.SARDINE_BREEDING_AGE = SARDINE_BREEDING_AGE;
    }

    public static void setSHARK_BREEDING_AGE(int SHARK_BREEDING_AGE) {
        ModelConstants.SHARK_BREEDING_AGE = SHARK_BREEDING_AGE;
    }

    public static void setPLANKTON_BREEDING_AGE(int PLANKTON_BREEDING_AGE) {
        ModelConstants.PLANKTON_BREEDING_AGE = PLANKTON_BREEDING_AGE;
    }

    public static void setPLANKTON_BREEDING_PROB(double PLANKTON_BREEDING_PROB) {
        ModelConstants.PLANKTON_BREEDING_PROB = PLANKTON_BREEDING_PROB;
    }

    public static void setSARDINE_BREEDING_PROB(double SARDINE_BREEDING_PROB) {
        ModelConstants.SARDINE_BREEDING_PROB = SARDINE_BREEDING_PROB;
    }

    public static void setSHARK_BREEDING_PROB(double SHARK_BREEDING_PROB) {
        ModelConstants.SHARK_BREEDING_PROB = SHARK_BREEDING_PROB;
    }
    
    
    }
