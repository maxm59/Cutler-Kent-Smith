package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.exception.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Smith-Rick
 */
public class GameMenuView extends View{

    public GameMenuView(){
        super(
                  "==================================================" +
                "\n                WHERE IS MY BONE?                 " +
                "\n                    GAME MENU                     " +
                "\n==================================================" +                      
                "\n                                                  " +
                "\n         B  =  Backpack Inventory List            " +
                "\n         V  =  View Your Backpack Items           " +        
                "\n         C  =  Clue List                          " +                         
                "\n         D  =  Display Map                        " +                         
                "\n         P  =  Print Map to File                  " +                         
                "\n         H  =  Help Menu                          " +                       
                "\n         M  =  Move Player                        " +
                "\n         S  =  Search Location for Clues          " +
                "\n                                                  " +
                "\n         T =   Test Complex Calculations          " +
                "\n                                                  " +
                "\n         X  =  Exit Game                          " +
                "\n                                                  " +
                "\n         Please make a selection:                 " +
                "\n                                                  ");      
    }

    @Override
    public boolean doAction(String value) {
        
        char charSel = value.toUpperCase().charAt(0);
        
        switch (charSel) { 
            case 'B':
                this.showBackpack();
                break;
            case 'C':
                this.showClues();
                break;
            case 'D':
                this.showMap();
                break;
            case 'H':
                this.showHelpMenu();
                break;
            case 'M':
                this.movePlayer();
                break;
            case 'S':
                this.searchLocation();
                break;
            case 'T': //Temporary display of Complex Calculation for testing
                 this.displayComplexCalculationView();
                 break;
            case 'P': //Print Map to File
                 this.printMapToFileView();
                 break;
            case 'X':
                return true;
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }

    private void showBackpack() {
        BackpackView backpackView = new BackpackView();
        backpackView.display();
    }
 
    private void showClues() {
        this.console.println("TODO - Display Clue List");
    }
    private void showMap(){
        
        MapView mapView = new MapView();
        
        try{
            
            mapView.displayMap(); 
            
        }catch(Exception ex)
        {
            ErrorView.display(this.getClass().getName(), 
                    "Error the Complex Calculation View.");
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }    
    private void showHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    private void movePlayer() {
        MapView mapView = new MapView();
        mapView.display();  
    }
    private void searchLocation() {
        this.console.println("TODO - Search Location Results");
    }
    private void displayComplexCalculationView() {
        try{

            ComplexCalculationView complexCalculationView = new ComplexCalculationView();
            complexCalculationView.display();
  
        }
        catch(Exception ex)
        {
            ErrorView.display(this.getClass().getName(), 
                    "Error the Complex Calculation View.");
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
    
    }

    private void printMapToFileView() {
        
        PrintMapToFileView pm = new PrintMapToFileView();   

        try{
            
            pm.display();

        }catch (Exception ex)
        {
            ErrorView.display(this.getClass().getName(), "Error: Problem with print"
                    + "map to file view.");
        }

    }
}
