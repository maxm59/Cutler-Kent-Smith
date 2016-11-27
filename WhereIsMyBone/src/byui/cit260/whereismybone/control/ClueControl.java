/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;
import byui.cit260.whereismybone.model.Clue;
import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.GameTime;
import byui.cit260.whereismybone.model.Map;
import whereismybone.WhereIsMyBone;
/**
 *
 * @author Brian Kent
 * 
 */
public class ClueControl {
    
    public ClueControl(){
                
    }
    
    public static void createNewClue (String description) {
        
        //clue.setClue(description);
        
        //Map map = new Map();
        Map map = MapControl.createMap();
        game.setMap(map);
        
        
//        System.out.println("\n*** Create New Game *** " + map.getCurrentLocation().getName());
        
        game.getPlayer().setLocation(map.getCurrentLocation());  
        
//        System.out.println("\n*** Create New Game *** " + map.getCurrentLocation().getName());
                
        //GameTime gt = new GameTime();
        GameTime gt = GameControl.createGameTime();
        game.setGameTime(gt);

        WhereIsMyBone.setCurrentGame(game);
        
        
    }
    
    public static void ClueLog (String description){
        
    }
    
    
}
