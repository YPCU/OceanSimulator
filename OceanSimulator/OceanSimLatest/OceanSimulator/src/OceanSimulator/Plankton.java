/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.util.Random;

/**
 *
 * @author 180127003
 */
public class Plankton extends Creature {

    public Plankton(int x, int y, boolean randAge) {
        super(x, y, randAge);

    }

    @Override
    public void act(Field field) {
        if (isAlive) {
            incrementAge();
            // to implement breeding behaviour
            Location newPlanktonLoc = breed(field);
            if (newPlanktonLoc != null) {
                int x = newPlanktonLoc.getRow();
                int y = newPlanktonLoc.getCol();
                Plankton newPlankton = new Plankton(x, y, false);
                newPlankton.setLocation(newPlanktonLoc);
                field.place(newPlankton, newPlanktonLoc);
            }
            return;
        }
        
    }

    @Override
    public Location breed(Field field) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Random rand = RandomGenerator.getRandom();
        if (age >= ModelConstants.PLANKTON_BREEDING_AGE && rand.nextDouble() < ModelConstants.PLANKTON_BREEDING_PROB) {
            // Location for new-born creature
            Location babyLocation = field.freeAdjacentLocation(location);
            if (babyLocation != null) {
                return babyLocation;
            }
        }
        return null;
    }

}
