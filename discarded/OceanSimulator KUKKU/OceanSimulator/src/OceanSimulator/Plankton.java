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
public class Plankton extends Creature {
    
    public Plankton(int x, int y, boolean randAge) {
        super(x, y, randAge);
        
    }

    @Override
    public void act(Field theField) {
    // killIfDead(theField) is executed in the condition 
    if(killIfDead(theField)) return;
     incrementAge();
    }


}
