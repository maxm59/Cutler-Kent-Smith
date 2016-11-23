/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick
 */
public class GameTimeView{
    
    public GameTimeView() {
        
    }

    public void display() {
        double currentTime = WhereIsMyBone.getCurrentGame().getGameTime().getTimeRemaining();
                
        System.out.println(
                "==================================================" +
                "\n You have " + currentTime + " time left." +
                "\n==================================================" 
        );
    }
    
    public void displayWhenNull(){
                System.out.println(
                "==================================================" +
                "\n  " +
                "\n==================================================");
    }
    
}
