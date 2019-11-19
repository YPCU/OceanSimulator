/**
 * Simple class to test random number generator properties
 *
 * Copyright (c) Ian T. Nabney 2002
 */

import java.util.Random;

public class TestRan {
    public static void main(String[] args) {
        final int SIZE = 5;
        double[] a = new double[SIZE];
        Random gen = new Random(42);

        // Generate random doubles
        // we can't use a for each loop here -- Why?
        for (int i = 0; i < SIZE; ++i) {
            a[i] = gen.nextDouble();
        }
		
        // and print them out using a for each loop
        for (double element : a) {
            System.out.println(element);
        }
    }
}