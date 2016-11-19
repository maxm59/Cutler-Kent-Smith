/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.model.Actor;
import byui.cit260.whereismybone.model.Item;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Scene;
import byui.cit260.whereismybone.model.SceneType;

/**
 *
 * @author Rick Smith
 */
public class MapControl {

    public static Map createMap() {
        
        //create the map
        Map map =   new Map (5, 5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);        

        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n*** called moveActorsToStartingLocation() in MapControl ***");
        //movePlayer(map, 2, 2;
        movePlayer(map,0,0);
    }

    public static void movePlayer(Map map, int row, int column) {
        System.out.println("\n*** called movePlayer() in MapControl ***");
//        map.setCurrentLocation(map.getLocations()[row][column]);
//        map.getCurrentLocation().setVisited(true);
//        
//        map.setCurrentRow(row);
//        map.setCurrentColumn(column);
                        
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
    
        //location 0,0
        Scene currentScene = new Scene();
        currentScene.setName("ParkLand");
        currentScene.setMapSymbol("PK");      
        currentScene.setDescription("A beautiful city park with mature oak trees, grass, and picnic tables.");
        currentScene.setDialog("I saw Cat DeVil and he went that way.");
        currentScene.setActor(Actor.Tommy);
        currentScene.setItem(Item.CatColar);
        currentScene.setMinute(5);
        
        scenes[SceneType.Parkland.ordinal()] = currentScene;
        
        //location 0,1
        currentScene = new Scene();
        currentScene.setName("VacantHouse");
        currentScene.setMapSymbol("VH");      
        currentScene.setDescription("An old abandon house, very creepy.");
        currentScene.setDialog("You think my bone must be hear. I can smell it.");
        currentScene.setActor(Actor.Rats);
        currentScene.setItem(Item.CatColar); //TODO finsih Brian's list
        currentScene.setMinute(5);
        
        scenes[SceneType.AnimalCare.ordinal()] = currentScene;
        
        // TODO make sure all the scenes are added
        
        return scenes;
    }
    
    public boolean validLocation(int row,int column){
        if (row < 1 || row > 5) {
                return false;
        }
        
        if (column < 1 || column >  5) {
                return false;
        }
        
        return true;
    }
    
    public int[] movePlayer(int nRow, int nCol)
    {
       if(!validLocation(nRow, nCol))
       {
           //int[] resultFail = null;
           return null;
       }
       
       int[] newLoc = {nRow, nCol};
       return newLoc;
       
    }
    
}
