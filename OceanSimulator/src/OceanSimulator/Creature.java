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
public abstract class Creature {
protected Location location;

    public Creature(int x,int y) {
      location = new Location(x,y);
    }

   public abstract void act(Field theField);

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
   

        
}
