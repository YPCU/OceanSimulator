/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ocean;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author 180127003
 */
public class Sardine extends Fish {

    public Sardine(int x, int y, boolean randAge) {
        super(x, y, randAge);
    }

    @Override
    public void act(Field theField) {
        incrementAge();
        if (isAlive) {
            
            // implementing behaviour to occupy prey's location.
            Location prey = findFood(theField, location);
            if (prey != null) {
                location = prey;
            } else {
                makeHungry();
                Location loc = theField.freeAdjacentLocation(location);
                if (loc != null) {
                    theField.place(null, location);
                    setLocation(loc);
                    theField.place(this, loc);
                } else {
                    // they can't find food and have no free space
                    isAlive = false;
                    theField.place(null, location);
                    return;
                }
            }
            // to implement breeding behaviour
            Location newSardineLoc = breed(theField);
            if (newSardineLoc != null) {
                int x = newSardineLoc.getRow();
                int y = newSardineLoc.getCol();
                Sardine newSardine = new Sardine(x, y, false);
                newSardine.setLocation(newSardineLoc);
                theField.place(newSardine, newSardineLoc);
            }
            return;
        } else {
            theField.place(null, location);
        }

    }

    @Override
    public Location findFood(Field field, Location location) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Iterator adjacentLocations = field.adjacentLocations(location);
        while (adjacentLocations.hasNext()) {
            Location next = (Location) adjacentLocations.next();
            Creature creature = field.getObjectAt(next);
            if (creature instanceof Plankton) {
                field.getObjectAt(next).isAlive = false;
                foodLevel += ModelConstants.PLANKTON_NUTRITIONAL_VALUE;
                return next;
            }
        }
        return null;
    }

    @Override
    public Location breed(Field field) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Random rand = RandomGenerator.getRandom();
        if (age >= ModelConstants.SARDINE_BREEDING_AGE && rand.nextDouble() < ModelConstants.SARDINE_BREEDING_PROB) {
            // Location for new-born creature
            Location babyLocation = field.freeAdjacentLocation(location);
            if (babyLocation != null) {
                return babyLocation;
            }
        }
        return null;
    }

}
