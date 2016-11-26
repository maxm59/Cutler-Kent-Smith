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
import byui.cit260.whereismybone.model.GameTime;
import byui.cit260.whereismybone.model.Scene;
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
    private int row;
    
    public MapView(){
        super("==================================================" +
                "\n Enter your desired location using the map symbol:");
    }
    
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();
        
        //System.out.println("DEBUG: User Chose: " + choice);
        if( this.movePlayerToLocation(choice))
            return true;
         
        //Check if the entry is valid
        if(choice.equals("PK")||choice.equals("VH")||choice.equals("K9")||choice.equals("AC")||choice.equals("AS")
                ||choice.equals("JB")||choice.equals("SE")||choice.equals("TM")||choice.equals("PD")||choice.equals("CA")
                ||choice.equals("SC")||choice.equals("SH")||choice.equals("HM")||choice.equals("DH")||choice.equals("SM")
                ||choice.equals("FM")||choice.equals("ZO")||choice.equals("EC")||choice.equals("GC")||choice.equals("TC")
                ||choice.equals("SF")||choice.equals("SL")||choice.equals("PG")||choice.equals("TE")||choice.equals("SK"))
        {
            //make a boolean statement true and false
            this.movePlayerToLocation(choice);

            return true;
        }
        else
        {
            System.out.println("\n***Invalid Selection*** Try again");
        }
        System.out.println("\n***Invalid Selection*** Try again");
            return false;
    }

    public void displayMap(){
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
                    if(location == WhereIsMyBone.getCurrentGame().getPlayer().getLocation()){                       
                        leftIndicator = "  >";
                        rightIndicator = "<  ";
                    }
                }
            mapLine = mapLine + " " + leftIndicator + location.getScene().getMapSymbol() + rightIndicator + " |";
            }

            System.out.println(mapLine);
        }
    }

    private boolean movePlayerToLocation(String choice) {
        Map map = WhereIsMyBone.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
            for(Location[] locArr : locations)
            {
                for(Location location: locArr)
                {
                    if (location == WhereIsMyBone.getCurrentGame().getPlayer().getLocation()){

                        System.out.println("You are already there. Try moving to a new location");
                    }
                    else
                    {
                        Scene symb = location.getScene();
                            if(symb.getMapSymbol().equals(choice))
                            {
                                int row = location.getRow();
                                int column = location.getCol();

                                //WhereIsMyBone.getCurrentGame().getPlayer().setLocation(loc);
                                MapControl.movePlayer(map, row, column);

                                double currentTime = WhereIsMyBone.getCurrentGame().getGameTime().getTimeRemaining();
                                double moveTime = symb.minute;
                                double newTime = GameTimeControl.calcNewGameTime(currentTime, moveTime);
                                GameTime gt = new GameTime();
                                gt.setTimeRemaining(newTime);

                                WhereIsMyBone.getCurrentGame().setGameTime(gt);                    
                            }

                        //WhereIsMyBone.getCurrentGame().getPlayer().setLocation(loc);
                        MapControl.movePlayer(map, row, column);

                        double currentTime = WhereIsMyBone.getCurrentGame().getGameTime().getTimeRemaining();
                        double moveTime = symb.minute;
                        double newTime = GameTimeControl.calcNewGameTime(currentTime, moveTime);
                        GameTime gt = new GameTime();
                        gt.setTimeRemaining(newTime);

                        WhereIsMyBone.getCurrentGame().setGameTime(gt);
                        return true;
                    }

                }
            }
        return false;
    }
}

 
