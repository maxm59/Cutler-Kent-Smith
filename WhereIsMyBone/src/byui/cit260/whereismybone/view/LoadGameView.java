/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import byui.cit260.whereismybone.control.GameControl;
import java.util.Scanner;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick
 * 
 */
public class LoadGameView extends View{
    
    public LoadGameView(){
         super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n  LOAD GAME:                                      " +
                "\n    Enter the file path where you want to save:   " + 
                "\n                                                  " +         
                "\n==================================================" +
                "\n                   " +
                "\n=================================================="  ); 
        
    }

    @Override
    public boolean doAction(String filePath) {
           
        filePath = filePath.toUpperCase();
                
        try{
            
            GameControl.getSaveGame(filePath);
            
            return true;
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Load Game Error: " + ex.getMessage());
        }
        return false;  
    }
    
}
