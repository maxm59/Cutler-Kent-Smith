/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import java.io.Serializable;

/**
 *
 * @author Smith-Rick
 * 
 * Used to contain the game time object. 
 * Starts at 24 hours. It can be reduced by hole numbers or fractions of a 
 *  number, which is why we use a Double vs an Integer.
 */


public class GameTime implements Serializable{
    
private Double timeRemaining;

    public GameTime(){
        
    }

    public Double getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(Double timeRemaining) {
        this.timeRemaining = timeRemaining;
    }
    
}
