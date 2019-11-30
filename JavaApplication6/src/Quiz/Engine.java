/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author ypche
 */
public class Engine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread CounterThread = new Thread(new Counter());
        Thread keyboardReaderThread = new Thread(new KeyboardReader());
        CounterThread.start();
        keyboardReaderThread.start();
        while (keyboardReaderThread.isAlive())
        {
            
        }
        System.out.println("Done.");
        if(CounterThread.isAlive()){
            CounterThread.stop();
        }
        
    }
    
}
