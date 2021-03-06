package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ClueControl;
import byui.cit260.whereismybone.exception.ClueControlException;
import byui.cit260.whereismybone.exception.MapControlException;
import byui.cit260.whereismybone.model.Clue;
import byui.cit260.whereismybone.model.Location;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Player;
import byui.cit260.whereismybone.model.Scene;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick
 * 
 * 12.3.16 Maxi:Clue list 
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class GameMenuView extends View{

    public GameMenuView(){
        super(
                  "==================================================" +
                "\n                WHERE IS MY BONE?                 " +
                "\n                    GAME MENU                     " +
                "\n==================================================" +                      
                "\n                                                  " +
                "\n         A   =  Backpack Inventory List           " +     
                "\n         B   =  Display Clue Log                  " +
                "\n         C   =  Search Location for Clues         " +
                "\n         D   =  Display Map                       " +                                               
                "\n         M   =  Move Player                       " + 
                "\n                                                  " +                                              
                "\n         P   =  Print Menu                        " +
                "\n         H   =  Help Menu                         " + 
                "\n         X   =  Exit Game                         " +
                "\n                                                  " +
                "\n         Please make a selection:                 " +
                "\n                                                  ");      
    }

    @Override
    public boolean doAction(String value) {
        
        char charSel = value.toUpperCase().charAt(0);
   
        switch (charSel) { 
            case 'A':
                this.showBackpack();
                break;
            case 'B':
                this.showClueList();
                break;
            case 'C': {
                    try {
                      this.searchLocation(); //search location of clues TODO
                    } catch (ClueControlException ex) {
                        Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 'D':
                 this.showMap();      
                 this.waitForEnter();
                 break;
            case 'M':
                this.movePlayer();
                break;
            case 'P':  
                this.showPrintMenu();
                break;
//
//            case 'T': //Temporary display of Complex Calculation for testing
//                this.displayComplexCalculationView();
//                break;
            case 'H':
                this.showHelpMenu();
                break;
            case 'X':
                return true;
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    //Maxi's
    private void showBackpack() {
        BackpackView backpackView = new BackpackView();
        backpackView.display();
    }

    private void showClueList() {
        this.displayClueLog();
        this.waitForEnter();
    }    
    //Brian's
    private void searchLocation() throws ClueControlException
    {
        //Get the Clue for that location
        Map map = WhereIsMyBone.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        Player player = WhereIsMyBone.getCurrentGame().getPlayer();
        try{
            for(Location[] locArr : locations)
            {
                for(Location location: locArr)
                {
                    
                    if (location == player.getLocation()){

                        Scene sc = location.getScene();
                        
                        //Check if Scene clue retrieved
                        Clue c = sc.getClue();
                        
                        if(!c.getClueFound()){
                            ClueControl gc = new ClueControl();
                            try
                            {
                                gc.AddClueToInvnetory(c);
                                c.setClueFound(true);
                                
                                this.console.println("Added Clue to log: " 
                                        + c.getDescription());
                                
                            }
                            catch(ClueControlException ex){

                                ErrorView.display(this.getClass().getName(), 
                                        "Error adding clue to inventory: " 
                                + ex.toString());  
                            }
                            
                            c.setClueFound(true);
                            
                            location.setScene(sc);
                                                        
                            break;
                        }
                        else
                        {
                            this.console.println("This clue has already"
                                            + " been found and added to your "
                                            + "clue log.");                        
                        }  
                    }
                    
                }
            }
        }catch(Exception ex){
            
            ErrorView.display(this.getClass().getName(), 
                    "Error waiting for enter.");  
        }
        WhereIsMyBone.getCurrentGame().setMap(map);
                
        this.waitForEnter();
    }
    //Rick's
    private void showMap(){        
        MapView mapView = new MapView();        
        try{            
            mapView.displayMap();            
        }catch(MapControlException ex){
            ErrorView.display(this.getClass().getName(), 
                    "Error the Complex Calculation View.");
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }        
    }
    
    private void movePlayer() {        
        //Show the player the map and then prompt so they already have the visual
        //  reference for where they need to move to. 
        this.showMap();        
        MapView mapView = new MapView();
        mapView.display();  
    }
    
    private void showHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    //Rick's
    private void displayComplexCalculationView() {
        try{
            ComplexCalculationView complexCalculationView = new ComplexCalculationView();
            complexCalculationView.display();  
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(), 
                    "Error the Complex Calculation View.");
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void waitForEnter() { 
        this.console.println("Please press <ENTER> to continue.");
        boolean isValidEnter = false;
        String input = null;
        try{
            while (!isValidEnter){
                input = this.keyboard.readLine();
                //Name validation
                if(input.length() >= 0){
                    isValidEnter = true;
                }
                else{
                 this.console.println("Please press <ENTER> to continue.");
                }
                break;
            }            
        }
        catch(IOException ex){            
            ErrorView.display(this.getClass().getName(), 
                    "Error waiting for enter.");                         
        }
    }

    private void displayClueLog() {        
        List<Clue> lC = WhereIsMyBone.getCurrentGame().getClueList();        
        try{
            String str = 
                      "==================================================" +
                    "\n                WHERE IS MY BONE?                 " +
                    "\n                    CLUE LOG                      " +
                    "\n==================================================" +                      
                    "\n                                                  " ;
            this.console.println(str);
            int i = 0;
            for(Clue clue : lC){
                i++;
                String strClue = 
                    " " + i + ") " + clue.getDescription() ;
                this.console.println(strClue);
            }
            this.console.println("\n==========================================="
                    + "=======");
        }catch(Exception ex){
            this.console.println("DEBUG - Error trying to display clue log: " 
                    + ex.toString());            
        } 
    }

    private void showPrintMenu() {        
        PrintMenuView pmv = new PrintMenuView();                
        try{            
            pmv.display();            
        }catch(Exception ex){
            ErrorView.display(this.getClass().getName(), 
                    "Error with Print Menu View.");
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }
}
