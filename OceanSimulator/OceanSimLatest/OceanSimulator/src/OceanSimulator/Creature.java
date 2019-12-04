/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author 180127003
 */
public abstract class Creature {

    protected Location location;
    protected int age;
    protected boolean isAlive;
   

    /**
     * @param int x = position of creature
     * @param int y = position of creature
     * @param randAge = whether a creature will be created with a random age
     */
    public Creature(int x, int y, boolean randAge) {
        location = new Location(x, y);
        Random rand = RandomGenerator.getRandom();
        isAlive =true;
        
        
        if (this instanceof Plankton && randAge) {
            age = rand.nextInt(ModelConstants.PLANKTON_MAX_AGE);
        }
        if (this instanceof Sardine && randAge) {
            age = rand.nextInt(ModelConstants.SARDINE_MAX_AGE);
        }
        if (this instanceof Shark && randAge) {
            age = rand.nextInt(ModelConstants.SHARK_MAX_AGE);
        } else {
            age = 0;
        }
        
        
    }

    //location
    public abstract void act(Field theField);

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

// checks if creature is alive or not
    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void incrementAge() {
        age ++;
        if (this instanceof Shark && age >= ModelConstants.SHARK_MAX_AGE) {
            setIsAlive(false);
        } else if (this instanceof Sardine && age >= ModelConstants.SARDINE_MAX_AGE) {
            setIsAlive(false);
        } else if (this instanceof Plankton && age >= ModelConstants.PLANKTON_MAX_AGE) {
            setIsAlive(false);
        }
    }

    /*
        true means creature killed.
     */
//    public boolean killIfDead(Field field) {
//        if (!this.isAlive) {
//            field.place(null, location);
//            return true;
//        }
//        return false;
//    }
    
  //BREEDING needs checking

    
  /*  public void act(Location location) {
        if (isAlive) {
            if (age < ModelConstants.BREEDING_AGE && rand < probOfBreeding) {
                Creature fish = new Shark(location.getRow(), location.getCol(), true);
                fish.setLocation(location);
            }
            if (location findFood()) {
//move to food location
            } else {
                energy = cost;
                if (findFreeSpace()) {
//move to free space
                }
            }
            isAlive = false;
        }
    }

    //finding food
    
   */
    
    public abstract Location breed(Field field) ;
    //although all creatures breeds but the type of baby are of the same type,
    //therefore, it is implememnt as abstract method here.
}
