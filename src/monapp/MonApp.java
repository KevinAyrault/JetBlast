/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monapp;

/**
 *
 * @author Valentin
 */
public class MonApp {
    
  private static int i = 0;
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Lapin lapin=new Lapin("Roger",20);
        System.out.println("Hello World");
        System.out.println("Et ta mère");
        while(i <= 10){
            lapin.Crier();
            System.out.println("crier");
            i++;
        }
    }
    
  
    
}
