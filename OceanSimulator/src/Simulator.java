/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;
import java.awt.*;

/**
 *
 * @author 180127003
 */
public class Simulator {
    
    public static void main(){
        Plankton plankton = new Plankton();
        Sardine sardine = new Sardine();
        Shark shark = new Shark();
        Field field  = new Field(50,50);
        SimulatorView simulatorView = new SimulatorView(50,50);
        
        simulatorView.setColor(Class.forName(Plankton), Color.RED);
    }
    
}
