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
public class GameOverView extends View{
    
    public GameOverView(){
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
                "\n      -= GAME OVER - YOU RAN OUT OF TIME =-       " +
                "\n                                                  " +         
                "\n==================================================" +
                "\n  Please Q to quit.                               " +
                "\n=================================================="  ); 
        
    }

    @Override
    public boolean doAction(String choice) {
           
        choice = choice.toUpperCase();
        
        switch (choice) {
            
            case "Q":
                System.exit(0);
                break;
            default:
                this.console.println("\n***Invalid Selection*** Try again");
                break; 
                
        }
        return false;  
    }
    
}
