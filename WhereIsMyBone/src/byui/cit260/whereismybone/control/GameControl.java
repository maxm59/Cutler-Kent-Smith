/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.model.Clue;
import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.GameTime;
import byui.cit260.whereismybone.model.Item;
import byui.cit260.whereismybone.model.Location;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Player;
import byui.cit260.whereismybone.model.Scene;
import byui.cit260.whereismybone.model.SceneType;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick - originaltoe
 * @author Maxi Cutler - update get classes from 
 * MapControl and added location coordinates
 * 
 */
public class GameControl {

    public static Player createPlayer(Player player) {
        
        Game game = new Game(); //Create new game.
        WhereIsMyBone.setCurrentGame(game); //save in WhereIsMyBone
        
        
        //Create GameTime in game.
        GameTime gameTime = GameControl.createGameTime();
        game.setGameTime(gameTime);
        
        //create the inventory list and save in the game.
        Item[] itemList = GameControl.createItemList();
        
        //create the clue list and save in the game.
        Clue[] clueList = GameControl.createClueList();
        
        //Create and initialize new map
        Map map = MapControl.createMap();
        game.setMap(map); //save map in game.
                
        //Move actors to starting positions in the map
        MapControl.moveActorsToStartingLocation(map); 
        
        Location location = new Location();
        location.setRow(2);
        location.setCol(2);
        player.setLocation(location);
        
        game.setPlayer(player); //Save Player In Game
        
        return player;
        
     }

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        game.setPlayer(player);
        
        //Map map = new Map();
        Map map = MapControl.createMap();
        game.setMap(map);
        
        //GameTime gt = new GameTime();
        GameTime gt = GameControl.createGameTime();
        game.setGameTime(gt);
                
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

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.Parkland.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.VacantHouse.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.K9Precinct.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.AnimalCare.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.AnimalShelter.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.JonesBakery.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.SeafoodEatery.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.TexMixDriveInn.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.Pond.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.CatsAlley.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.SeniorCare.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.SmithHouse.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.Home.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.DeVilHouse.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.SuperMax.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.Fishmonger.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.Zoo.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.ElephantsCage.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.GiraffesCage.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.TigerCage.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.SchoolFront.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.SchoolCafe.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.PlayGround.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.TrumpElementry.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.SteakHeaven.ordinal()]);
    }

    private static GameTime createGameTime() {
        System.out.println("\n*** called createGameTime() in GameControl ***");
        
        GameTime gameTime = new GameTime();
        gameTime.setTimeRemaining(24.0);
                
        System.out.println("\n***DEBUG: Time remaining is: "+ gameTime.getTimeRemaining() +"  ***");
        
        return gameTime;
    }
    
}
