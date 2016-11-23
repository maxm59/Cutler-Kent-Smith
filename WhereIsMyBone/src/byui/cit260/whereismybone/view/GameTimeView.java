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
    
    private double currentTime = WhereIsMyBone.getCurrentGame().getGameTime().getTimeRemaining();

    public GameTimeView() {
        
    }

    public void display() {
                
        System.out.println(
                "==================================================" +
                "\n You have " + currentTime + " time left." +
                "\n==================================================" 
        );
    }
    
}
