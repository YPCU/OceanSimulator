/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIandConstant;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 180127003
 */
public class ModelConstants {

    //declearing the default depth of the Ocean field.
    private static int DEFAULT_DEPTH = 100;
    //declearing the default width of the Ocean field.
    private static int DEFAULT_WIDTH = 100;
    private static int SIM_LENGTH = 1000;

    //declearing the plankton generating probability 
    private static double PLANKTON_CREATE_PROB = 0.7;
    //declearing the sardine generating probability 
    private static double SARDINE_CREATE_PROB = 0.1;
    //declearing the shark generating probability 
    private static double SHARK_CREATE_PROB = 0.05;

    //declearing the max age that plankton can live up to.
    private static int PLANKTON_MAX_AGE = 100;
    //declearing the max age that sardine can live up to.
    private static int SARDINE_MAX_AGE = 75;
    //declearing the max age that shark can live up to.
    private static int SHARK_MAX_AGE = 150;

    private static int SARDINE_NUTRITIONAL_VALUE = 14;
    private static int PLANKTON_NUTRITIONAL_VALUE = 4;

    //declaring the minimum breeding age
    private static int SARDINE_BREEDING_AGE = 12;
    private static int SHARK_BREEDING_AGE = 25;
    private static int PLANKTON_BREEDING_AGE = 0;

    // defines probability of plankton breeding in each timestep
    private static double PLANKTON_BREEDING_PROB = 0.8;
    // defines probability of sardine breeding in each timestep    
    private static double SARDINE_BREEDING_PROB = 0.5;
    // defines probability of shark breeding in each timestep
    private static double SHARK_BREEDING_PROB = 0.2;

    // All setter methods are without modifier, which gain access to the class 
    //within the same package, but not to all the classes in the project.
    
    static void setDEFAULT_DEPTH(int DEFAULT_DEPTH) {
        ModelConstants.DEFAULT_DEPTH = DEFAULT_DEPTH;
    }

    static void setDEFAULT_WIDTH(int DEFAULT_WIDTH) {
        ModelConstants.DEFAULT_WIDTH = DEFAULT_WIDTH;
    }

    static void setSIM_LENGTH(int SIM_LENGTH) {
        ModelConstants.SIM_LENGTH = SIM_LENGTH;
    }

    static void setPLANKTON_CREATE_PROB(double PLANKTON_CREATE_PROB) {
        ModelConstants.PLANKTON_CREATE_PROB = PLANKTON_CREATE_PROB;
    }

    static void setSARDINE_CREATE_PROB(double SARDINE_CREATE_PROB) {
        ModelConstants.SARDINE_CREATE_PROB = SARDINE_CREATE_PROB;
    }

    static void setSHARK_CREATE_PROB(double SHARK_CREATE_PROB) {
        ModelConstants.SHARK_CREATE_PROB = SHARK_CREATE_PROB;
    }

    static void setPLANKTON_MAX_AGE(int PLANKTON_MAX_AGE) {
        ModelConstants.PLANKTON_MAX_AGE = PLANKTON_MAX_AGE;
    }

    static void setSARDINE_MAX_AGE(int SARDINE_MAX_AGE) {
        ModelConstants.SARDINE_MAX_AGE = SARDINE_MAX_AGE;
    }

    static void setSHARK_MAX_AGE(int SHARK_MAX_AGE) {
        ModelConstants.SHARK_MAX_AGE = SHARK_MAX_AGE;
    }

    static void setSARDINE_NUTRITIONAL_VALUE(int SARDINE_NUTRITIONAL_VALUE) {
        ModelConstants.SARDINE_NUTRITIONAL_VALUE = SARDINE_NUTRITIONAL_VALUE;
    }

    static void setPLANKTON_NUTRITIONAL_VALUE(int PLANKTON_NUTRITIONAL_VALUE) {
        ModelConstants.PLANKTON_NUTRITIONAL_VALUE = PLANKTON_NUTRITIONAL_VALUE;
    }

    static void setSARDINE_BREEDING_AGE(int SARDINE_BREEDING_AGE) {
        ModelConstants.SARDINE_BREEDING_AGE = SARDINE_BREEDING_AGE;
    }

    static void setSHARK_BREEDING_AGE(int SHARK_BREEDING_AGE) {
        ModelConstants.SHARK_BREEDING_AGE = SHARK_BREEDING_AGE;
    }

    static void setPLANKTON_BREEDING_AGE(int PLANKTON_BREEDING_AGE) {
        ModelConstants.PLANKTON_BREEDING_AGE = PLANKTON_BREEDING_AGE;
    }

    static void setPLANKTON_BREEDING_PROB(double PLANKTON_BREEDING_PROB) {
        ModelConstants.PLANKTON_BREEDING_PROB = PLANKTON_BREEDING_PROB;
    }

    static void setSARDINE_BREEDING_PROB(double SARDINE_BREEDING_PROB) {
        ModelConstants.SARDINE_BREEDING_PROB = SARDINE_BREEDING_PROB;
    }

    static void setSHARK_BREEDING_PROB(double SHARK_BREEDING_PROB) {
        ModelConstants.SHARK_BREEDING_PROB = SHARK_BREEDING_PROB;
    }

    // All getter methods are with public modifier, which gain access to the  
    //value of the field to all the classes in the project.

    public static int getDEFAULT_DEPTH() {
        return DEFAULT_DEPTH;
    }

    public static int getDEFAULT_WIDTH() {
        return DEFAULT_WIDTH;
    }

    public static int getSIM_LENGTH() {
        return SIM_LENGTH;
    }

    public static double getPLANKTON_CREATE_PROB() {
        return PLANKTON_CREATE_PROB;
    }

    public static double getSARDINE_CREATE_PROB() {
        return SARDINE_CREATE_PROB;
    }

    public static double getSHARK_CREATE_PROB() {
        return SHARK_CREATE_PROB;
    }

    public static int getPLANKTON_MAX_AGE() {
        return PLANKTON_MAX_AGE;
    }

    public static int getSARDINE_MAX_AGE() {
        return SARDINE_MAX_AGE;
    }

    public static int getSHARK_MAX_AGE() {
        return SHARK_MAX_AGE;
    }

    public static int getSARDINE_NUTRITIONAL_VALUE() {
        return SARDINE_NUTRITIONAL_VALUE;
    }

    public static int getPLANKTON_NUTRITIONAL_VALUE() {
        return PLANKTON_NUTRITIONAL_VALUE;
    }

    public static int getSARDINE_BREEDING_AGE() {
        return SARDINE_BREEDING_AGE;
    }

    public static int getSHARK_BREEDING_AGE() {
        return SHARK_BREEDING_AGE;
    }

    public static int getPLANKTON_BREEDING_AGE() {
        return PLANKTON_BREEDING_AGE;
    }

    public static double getPLANKTON_BREEDING_PROB() {
        return PLANKTON_BREEDING_PROB;
    }

    public static double getSARDINE_BREEDING_PROB() {
        return SARDINE_BREEDING_PROB;
    }

    public static double getSHARK_BREEDING_PROB() {
        return SHARK_BREEDING_PROB;
    }
    
    
}
