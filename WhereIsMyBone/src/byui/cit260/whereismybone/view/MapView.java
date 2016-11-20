/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.MapControl;
import byui.cit260.whereismybone.model.Location;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Game;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick-originator
 *    this a code to move player
 * 
 * @author Maxi Cutler-originator
 *    insert code to display map
 * 
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
        Map map = game.getMap(); //get the map from the game.
        Location[][] locations = map.getLocations(); // get the locations from the map.
        
        for (int row = 0; row < locations.length; row++){
            for (int column = 0; column < locations[row].length; column++) {
                if (locations[row][column].getScene() != null) {   
                    if (value.equals(locations[row][column].getScene().getMapSymbol())){
                         MapControl.movePlayer(map, row, column);
                         return true;
                    }
                }
            }
    System.out.println("\n*** Invalid selection *** Try Again later");
    }
    return false;
   }
        
    public void displayMap(){
        String leftIndicator;
        String rightIndicator;
        
            Game game = WhereIsMyBone.getCurrentGame();
            Map map = game.getMap();
            Location[][] locations = map.getLocations();

        try{
            this.console.print("   |");

            for(int column = 0; column < locations[0].length; column++){
                this.console.print("   " +column + "   |");
            }
            this.console.println();
            int row = 0;

            for(int = 0, row < locations.length, row++){
                this.console.print(row + "   ")

                for(int column = 0; column < locations[row].length; column++){
                    leftIndicator = "   ";
                    rightIndicator = "   ";

                    if(locations[row][column] == map.getCurrentLocation()){
                        leftIndicator = " X ";
                        rightIndicator = " X ";

                            else if (locations[row][column].isVisited()){
                                leftIndicator = " X ";
                                rightIndicator = " X ";
                                this.console.print("   |");

                                if(locations[row][column].getScene()== null)
                                    this.console.print(leftIndicator + "? ?" + rightIndicator);
                                    else{
                                    this.console.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
                                    }
                                this.console.prinlin("|");
                            }
                            finally(Exception e){
                        System.out.printlin("Error");
                        };
                    }
                }
            }
        }
    }
}
