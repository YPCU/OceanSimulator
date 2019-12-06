/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ocean;

/**
 *
 * @author 180127003
 */
public abstract class Fish extends Creature{
    
    // store the energy level of the fish.
    protected int foodLevel;
    public Fish(int x, int y, boolean rndAge) {
        super(x, y, rndAge);
        foodLevel = 100;
    }
    
    /* *
    * return the food level
    */
    public int getFoodLevel() {
        return foodLevel;
    }

    public void setFoodLevel(int foodLevel) {
        this.foodLevel = foodLevel;
    }
    
    public void makeHungry() {
    foodLevel--;
    if(foodLevel <= 0) {
        isAlive = false;
        }
    }
    
    public abstract Location findFood(Field theField, Location location);

}
