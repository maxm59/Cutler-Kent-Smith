/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.MapControl;
import byui.cit260.whereismybone.control.GameTimeControl;
import byui.cit260.whereismybone.exception.MapControlException;
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
         
        //Check if the entry is valid
        if(choice.equals("PK")||choice.equals("VH")||choice.equals("K9")||choice.equals("AC")||choice.equals("AS")
                ||choice.equals("JB")||choice.equals("SE")||choice.equals("TM")||choice.equals("PD")||choice.equals("CA")
                ||choice.equals("SC")||choice.equals("SH")||choice.equals("HM")||choice.equals("DH")||choice.equals("SM")
                ||choice.equals("FM")||choice.equals("ZO")||choice.equals("EC")||choice.equals("GC")||choice.equals("TC")
                ||choice.equals("SF")||choice.equals("SL")||choice.equals("PG")||choice.equals("TE")||choice.equals("SK"))
        {
                try{
                    //make a boolean statement true and false
                    this.movePlayerToLocation(choice);
                }
                catch(Exception ex){
                    ErrorView.display(this.getClass().getName(), 
                            "Error getting player name");              
                }

            return true;
        }
        else
        {
            this.console.println("\n***Invalid Selection*** Try again");
        }
        return false;
    }

    public void displayMap(){
        Map map = WhereIsMyBone.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();

        String header = "      0     |     1    |     2    |    3     |    4     |";
        this.console.println(header);

        String leftIndicator;
        String rightIndicator;
        
        for (int row = 0; row < locations.length; row++){

            String mapLine = row + "|";

            for (Location location : locations[row]) {
                leftIndicator = "  ";
                rightIndicator = "  ";
                if (location.getScene() == null) {
                    leftIndicator = "  ";
                    rightIndicator = "  ";
                    
                    this.console.println(leftIndicator + "??" + rightIndicator);
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

            this.console.println(mapLine);
        }
        
        this.console.println("\nPlease press <ENTER> to return to the menu.");
        this.waitForEnter();
    }
    
    private void waitForEnter()
    {
        boolean isValidEnter = false;
        String input = null;

        try{
            while (!isValidEnter){
                input = this.keyboard.readLine();

                //Name validation
                if(input.length() >= 0)
                {
                    isValidEnter = true;
                }
                else{
                 this.console.println("Please press <ENTER>.");
                }
                break;
            }            
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }
        
    }

    private boolean movePlayerToLocation(String choice) throws MapControlException {
        
        boolean result = false;
        
        Map map = WhereIsMyBone.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        try{
            for(Location[] locArr : locations)
            {
                for(Location location: locArr)
                {
                    if (location == WhereIsMyBone.getCurrentGame().getPlayer().getLocation()){

                        this.console.println("You are already at " + 
                                WhereIsMyBone.getCurrentGame().getPlayer().getLocation().getName()
                                + ". Try moving to a new location");
                    }
                    else
                    {
                        Scene symb = location.getScene();
                        this.console.println("DEBUG: Scene = " + symb.getMapSymbol());
                        this.console.println("DEBUG: Choice = " + choice);
                            if(symb.getMapSymbol().equals(choice))
                            {
                                this.console.println("DEBUG: Its a match.");
                                
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
                                
                                result = true;
                                return result;
                            }

                    }

                }
            }
        }
        catch(Exception ex){
                                    
            throw new MapControlException("ERROR: There was a problem with create Map.");
        }
        return result;
    }
}

 
