/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.util.Iterator;

/**
 *
 * @author 180127003
 */
public class Shark extends Fish {

    public Shark(int x, int y, boolean randAge) {
        super(x, y, randAge);
    }

    @Override
    public void act(Field theField) {
        //killIfDead(theField) is executed in the condition 
//        if (killIfDead(theField)) {
//            return;
//        }
        Location loc = theField.freeAdjacentLocation(location);
        // implementing behaviour to occupy prey's location.
        Location prey = findFood(theField, location);
        if (prey != null) {
            loc = prey;
        } else {
            makeHungry();
        }
        if (!(loc == null)) {
            theField.place(null, location);
            setLocation(loc);
            theField.place(this, location);

        }
        incrementAge();
    }

    @Override
    public Location findFood(Field field, Location location) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Iterator adjacentLocations = field.adjacentLocations(location);
        while (adjacentLocations.hasNext()) {
            Location next = (Location) adjacentLocations.next();
            Creature creature = field.getObjectAt(next);
            if (creature instanceof Sardine) {
                creature.isAlive = false;
                foodLevel += ModelConstants.SARDINE_NUTRITIONAL_VALUE;
                return next;
            }
        }
        return null;
    }

}
