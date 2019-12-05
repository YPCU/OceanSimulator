/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ocean;

import GUIandConstant.ModelConstants;
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
    private final int simLength = ModelConstants.getSIM_LENGTH();

//    private final int simLength = 17;

    public Simulator(int row, int col) {
        RandomGenerator.initialiseWithSeed(44);
        Random rand = RandomGenerator.getRandom();

        creatures = new ArrayList<Creature>();
        if (row > 0 && col > 0) {
            field = new Field(row, col);
        } else {
            field = new Field(ModelConstants.getDEFAULT_DEPTH(), ModelConstants.getDEFAULT_WIDTH());
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
        double sharkProb = ModelConstants.getSHARK_CREATE_PROB();
        double sardineProb = ModelConstants.getSARDINE_CREATE_PROB();
        double planktonProb = ModelConstants.getPLANKTON_CREATE_PROB();

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
        
        
        int stopTime = 0;
        if (stopTime != 0 && currentStep % (simLength/stopTime) == 0) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       

        ReinitialiseField(field);
        

       
        Collections.shuffle(creatures, RandomGenerator.getRandom());
        for (int i = 0; i < creatures.size(); i++) {
            Creature creature = creatures.get(i);
            creature.act(field);
            
            tellCreature(creature);
            
        }
        creatures.clear();
        for (int row = 0 ; row < field.getWidth() ; row ++){
            for (int col = 0 ; col < field.getDepth() ; col ++)
            {
                if (field.getObjectAt(row, col) != null)
                {
                    creatures.add(field.getObjectAt(row, col));
                }
            }
        }
        
        creatures.removeIf(n -> (n.isAlive() == false));
        
        currentStep++;
        view.showStatus(currentStep, field);
    }

    
    
    
    
    
    /**
     *
     * @param steps the number of time steps to go through
     */
    private void simulate(int numOfStep) {
        
        for (int i = 0; i < numOfStep; i++) {
            if (view.isViable(field) ) {
                simulateOneStep();
            } else {
                break;
            }
        }
    }

    
    /*
    
    */
    private void ReinitialiseField(Field field){
        field.clear();
        for(Creature creature : creatures){
            field.place(creature, creature.getLocation());
        }
        
    }
    
   
    
    private void tellCreature(Creature creature) {
        int maxAge = 0;
        boolean eat = false;
        String type = "";
        if (creature instanceof Sardine) {
            maxAge = ModelConstants.getSARDINE_MAX_AGE();
            eat = true;
            type = "Sardine";
        } else if (creature instanceof Shark) {
            maxAge = ModelConstants.getSHARK_MAX_AGE();
            eat = true;
            type = "Shark";
        } else if (creature instanceof Plankton) {
            if (creature instanceof Plankton) {
                maxAge = ModelConstants.getPLANKTON_MAX_AGE();
                eat = true;
                type = "Plankton";
            }
        } else {
            System.out.print("Error. \n");
            return;
        }
        if (!creature.isAlive) {
            boolean reason = false;
            if (creature.age < maxAge) {
                System.out.print("Too old. \t");
                reason = true;
            }
            if (eat) {
                if (type.equals("Sardine")) {
                    Sardine sardine = (Sardine) creature;
                    if (sardine.foodLevel <= 0) {
                        System.out.print("\t FoodLevel: " + sardine.foodLevel);
                        reason = true;
                    }

                } else if (type.equals("Shark")) {
                    Shark shark = (Shark) creature;
                    if (shark.foodLevel <= 0) {
                        System.out.print("\t FoodLevel: " + shark.foodLevel);
                        reason = true;
                    }
                }
            }
            if (field.getObjectAt(creature.getLocation()) != null) {
                System.out.print("Too crowded. \t");
                reason = true;
            }
            if (!reason) {
                System.out.println("___________________Mistake_______________");
                System.out.print(currentStep);
            }
            System.out.println();

        }

        
    }
    
    public static void main(String[] args) {
        Simulator simulator = new Simulator(100, 100);
        simulator.startSimulation();
        System.out.println("Done");
    }

}
