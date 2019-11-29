 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.awt.Color;

/**
 *
 * @author 180127003
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Simulator {
  public static Field field;
  public static SimulatorView view;
  public static ArrayList<Creature> creatures;
  public static int currentStep;   
    
  
    public Simulator(int row, int col) {
        RandomGenerator.initialiseWithSeed(4);
        Random rand = RandomGenerator.getRandom();
        
        creatures = new ArrayList<Creature>();
        if (row > 0 && col > 0) {
            field = new Field(row, col);
        } 
        else {
            field = new Field(ModelConstants.DEFAULT_DEPTH, ModelConstants.DEFAULT_WIDTH);
        }
        view = new SimulatorView(row, col);
        view.setColor(Plankton.class, Color.green);
        view.setColor(Sardine.class, Color.orange);
        view.setColor(Shark.class, Color.red);
        currentStep = 0;
       
       startSimulation();
    }
    
    /**
     * @populate add creatures to the field 
     */
    public void populate(){
     Random rand = RandomGenerator.getRandom();   
     field.clear();
     int x = field.getWidth();
     int y = field.getDepth();
     double sharkprob = ModelConstants.SHARK_CREATE_PROB;
     double sardineprob = ModelConstants.SARDINE_CREATE_PROB;
     double planktonprob = ModelConstants.PLANKTON_CREATE_PROB;
     
     
     for(int row =0;row<x;++row){
        for(int col=0;col<y;++col){
          double prob = rand.nextDouble();
          if(prob<sharkprob){
          Shark shark = new Shark(row,col,rand.nextBoolean());   
          field.place(shark,row,col);
          creatures.add(shark);
          }
          else if(prob>(sharkprob)&& prob<(sardineprob+sharkprob)){
            Sardine sardine = new Sardine(row,col,rand.nextBoolean());
            field.place(sardine, row,col);
            creatures.add(sardine);
          }
          else if(prob>(sardineprob+sharkprob) && prob<(sardineprob+sharkprob+planktonprob)){
           Plankton plankton = new Plankton(row,col, rand.nextBoolean());   
            field.place(plankton,row,col);
            creatures.add(plankton);
        }
          else{}
     }
     }

     
    }
    
   
    /**
     * @start starts the simulation 
     */
    public void startSimulation(){
    populate();
    view.showStatus(0, field);
    simulate(1000);
    }
    
    
    /**
     * Simulates a single time jump in the simulation
     */
    public void simulateOneStep(){
     Collections.shuffle(creatures, RandomGenerator.getRandom());
     for(int i=0;i<creatures.size();i++){
      Creature creature = creatures.get(i);
      creature.act(field);
      }
     currentStep++;
     view.showStatus(currentStep, field);
     }
    
    /**
     * 
     * @param steps the number of time steps to go through 
     */
     private void simulate(int numOfStep) {
        for (int i = 0; i < numOfStep; i++) {
            if (!view.isViable(field)) {
                break;
            }
            simulateOneStep();
        }
    }
    
    
       public static void main(String[] args) {
        Simulator simulator = new Simulator(50, 50);
        simulator.startSimulation();
    }

    
}
