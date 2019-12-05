/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ocean;

import GUIandConstant.ModelConstants;
import java.util.Iterator;
import java.util.Random;

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
        incrementAge();
        if (isAlive) {
            Location loc = theField.freeAdjacentLocation(location);
            // implementing behaviour to occupy prey's location.
            Location prey = findFood(theField, location);
            if (prey != null) {
                loc = prey;
            } else {
                makeHungry();
            }
            if (loc != null) {
                theField.place(null, location);
                setLocation(loc);
                theField.place(this, loc);
            } else{
                // they can't find food and have no free space
                isAlive = false;
                return;
            }
                 // to implement breeding behaviour
        Location newSharkLoc = breed(theField);
            if (newSharkLoc != null) {
               int x= newSharkLoc.getRow();
                int y = newSharkLoc.getCol();
                Shark newShark = new Shark(x, y, false);
                newShark.setLocation(newSharkLoc);
                theField.place(newShark, newSharkLoc);

            }
            return;
        }
        
//        theField.place(null, location);
    }

    @Override
    public Location findFood(Field field, Location location) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Iterator adjacentLocations = field.adjacentLocations(location);
        while (adjacentLocations.hasNext()) {
            Location next = (Location) adjacentLocations.next();
            Creature creature = field.getObjectAt(next);
            if (creature instanceof Sardine) {
                field.getObjectAt(next).isAlive = false;
                foodLevel += ModelConstants.SARDINE_NUTRITIONAL_VALUE;
                return next;
            }
        }
        return null;
    }

     @Override
    public Location breed(Field field) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Random rand = RandomGenerator.getRandom();
        if(age >= ModelConstants.SHARK_BREEDING_AGE && rand.nextDouble() < ModelConstants.SHARK_BREEDING_PROB){
                // Location for new-born creature
                Location babyLocation = field.freeAdjacentLocation(location);
                if(babyLocation != null){
                    return babyLocation;
                }
            }
        return null;
    }

   
    

}
