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
public class SaveGameView extends View{
    
    public SaveGameView(){
         super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +
                "\n  SAVE GAME:                                      " +
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
                this.console.println("\n*** Saving to Space A ***");
                break;
            case "B":
                this.console.println("\n*** Saving to Space B ***");
                break;
            case "C":
                this.console.println("\n*** Saving to Space C ***");
                break; 
            default:
                this.console.println("\n***Invalid Selection*** Try again");
                break; 
                
        }
        return false;  
    }
    
}
