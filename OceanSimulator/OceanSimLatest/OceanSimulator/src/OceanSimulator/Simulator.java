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
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulator {

    public static Field field;
    public static SimulatorView view;
    public static ArrayList<Creature> creatures;
    public static int currentStep;
    private final int simLength = ModelConstants.SIM_LENGTH;
//    private final int simLength = 17;
            boolean show = false;

    public Simulator(int row, int col) {
        //RandomGenerator.initialiseWithSeed(4);
        Random rand = RandomGenerator.getRandom();

        creatures = new ArrayList<Creature>();
        if (row > 0 && col > 0) {
            field = new Field(row, col);
        } else {
            field = new Field(ModelConstants.DEFAULT_DEPTH, ModelConstants.DEFAULT_WIDTH);
        }
        view = new SimulatorView(row, col);
        view.setColor(Plankton.class, Color.green);
        view.setColor(Sardine.class, Color.orange);
        view.setColor(Shark.class, Color.red);
        currentStep = 0;

        // Mistake below startSimulation(); repeated call causing simulator 
        // twice when main method is called.
        //Constructor build the class object and startSimulator invoke as 
        //an action in main method.
        //startSimulation();
    }

    /**
     * @populate initialise the creatures to the field at the beginning
     */
    public void populate() {
        Random rand = RandomGenerator.getRandom();
        field.clear();
        int x = field.getWidth();
        int y = field.getDepth();
        double sharkProb = ModelConstants.SHARK_CREATE_PROB;
        double sardineProb = ModelConstants.SARDINE_CREATE_PROB;
        double planktonProb = ModelConstants.PLANKTON_CREATE_PROB;

        for (int row = 0; row < x; ++row) {
            for (int col = 0; col < y; ++col) {
                double prob = rand.nextDouble();
                if (prob < sharkProb) {
                    Shark shark = new Shark(row, col, true);
                    field.place(shark, row, col);
                    creatures.add(shark);
                } else if (prob > (sharkProb) && prob < (sardineProb + sharkProb)) {
                    Sardine sardine = new Sardine(row, col, true);
                    field.place(sardine, row, col);
                    creatures.add(sardine);
                } else if (prob > (sardineProb + sharkProb) && prob < (sardineProb + sharkProb + planktonProb)) {
                    Plankton plankton = new Plankton(row, col, true);
                    field.place(plankton, row, col);
                    creatures.add(plankton);
                } else {
                }
            }
        }
    }

    /*
     for(int row =0;row<x;++row){
     for(int col=0;col<y;++col)
        {
     if (rand < ModelConstants.PLANKTON_CREATE){
     field[row][col]= new Plankton ();
     }
     else if (PLANKTON.CREATE < rand && 
     rand <PLANKTON.CREATE+ SHARK.CREATE>){
         field [row][col]= new Shark ();
     }
     else if (Plankton+Shark < rand && rand < Plankton+Shark+Sardine){
     field[row][col]= new Sardine ();
     }
     else{}
     }}
     *
    }
    
    *\
    
   
    /**
     * @start starts the simulation 
     */
    public void startSimulation() {
        populate();
        view.showStatus(0, field);
        simulate(simLength);
    }

    /**
     * Simulates a single time jump in the simulation
     */
    private void simulateOneStep() {
        
        if (currentStep % (simLength/4) == 0) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        /*
        // Original code:
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(Simulator.class.getName()).log(Level.SEVERE, null, ex);
        }
       
 
        Collections.shuffle(creatures, RandomGenerator.getRandom());
        for (int i = 0; i < creatures.size(); i++) {
            Creature creature = creatures.get(i);
            creature.act(field);
            }
        currentStep++;
        view.showStatus(currentStep, field);
        */
        
        
        
       if(show) System.out.println("___________________________________"+ (currentStep + 1 )+"___________________________________\t");
       if(show) show = false;
        Collections.shuffle(creatures, RandomGenerator.getRandom());
        for (int i = 0; i < creatures.size(); i++) {
            Creature creature = creatures.get(i);
            creature.act(field);
            if( !creature.isAlive() ) {
                show = true;
                System.out.print("Life: "+creature.isAlive() + "\t || Age: "+creature.age);
                if(field.getObjectAt(creature.getLocation()) != null){
                    System.out.print("\t Location: "+creature.getLocation() +"\t||\t"+ field.getObjectAt(creature.getLocation()));
                    if(creature instanceof Shark ){
                        Shark shark = (Shark) creature;
                        System.out.print("\t FoodLevel: "+ shark.foodLevel + "\t||\t"+ field.getObjectAt(creature.getLocation()));
                    }
                    if(creature instanceof Sardine){
                        Sardine sardine = (Sardine) creature;
                        System.out.print("\t FoodLevel: "+ sardine.foodLevel +"\t||\t"+ field.getObjectAt(creature.getLocation()));
                    }
                    field.place(null, creature.getLocation());
                }
                creatures.remove(i);
                i--;
                System.out.println();
            }
            
        }
        System.out.println(currentStep);
        if(currentStep > 145){
                if(creatures.isEmpty()) {
                    System.out.println("Creatures is empty");
                    field.clear();
                }
                else{
                    for(Creature Ecreature : creatures) System.out.println(Ecreature);
                }
            }
        currentStep++;
        view.showStatus(currentStep, field);
    }

    /**
     *
     * @param steps the number of time steps to go through
     */
    private void simulate(int numOfStep) {
//        while(currentStep < numOfStep) {
//            if (view.isViable(field) ) {
//                simulateOneStep();
//                System.out.println(currentStep);
//            } else {
//                break;
//            }
//        }
        
        
        for (int i = 0; i < numOfStep; i++) {
            if (view.isViable(field) ) {
                simulateOneStep();
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Simulator simulator = new Simulator(50, 50);
        simulator.startSimulation();
    }

}
