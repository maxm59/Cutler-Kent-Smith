/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.MapControl;
import byui.cit260.whereismybone.control.GameTimeControl;

import byui.cit260.whereismybone.model.Location;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.GameTime;
import byui.cit260.whereismybone.model.Scene;
import byui.cit260.whereismybone.model.SceneType;
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

    private int column;
    
    //private final String map;
    //private String promptMessage; 
    
    public MapView(){
        super("==================================================" +
                "\n Enter your desired location using the map symbol:");
    }
    
    @Override
    public boolean doAction(String choice)
    {
        
        choice = choice.toUpperCase();
        
        //System.out.println("DEBUG: User Chose: " + choice);
        
        //Check if the entry is valid
        if(choice.equals("PK")||choice.equals("VH")||choice.equals("K9")||choice.equals("AC")||choice.equals("AS")
                ||choice.equals("JB")||choice.equals("SE")||choice.equals("TM")||choice.equals("PD")||choice.equals("CA")
                ||choice.equals("SC")||choice.equals("SH")||choice.equals("HM")||choice.equals("DH")||choice.equals("SM")
                ||choice.equals("FM")||choice.equals("ZO")||choice.equals("EC")||choice.equals("GC")||choice.equals("TC")
                ||choice.equals("SF")||choice.equals("SL")||choice.equals("PG")||choice.equals("TE")||choice.equals("SK"))
        {
            
            this.movePlayerToLocation(choice);

            return true;
        }
        else
        {
            System.out.println("\n***Invalid Selection*** Try again");
        }
        
        return false;
    }
    

//    @Override
//    public boolean doAction(String value) {
//        value = value.toUpperCase();
////        Game game = WhereIsMyBone.getCurrentGame(); //retreive the game
////        Map map = game.getMap(); //get the map from the game.
////        
////        Location[][] locations = map.getLocations(); // get the locations from the map.
//        
//        Location[][] locations = WhereIsMyBone.getCurrentGame().getMap().getLocations();
//                        
//        for (int row = 0; row < locations.length; row++){
//            for (int column = 0; column < locations[row].length; column++) {
//                if (locations[row][column].getScene() != null) {   
//                    if (value.equals(locations[row][column].getScene().getMapSymbol())){
//                         MapControl.movePlayer(map, row, column);
//                         return true;
//                    }
//                }
//            }
//        System.out.println("\n*** Invalid selection *** Try Again later");
//        }
//        return false;
//   }
        
    public void displayMap(){
        
        //System.out.println("DEBUG: ENTERING DISPLAY MAP");
         
        //Game game = WhereIsMyBone.getCurrentGame();
        Map map = WhereIsMyBone.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();

        String header = "      0     |     1    |     2    |    3     |    4     |";
        System.out.println(header);

        String leftIndicator;
        String rightIndicator;
        
        for (int row = 0; row < locations.length; row++){

            String mapLine = row + "|";
            //System.out.println(row + "   ");

            for (Location location : locations[row]) {

                leftIndicator = "  ";
                rightIndicator = "  ";
                
                if (location.getScene() == null) {
                    leftIndicator = "  ";
                    rightIndicator = "  ";
                    
                    System.out.println(leftIndicator + "??" + rightIndicator);
                } 
                else {
                                        
                    //isVisited is currently not working. Leaving the indicators blank for now.
                    if(location.isVisited()){
                        leftIndicator = "   ";
                        rightIndicator = "   ";
                        
                        }
                    if(location == WhereIsMyBone.getCurrentGame().getPlayer().getLocation())
                    {                       
                        leftIndicator = "  >";
                        rightIndicator = "<  ";
                    }
                }

//            System.out.println(leftIndicator + location.getScene().getMapSymbol() + rightIndicator);
            mapLine = mapLine + " " + leftIndicator + location.getScene().getMapSymbol() + rightIndicator + " |";
            }

            System.out.println(mapLine);
        }
    }

    private void movePlayerToLocation(String choice) {
        
        System.out.println("DEBUG: Move Player to: " + choice);
        
        
        Map map = WhereIsMyBone.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        
        //Player player = WhereIsMyBone.getPlayer().getLocation()
        //String currentLocation = WhereIsMyBone.getCurrentGame().getPlayer().getLocation().getScene().getMapSymbol();
                
        //Check if we are trying to go where we arleaedy are
        //if (currentLocation != null){
            //check if location is not set.
//            if (choice == currentLocation)
//            {
//                System.out.println("\n*** Invalid selection *** You are already at that location");
//
//            }
//            else
//            {
                //Loop through all the locations. 
                for(Location[] locArr : locations)
                {
                    for(Location location: locArr)
                    {
                        Scene symb = location.getScene();
                        if(symb.getMapSymbol().equals(choice))
                        {

                            int row = location.getRow();
                            int column = location.getCol();

//                            System.out.println("DEBUG: Attempting to move player to: " 
//                                + choice +" at " + row + "," + column);
//                            
                            //WhereIsMyBone.getCurrentGame().getPlayer().setLocation(loc);
                            MapControl.movePlayer(map, row, column);
//                            System.out.println("\n*** DEBUG MapControl.movePlayer *** " + map);
//                            System.out.println("\n*** DEBUG MapControl.movePlayer *** " + row);
//                            System.out.println("\n*** DEBUG MapControl.movePlayer *** " + column);
//                            
                            //MapControl.movePlayer(map, location);
                            
                            double currentTime = WhereIsMyBone.getCurrentGame().getGameTime().getTimeRemaining();
                            double moveTime = symb.minute;
                            double newTime = GameTimeControl.calcNewGameTime(currentTime, moveTime);
                            GameTime gt = new GameTime();
                            gt.setTimeRemaining(newTime);
                            
                            WhereIsMyBone.getCurrentGame().setGameTime(gt);
                            
//                            //For Debugging
//                            String test = WhereIsMyBone.getCurrentGame().getPlayer().getLocation().getName();
//                            System.out.println("DEBUG: Player now at: " + test);
//                            
                        }

                    }
                }
//            }
                       
//        }
//        else{
//            System.out.println("\n*** ERROR: Players current lcoation is null."); 
//        }
        
    }
}

 