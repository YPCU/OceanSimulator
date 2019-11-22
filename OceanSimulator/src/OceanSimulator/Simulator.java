/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OceanSimulator;

import java.awt.*;
import java.util.ArrayList;
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
    private ArrayList<Creature> creatures;
    private Field currentField;

    private Random rand;

    private Simulator(int row, int col) {
        RandomGenerator.initialiseWithSeed(4);
        rand = RandomGenerator.getRandom();
        creatures = new ArrayList<Creature>();
        if (row > 0 && col > 0) {
            field = new Field(row, col);
        } else {
            field = new Field(ModelConstants.DEFAULT_DEPTH, ModelConstants.DEFAULT_WIDTH);
        }
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
                if (probability < ModelConstants.SHARK_CREATE_PROB) {
                    field.place(new Shark(), i, j);
                    creatures.add(new Shark());
                } else if (probability < ModelConstants.PLANKTON_CREATE_PROB) {
                    field.place(new Plankton(), i, j);
                    creatures.add(new Plankton());
                } else if (probability < ModelConstants.SARDINE_CREATE_PROB) {
                    field.place(new Sardine(), i, j);
                    creatures.add(new Sardine());
                } else {
                }
            }
        }

    }

    private void startSimulaion() {
        populate();
        simulatorView.showStatus(0, field);
    }

    private void simulateOneStep() {
        for (Creature creature : creatures) {
            creature.act();
        }
    }

    private void simulate(int numOfStep) {
        for (int i = 0; i < numOfStep; i++) {
            if (!simulatorView.isViable(field)) {
                break;
            }
            simulateOneStep();
        }
    }

}
