/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.model.Clue;
import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.Item;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Player;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick
 */
public class GameControl {

    public static Player createPlayer(Player player) {
        
        Game game = new Game(); //Create new game.
        WhereIsMyBone.setCurrentGame(game); //save in WhereIsMyBone
        
        game.setPlayer(player); //Save Player In Game
        
        //create the inventory list and save in the game.
        Item[] itemList = GameControl.createItemList();
        
        //create the clue list and save in the game.
        Clue[] clueList = GameControl.createClueList();
        
        //Create and initialize new map
        Map map = MapControl.createMap();
        game.setMap(map); //save map in game.
        
        //Move actors to starting positions in the map
        MapControl.moveActorsToStartingLocation(map);
              
        return player;
        
     }

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        game.setPlayer(player);
        
        Map map = new Map();
        game.setMap(map);
                
        WhereIsMyBone.setCurrentGame(game);
    }

    private static Item[] createItemList() {
        System.out.println("\n*** called createItemList() in GameControl ***");
        return null;
    }

    private static Clue[] createClueList() {
        System.out.println("\n*** called createClueList() in GameControl ***");
        return null;
    }
    
}
