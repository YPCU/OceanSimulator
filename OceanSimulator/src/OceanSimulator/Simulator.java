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
    
    /**
     *
     * Initialise creatures, field and its view.  
     * They are created once here and passed to the parts that
     * need them so there is only one copy of each.
     */
    private SimulatorView simulatorView;
    private Field field;
    private Plankton plankton;
    private Sardine sardine;
    private Shark shark;
    
    
    public static void main(String[] args){
//        Plankton plankton = new Plankton();
//        Sardine sardine = new Sardine();
//        Shark shark = new Shark();
//        Field field  = new Field(50,50);
//        SimulatorView simulatorView = new SimulatorView(50,50);
//        
//        simulatorView.setColor(Plankton.class, Color.green);
//        simulatorView.setColor(Sardine.class, Color.orange);
//        simulatorView.setColor(Shark.class, Color.red);
//        
//        field.place(plankton, 10, 10);
//        field.place(sardine, 20, 20);
//        field.place(shark, 30, 30);
//        
//        simulatorView.showStatus(0, field);
    }
    public Simulator(int row, int col){
        field  = new Field(row, col);
        simulatorView = new SimulatorView(row, col);
        simulatorView.setColor(Plankton.class, Color.green);
        simulatorView.setColor(Sardine.class, Color.orange);
        simulatorView.setColor(Shark.class, Color.red);
        
        
        

        
    }
    
    private void populate(){
        plankton = new Plankton();
        sardine = new Sardine();
        shark = new Shark();
        
        field.place(plankton, 10, 10);
        field.place(sardine, 20, 20);
        field.place(shark, 30, 30);
    }
    
    private void startSimulaion(){
        populate();
        simulatorView.showStatus(0, field);
    }
    
}
