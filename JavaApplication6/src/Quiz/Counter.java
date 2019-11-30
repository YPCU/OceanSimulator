/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ypche
 */
public class Counter implements Runnable{

    public Counter() {
    }

    @Override
    public void run() {
        for (int i =1 ; i<1000 ;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
}
