package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.model.Clue;
import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.GameTime;
import byui.cit260.whereismybone.model.BackpackItem;
import byui.cit260.whereismybone.model.Location;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Player;
import byui.cit260.whereismybone.model.Scene;
import byui.cit260.whereismybone.enums.SceneType;
import byui.cit260.whereismybone.exception.GameControlException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick - originaltoe
 * @author Maxi Cutler - update get classes from 
 * MapControl and added location coordinates
 * 
 */
public class GameControl {

    //Default constructor
    public GameControl(){
    }
    
    public static void getSaveGame(String filePath) 
        throws GameControlException {
        
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();//read the game object from file

            
        }
        catch(Exception ex){
            
            throw new GameControlException("ERROR: THere was a problem with "
                    + "getting saved game");
        }
        
        //close the output file
        WhereIsMyBone.setCurrentGame(game);
        
    }
    
    public static void saveGame(Game currentGame, String filePath) 
        throws GameControlException{
        
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            //Write the game to the file
            output.writeObject(currentGame); //write the game object out to file
            
            output.close();
            
        }
        catch(Exception ex){
            throw new GameControlException("ERROR: THere was a problem with " + 
                    "saving the game.");
        }
                
    }
        
    public static void createNewGame(Player player) throws GameControlException
    {
        
        Game game = new Game();
        try{
            game.setPlayer(player);
        
            //Map map = new Map();
            Map map = new Map();
            map = MapControl.createMap();
            game.setMap(map);

            game.getPlayer().setLocation(map.getCurrentLocation());  

            GameTime gt = GameControl.createGameTime();
            game.setGameTime(gt);
            
            List<Clue> lC = new ArrayList<Clue>(); //selects various clues for the list
            game.setClueList(lC);
     
        }
        catch(Exception ex){                      
            throw new GameControlException("ERROR: THere was a problem with " + 
                    "creating new game.");
        }
        WhereIsMyBone.setCurrentGame(game);
    }

    public static Player createPlayer(String name) throws GameControlException {
        if (name == null){
            return null;
        }
        Player player = new Player();
        try{
            player.setName(name);
        }
        catch(Exception ex){
            
            throw new GameControlException("ERROR: THere was a problem with " + 
                    "creating Player.");
        }
        return player;
     }

    private static BackpackItem[] createItemList() {
        return null;
    }

    private static Clue[] createClueList() {
        return null;
    }
    
    public static void assignScenesToLocations(Map map, Scene[] scenes) throws GameControlException {
        Location[][] locations = map.getLocations();
        try{
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
        catch(Exception ex){
            throw new GameControlException("ERROR: THere was a problem with " + 
                    "assigning scenes to lcoation");
        }
    }

    private static GameTime createGameTime() throws GameControlException {
        GameTime gameTime = new GameTime();
        try{
            gameTime.setTimeRemaining(24.0);
        }            
        catch(Exception ex){
            
            throw new GameControlException("ERROR: THere was a problem with " + 
                    "creating gametime.");
        }            
        return gameTime;
    }
    
}
