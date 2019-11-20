/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.awt.*;
import java.util.Random;

/**
 *
 * @author 180127003
 */
public class Simulator {

    /**
     *
     * Initialise creatures, field and its view. They are created once here and
     * passed to the parts that need them so there is only one copy of each.
     */
    private SimulatorView simulatorView;
    private Field field;


    private Random rand;

    public static final double PLANKTON_CREATE_PROB = 0.3;
    public static final double SARDINE_CREATE_PROB = 0.4;
    public static final double SHARK_CREATE_PROB = 0.2;

    private Simulator(int row, int col) {
        RandomGenerator.initialiseWithSeed(4);
        rand = RandomGenerator.getRandom();
        field = new Field(row, col);
        simulatorView = new SimulatorView(row, col);
        simulatorView.setColor(Plankton.class, Color.green);
        simulatorView.setColor(Sardine.class, Color.orange);
        simulatorView.setColor(Shark.class, Color.red);

    }

    public static void main(String[] args) {
        Simulator simulator = new Simulator(50, 50);
        simulator.startSimulaion();
    }

    /**
     * populate the field. Notice the probability must go from low to high, if
     * using else if structure.
     *
     */
    private void populate() {
        field.clear();
        for (int i = 0; i < field.getDepth(); i++) {
            for (int j = 0; j < field.getWidth(); j++) {
                double probability = rand.nextDouble();
                 if (probability < SHARK_CREATE_PROB) {
                    field.place(new Shark(), i, j);
                } 
                else if (probability < PLANKTON_CREATE_PROB) {
                    field.place(new Plankton(), i, j);
                } 
                else if (probability < SARDINE_CREATE_PROB) {
                    field.place(new Sardine(), i, j);
                } else {
                }
            }
        }

    }

    private void startSimulaion() {
        populate();
        simulatorView.showStatus(0, field);
    }

}
