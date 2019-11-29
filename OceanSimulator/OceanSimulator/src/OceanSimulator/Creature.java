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
protected int foodLevel;

/** 
    * @param int x = position of creature
    * @param int y = position of creature
    * @param randAge = whether a creature will be created with a random age
*/
    public Creature(int x,int y, boolean randAge) {
      location = new Location(x,y);
      Random rand = new Random ();
      foodLevel = 100;
      
      
    if (this instanceof Plankton && randAge) {
            age = rand.nextInt(ModelConstants.PLANKTON_MAX_AGE);
    }
    if (this instanceof Sardine && randAge) {
            age = rand.nextInt(ModelConstants.SARDINE_MAX_AGE);
        }
    if (this instanceof Shark && randAge) {
            age = rand.nextInt(ModelConstants.SHARK_MAX_AGE);
        } 
    else {
            age = 0;
            isAlive = true;
        }   
    }

    public Creature(int foodLevel) {
        this.foodLevel = foodLevel;
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
    public boolean isAlive(){
    return isAlive;
    }
      
    public void setIsAlive (boolean isAlive) {
    this.isAlive = isAlive;
    }
   
    //age
   public int getAge () {
   return age;
   }
   
   public void setAge (int age) {
   this.age = age;
   }
  
       public void incrementAge() {
        age++;
        if (this instanceof Shark && age == ModelConstants.SHARK_MAX_AGE) {
            setIsAlive(false);
        } 
        else if (this instanceof Sardine && age < ModelConstants.SARDINE_MAX_AGE) {
            setIsAlive(false);
        } 
        else if (this instanceof Plankton && age < ModelConstants.PLANKTON_MAX_AGE) {
            setIsAlive(false);
        }

    }
        // food level
    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }
      
    public void foodLevel (Field field){
    Iterator adjacentLocations = field.adjacentLocations(location);
        while (adjacentLocations.hasNext()) {
        Location next = (Location) adjacentLocations.next();
            //TODO: check if food exists here
        }
    
    }
        
}
