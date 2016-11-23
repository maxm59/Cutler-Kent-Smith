/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import java.util.Scanner;

/**
 *
 * @author Smith-Rick
 */
public class LoadGameView extends View{
    
    public LoadGameView(){
         super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n==================================================" +
                "\n                                                  " +
                "\n  LOAD GAME:                                      " +
                "\n                                                  " +
                "\n    A) EMPTY" +
                "\n    B) EMPTY" +
                "\n    C) EMPTY" +
                "\n                                                  " +   
                "\n    X) Go Back                                    " +   
                "\n                                                  " +         
                "\n==================================================" +
                "\n  Please enter your choice: ____                  " +
                "\n=================================================="  ); 
        
    }

    @Override
    public boolean doAction(String choice) {
           
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A": 
                System.out.println("\n*** Loading from Space A ***");
                break;
            case "B":
                System.out.println("\n*** Loading from Space B ***");
                break;
            case "C":
                System.out.println("\n*** Loading from Space C ***");
                break;
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break; 
                
        }
        return false;  
    }
    
}
