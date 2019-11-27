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
public class Shark extends Fish{

    public Shark(int x, int y) {
        super(x, y);
    }

    @Override
    public void act(Field theField) {
      Location loc = theField.freeAdjacentLocation(location);
      if(!(loc==null)){
       theField.place(null, location);
       setLocation(loc);
       theField.place(this, location);
       
      }
    }
}
