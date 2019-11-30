/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.util.Scanner;

/**
 *
 * @author ypche
 */
public class KeyboardReader implements Runnable {
    
    private Scanner scanner;

    public KeyboardReader() {
         scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        while(!scanner.next().equals("s")){
            
        }
    }
    
}
