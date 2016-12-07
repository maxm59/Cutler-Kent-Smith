package byui.cit260.whereismybone.view;

/**
 *
 * @author Smith-Rick
 * 
 * 12.3.16 Maxi Cutler working on Clue List View
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
                "\n         B   =  View Your Backpack Items          " +        
                "\n         C   =  Clue List                         " +
                "\n         D   =  Clue List Print to File           " + 
                "\n         E   =  Search Location for Clues         " +
                "\n         F   =  Display Map                       " +                         
                "\n         P   =  Print Map to File                 " +                                               
                "\n         M   =  Move Player                       " +
                "\n                                                  " +
                "\n         T   =   Test Complex Calculations        " +
                "\n                                                  " +
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
                this.showBackpackItem();//veiw what is in the backpack
                break;
            case 'C':
                this.showClueList();
                break;
            case 'D':
                this.showPrintClueListToText();
                break;
            case 'E':
                this.searchLocation(); //search location of clues TODO
                break;
            case 'F':
                 this.showMap();
                 break;
            case 'P':  //Print Map to File
                this.printMapToFileView();
                break;
            case 'M':
                this.movePlayer();
                break;
            case 'T': //Temporary display of Complex Calculation for testing
                this.displayComplexCalculationView();
                break;
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
    private void showBackpackItem() {
        this.console.println("TODO need connection and scripting");
    }
    //Maxi's
    private void showClueList() {
        ClueListView clueListView = new ClueListView();
        clueListView.display();
    }
    private void showPrintClueListToText() {
        PrintClueListToText clueListView = new PrintClueListToText();
        clueListView.display();
    }
    
    //Brian's
    private void searchLocation() {
        this.console.println("TODO - Search Location Results");
    }
    //Rick's
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
    
    private void movePlayer() {
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
