/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.model.Player;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null)
        {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        WhereIsMyBone.setPlayer(player); //save the player
        
        return player;
        
     }
    
}
