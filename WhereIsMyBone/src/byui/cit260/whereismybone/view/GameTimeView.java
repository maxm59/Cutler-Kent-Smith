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
public class GameTimeView extends View{
    
    public GameTimeView() {
        
    }

    @Override
    public void display() {
        double currentTime = WhereIsMyBone.getCurrentGame().getGameTime().getTimeRemaining();
        String currentLoc = WhereIsMyBone.getCurrentGame().getPlayer().getLocation().getName();
                
        this.console.println(
                "==================================================" +
                "\n Your current location is: " + currentLoc +
                "\n You have " + currentTime + " time left." +
                "\n==================================================" 
        );
    }
    
    public void displayWhenNull(){
                this.console.println(
                "==================================================" +
                "\n  " +
                "\n==================================================");
    }

    @Override
    public boolean doAction(String value) {
        //do nothing
        return true;
    }
}
