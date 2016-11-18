/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.MapControl;
import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.Location;
import byui.cit260.whereismybone.model.Map;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick
 */
public class MapView extends View {
    
    //private final String map;
    private String promptMessage;
    
    public MapView(){
        super("\n"+
                "\n==================================================" +
                "\n Enter your desired location" +
                "\n==================================================" );
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        Game game = WhereIsMyBone.getCurrentGame(); //retreive the game
        Map map = game.getMap(); //get the map from teh game.
        Location[][] locations = map.getLocations(); // get the locations from the map.
        
        for (int row = 0; row < locations.length; row++){
          for (int column = 0; column < locations[row].length; column++) {
               if (locations[row][column].getScene() != null) {               
                    if (value.equals(locations[row][column].getScene().getMapSymbol())) {
                         MapControl.movePlayer(map, row, column);
                         return true;
                    }
                 }
            }
     }
     System.out.println("\n*** Invalid selection *** Try Again later");
     return false;
   }
}
